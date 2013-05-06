package com.vrp.jb2.services.sforce;

import com.sforce.soap.enterprise.EnterpriseConnection;
import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.sobject.SObject;
import com.sforce.soap.services.SOAPConnectionService;
import com.sforce.ws.ConnectionException;

import javax.faces.bean.ManagedProperty;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Base for soap services working with Salesforce.
 */
public abstract class BaseSOAPService{

    @ManagedProperty(value = "#{soapConnectionService}")
    private SOAPConnectionService connectionService;

    /**
     * Return soap connector connection to salesforce.
     *
     * @return soap connector connection to salesforce.
     */
    public SOAPConnectionService getConnectionService() {
        return connectionService;
    }

    /**
     * Set soap connector connection to salesforce.
     *
     * @param connectionService soap connector connection to salesforce.
     */
    public void setConnectionService(SOAPConnectionService connectionService) {
        this.connectionService = connectionService;
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

    protected SObject[] executeQuery(String query) {
        try {
            QueryResult queryResult = getConnection().query(query);
            return queryResult.getRecords();
        } catch (ConnectionException e) {
            //todo move to log
            e.printStackTrace();
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    protected <T extends SObject> T getElementByParam(String queryPattern, String whereSqlPattern,Class<T> type, Object... params){
        if (params == null) {
            return null;
        }

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

    @SuppressWarnings("unchecked")
    protected <T extends SObject> List<T> getListElementsByParam(String queryPattern, String whereSqlPattern, Class<T> type, Object... params){
        if (params == null) {
            return new ArrayList<T>();
        }
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

}
