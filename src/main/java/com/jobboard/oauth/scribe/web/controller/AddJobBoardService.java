package com.jobboard.oauth.scribe.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.jobboard.dns.dnsme.G2ADNSMadeEasy;
import com.jobboard.model.EntityManagerProvider;
import com.jobboard.model.heroku.Candidate;
import com.jobboard.model.heroku.SFOrg;

@Controller
public class AddJobBoardService {

	@RequestMapping(value = { "/addJobBoard/{name}+{orgID}" }, method = RequestMethod.GET)
	public void add(@PathVariable String name, @PathVariable String orgID,
			WebRequest request, HttpServletResponse response,
			HttpSession session) {

		try {
			G2ADNSMadeEasy dns = new G2ADNSMadeEasy();

			String orgName = findOrgName(orgID);
			String boardDomain = null;
			if (orgName != null) {
				boardDomain = dns.createBoardDomain(orgName, name);
			}

			PrintWriter out;
			try {
				response.setContentType("text/html");
				out = response.getWriter();
				if (null != boardDomain) {
					out.println(boardDomain);
				} else {
					out.println("null");
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public String findOrgName(String orgID) {
		EntityManager em = EntityManagerProvider.createHerokuEntityManager();
		CriteriaQuery<SFOrg> c = em.getCriteriaBuilder().createQuery(
				SFOrg.class);
		Root<SFOrg> sfORG = c.from(SFOrg.class);
		Predicate predicateEmail = em.getCriteriaBuilder().equal(
				sfORG.get("sfOrgId"), orgID);
		c.where(predicateEmail);
		List<SFOrg> resultList = em.createQuery(c).getResultList();
		if (resultList.size() > 0) {
			return resultList.get(0).getOrgUrl();
		} else
			return null;
	}

}
