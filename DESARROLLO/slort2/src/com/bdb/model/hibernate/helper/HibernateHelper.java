package com.bdb.model.hibernate.helper;

import javax.servlet.http.HttpServletRequest;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Session;
import net.sf.hibernate.SessionFactory;
import net.sf.hibernate.Transaction;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionMapping;

import com.bdb.util.HttpUtils;

public class HibernateHelper {
    private static final Logger log;

    static  {
        log = Logger.getLogger(com.bdb.model.hibernate.helper.HibernateHelper.class);
    }
    
    public HibernateHelper() {
    }

    public Object getObjectById(HttpServletRequest request, Session hibSession, ActionMapping mapping, Class theClass, Long attributeId) throws HibernateException {
        if (request.equals(new String("A"))) {}
		if (mapping.equals(new String("A"))) {}
        return hibSession.load(theClass, attributeId);
    }

    public Object getObjectById(HttpServletRequest request, ActionMapping mapping, Class theClass, Long attributeId) {
        log.debug("getObjectById++");
        Object retorno = null;
        Session hibSession = null;
        Transaction transaction = null;
        try {
            SessionFactory sessionFactory = (SessionFactory)request.getSession().getServletContext().getAttribute("hibernateSessionFactory");
            hibSession = sessionFactory.openSession();
            transaction = hibSession.beginTransaction();
            retorno = getObjectById(request, hibSession, mapping, theClass, attributeId);
        }
        catch(HibernateException e) {
            log.error("Error en hibernate", e);
        }
        catch(NullPointerException e) {
            log.debug("Identificador NULO - return NULL");
        }
        finally {
            try {
                try {
                    log.debug("finalizing the transaction");
                    if(transaction != null)
                        transaction.rollback();
                }
                catch(HibernateException e) {
                    log.error("error during finalizing", e);
                    transaction.rollback();
                    throw e;
                }
                finally {
                    hibSession.close();
                    hibSession = null;
                    transaction = null;
                }
            }
            catch(HibernateException e) {
                log.error("Error en dispose session", e);
            }
        }
        log.debug("getObjectById--");
        return retorno;
    }

    public Object getObjectById(HttpServletRequest request, ActionMapping mapping, Class theClass, String attributeId) {
        Long id = Long.valueOf((String)HttpUtils.getNestedAttribute(request, mapping, attributeId));
        return getObjectById(request, mapping, theClass, id);
    }
}