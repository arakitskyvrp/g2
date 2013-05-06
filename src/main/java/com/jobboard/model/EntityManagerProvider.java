package com.jobboard.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.persistence.jpa.JpaEntityManager;
import org.eclipse.persistence.sessions.UnitOfWork;
import org.eclipse.persistence.sessions.server.ClientSession;
import org.eclipse.persistence.sessions.server.ServerSession;

import com.jobboard.controller.Config;

public class EntityManagerProvider {

	public static EntityManager createEntityManager(
			final String persistenceUnitName) {
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence
					.createEntityManagerFactory(persistenceUnitName);
			if (entityManagerFactory != null) {
				entityManager = entityManagerFactory.createEntityManager();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entityManager;
	}

	public static EntityManager createHerokuEntityManager() {
		return createEntityManager(Config.PERSISTENCE_UNIT_NAME_HEROKU);
	}

	public static EntityManager createSfdcEntityManager() {
		return createEntityManager(Config.PERSISTENCE_UNIT_NAME_SFDC);
	}

	public static UnitOfWork acquireUnitOfWork(final EntityManager entityManager) {
		UnitOfWork unitOfWork = null;
		Object delegate = entityManager.getDelegate();
		if (delegate != null && delegate instanceof JpaEntityManager) {
			ServerSession serverSession = ((JpaEntityManager) delegate)
					.getServerSession();
			if (serverSession != null) {
				ClientSession clientSession = serverSession
						.acquireClientSession();
				if (clientSession != null) {
					unitOfWork = serverSession.acquireUnitOfWork();
				}
			}
		}
		return unitOfWork;

	}

}
