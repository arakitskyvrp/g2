package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.EnterpriseConnection;
import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.SaveResult;
import com.sforce.soap.enterprise.sobject.SObject;
import com.sforce.soap.services.SOAPConnectionService;
import com.sforce.ws.ConnectionException;
import org.apache.log4j.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Base for soap service for working with Salesforce.
 *
 * @author alexandr.rakitsky@vrpinc.com
 */
@ManagedBean(name = "salesForceManager")
@SessionScoped
public class SalesForceManager {

    private static final Logger LOG = Logger.getLogger(SalesForceManager.class);

    @ManagedProperty(value = "#{soapConnectionService}")
    private SOAPConnectionService connectionService;

    /**
     * Return soap connector connection to salesforce.
     *
     * @return soap connector connection to salesforce.
     */
    private SOAPConnectionService getConnectionService() {
        return connectionService;
    }

    /**
     * Causes the soap request query and checks the result is not an empty.
     *
     * @param queryPattern    query pattern, see #buildSqlQuery
     * @param whereSqlPattern where pattern, see #buildSqlQuer
     * @param params          query params, see #buildSqlQuer
     * @return {@code true} if result is not an empty.
     * @see #buildSqlQuery(String, String, Object...)
     */
    public boolean isNotNullResult(String queryPattern, String whereSqlPattern, Object... params) {
        String query = buildSqlQuery(queryPattern, whereSqlPattern, params);
        SObject[] records = executeQuery(query);
        return (records != null && records.length > 0);
    }

    @SuppressWarnings("unchecked")
    public <T extends SObject> T getElementByParam(String queryPattern, String whereSqlPattern, Class<T> type, Object... params) {

        String query = buildSqlQuery(queryPattern, whereSqlPattern, params);

        SObject[] records = executeQuery(query);
        if (records != null && records.length > 0) {
            SObject record = records[0];
            if (type.isInstance(record)) {
                return (T) record;
            }
        }
        return null;
    }

    /**
     * Get list elements from salesforce.
     *
     * @param queryPattern query pattern, see #buildSqlQuery.
     * @param type         type of result
     * @param <T>          query result class.
     * @return list
     * @see #buildSqlQuery(String, String, Object...)
     */
    public <T extends SObject> List<T> getListElements(String queryPattern, Class<T> type) {
        return getListElementsByParam(queryPattern, "", type);
    }

    /**
     * @param queryPattern    query pattern, see #buildSqlQuery.
     * @param whereSqlPattern where pattern, see #buildSqlQuery.
     * @param type            type of result.
     * @param params          query params, see #buildSqlQuery.
     * @param <T>             query result class.
     * @return request to salesforce result list
     */
    @SuppressWarnings("unchecked")
    public <T extends SObject> List<T> getListElementsByParam(String queryPattern, String whereSqlPattern, Class<T> type, Object... params) {
        List<T> resultList = new ArrayList<T>();

        String query = buildSqlQuery(queryPattern, whereSqlPattern, params);

        SObject[] records = executeQuery(query);
        if (records != null) {
            for (SObject sObject : records) {
                if (type.isInstance(sObject)) {
                    resultList.add((T) sObject);
                }
            }
        }
        return resultList;
    }

    /**
     * Save object to salesforce.
     *
     * @param sObject salesforce object.
     * @param <T>     salesforce class.
     * @return salesforce object with id.
     */
    public <T extends SObject> T saveToSalesforce(T sObject) {
        SObject[] sObjects = new SObject[1];
        sObjects[0] = sObject;
        try {
            SaveResult[] create = getConnection().create(sObjects);
            if (create != null && create.length > 0) {
                if (create[0].isSuccess()) {
                    sObject.setId(create[0].getId());
                    return sObject;
                }
            }
        } catch (ConnectionException e) {
            LOG.error("Failed to save the object :: " + sObject, e);
        }
        return null;
    }

    /**
     * Update objects on salesforce.
     *
     * @param sObjects sf objects.
     * @return {@code true} if all objects updates success.
     */
    public boolean updateListToSalesforce(SObject[] sObjects) {
        // update the records in Salesforce.com
        boolean isSuccess = true;
        try {
            SaveResult[] saveResults = getConnection().update(sObjects);
            if (null == saveResults) {
                return false;
            }
            for (SaveResult saveResult : saveResults) {
                isSuccess = isSuccess && saveResult.isSuccess();
            }
        } catch (ConnectionException e) {
            LOG.error("Can't update list object on salesforce, sObjects :: " + Arrays.toString(sObjects));
            isSuccess = false;
        }
        return isSuccess;
    }

    /**
     * Building a sql query consisting of a main part, where part of the query and parameters.
     * <p/>
     * <b>Pay attention to that single quotes are erased. For single quotes to use two single quotes -''.</b>
     * Example:
     * queryPattern = "Select * from users {0} order by name"
     * whereSqlPattern = "user id = ''{0}''"
     * params = "104s"
     * return : "Select * from users user id = '104s' order by name"
     *
     * @param queryPattern    main part of sql
     * @param whereSqlPattern where part of sql
     * @param params          sql params
     * @return sql query
     */
    String buildSqlQuery(String queryPattern, String whereSqlPattern, Object... params) {
        String whereQuery = MessageFormat.format(whereSqlPattern, params);
        return MessageFormat.format(queryPattern, whereQuery);
    }

    private EnterpriseConnection getConnection() {
        return getConnectionService().getEnterpriseConnection();
    }

    private SObject[] executeQuery(String query) {
        try {
            QueryResult queryResult = getConnection().query(query);
            return queryResult.getRecords();
        } catch (ConnectionException e) {
            LOG.error("Not execute the query :: " + query, e);
        }
        return null;
    }

}
