package com.bdb.model.hibernate.helper;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Query;
import net.sf.hibernate.Session;

import org.apache.log4j.Logger;

import com.bdb.util.SQLUtils;

public class FindDataObjectSet {
    private static final Logger log;
    private String query;
    private String selectElements;
    private String groupByClause;
    private String orderByClause;
    private String fromClause;

    static  {
        log = Logger.getLogger(com.bdb.model.hibernate.helper.FindDataObjectSet.class);
    }
	
    public FindDataObjectSet() {
        selectElements = " object ";
        groupByClause = null;
        orderByClause = null;
        fromClause = null;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String string) {
        query = string;
    }

    public Object getFirstDataObject(Session hibernateSession, String objectName, Vector arguments) {
        List list = getDataObjectSet(hibernateSession, objectName, arguments);
        return list != null && list.size() != 0 ? list.get(0) : null;
    }

    public List getDataObjectSet(Session hibernateSession, String objectName, Vector arguments) 
	{
        List retorno = null;
        log.debug("getDataObjectSet++");
        try {
            log.debug("Buscando objectos de tipo: " + objectName);
            StringBuffer queryString = new StringBuffer();
            queryString.append("select ");
            queryString.append(getSelectElements());
            queryString.append(" from ");
            if(getFromClause() != null) {
                queryString.append(getFromClause());
            } else {
                queryString.append(objectName);
                queryString.append(" as object ");
            }
            StringBuffer whereClause = null;
            log.debug("Generando argumentos");
            if(arguments != null) {
                for(int i = 0; i < arguments.size(); i++) {
                    Object elements[] = (Object[])arguments.get(i);
                    String key = (String)elements[0];
                    String operator = (String)elements[1];
                    Object value = elements[2];
                    if(whereClause == null) {
                        whereClause = new StringBuffer();
                        whereClause.append(" where ");
                    } else {
                        whereClause.append(" and ");
                    }
                    log.debug(" object." + key + operator + value);
                    whereClause.append("object.");
                    whereClause.append(key);
                    whereClause.append(operator);
                    if(operator.equals(" IN ") || operator.equals(" NOT IN "))
                        whereClause.append(" (:list" + i + ") ");
                    else
                    if(!operator.equals(" is null ") && !operator.equals(" is not null "))
                        whereClause.append("?");
                }

            }
            if(whereClause != null) {
                log.debug("whereClause=" + whereClause.toString());
                queryString.append(whereClause.toString());
            }
            if(getGroupByClause() != null) {
                queryString.append(" group by ");
                queryString.append(getGroupByClause());
            }
            if(getOrderByClause() != null) {
                queryString.append(" order by ");
                queryString.append(getOrderByClause());
            }
            Query query2 = hibernateSession.createQuery(queryString.toString());
            setArguments(query2, arguments);
            retorno = query2.list();
            log.debug("" + retorno.size() + " " + objectName + " found");
        }
        catch(HibernateException e) {
            log.error("Hibernate error on BDB FindDataObjectSet", e);
        }
        setOrderByClause(null);
        setGroupByClause(null);
        log.debug("getDataObjectSet--");
        return retorno;
    }

    public List executeQuery(Session hibernateSession, String queryString, Vector arguments) {
        List retorno = null;
        log.debug("executeQuery++");
        try {
            Query query = hibernateSession.createQuery(queryString);
            setArguments(query, arguments);
            retorno = query.list();
        }
        catch(HibernateException e) {
            log.error("Hibernate error on BDB executeQuery", e);
        }
        log.debug("executeQuery--");
        return retorno;
    }

    private void setArguments(Query query, Vector arguments) throws HibernateException {
        if(arguments != null) {
            for(int i = 0; i < arguments.size(); i++) {
                Object elements[] = (Object[])arguments.get(i);
                Byte type = (Byte)elements[3];
                Object value = elements[2];
                String operator = (String)elements[1];
                if(!operator.equals(" is null ") && !operator.equals(" is not null "))
                    if(type.equals(SQLUtils.QUERY_DATATYPE_STRING))
                        query.setString(i, value.toString());
                    else
                    if(type.equals(SQLUtils.QUERY_DATATYPE_INTEGER))
                        query.setInteger(i, ((Integer)value).intValue());
                    else
                    if(type.equals(SQLUtils.QUERY_DATATYPE_LONG)) {
                        query.setLong(i, ((Long)value).longValue());
                    } else
                    if(type.equals(SQLUtils.QUERY_DATATYPE_ARRAY))
                        query.setParameterList("list" + i, (Collection)value);
                    else
                    if(type.equals(SQLUtils.QUERY_DATATYPE_DATE))
                        query.setDate(i, (Date)value);
                	if(type.equals(SQLUtils.QUERY_DATATYPE_BOOLEAN))
                		query.setBoolean(i, ((Boolean)value).booleanValue());                
            }

        }
    }

    public String getGroupByClause() {
        return groupByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public String getSelectElements() {
        return selectElements;
    }

    public void setGroupByClause(String string) {
        groupByClause = string;
    }

    public void setOrderByClause(String string) {
        orderByClause = string;
    }

    public void setSelectElements(String string) {
        selectElements = string;
    }

    public String getFromClause() {
        return fromClause;
    }

    public void setFromClause(String string) {
        fromClause = string;
    }
}