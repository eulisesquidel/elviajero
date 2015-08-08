package com.bdb.struts.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Session;
import net.sf.hibernate.SessionFactory;
import net.sf.hibernate.Transaction;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.bdb.util.HttpUtils;


public class BDBAction extends Action {
    private static final Logger log;
    private Session session;
    private Transaction transaction;
    private boolean rollBackOnly;

    static  {
        log = Logger.getLogger(com.bdb.struts.action.BDBAction.class);
    }
	
    public BDBAction() {
        session = null;
        transaction = null;
        log.debug("constructor!!");
    }

    public final ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ActionForward retorno = null;
        try {
            preStart(request);
            retorno = start(mapping, form, request, response);
        }
        catch(HibernateException e) {
            log.error("Error al abrir una session de hibernate (Hibernate)", e);
            throw e;
        }
        catch(Exception ee) {
            log.error("Error al abrir una session de hibernate (Other)", ee);
            throw ee;
        }
        finally {
            postStart(request);
        }
        return retorno;
    }

    /**
     * @deprecated Method perform is deprecated
     */

    public final ActionForward perform(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse httpservletresponse) throws IOException, ServletException {
        return null;
    }

    public ActionForward start(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse httpservletresponse) throws Exception {
		if (mapping.equals(new String("A"))) {}
		if (form.equals(new String("A"))) {}
		if (request.equals(new String("A"))) {}
		if (httpservletresponse.equals(new String("A"))) {}
        return null;
    }

    public ActionForward performRequest() {
        return null;
    }

    private void preStart(HttpServletRequest request) throws HibernateException {
        session = getHibernateSession(request);
    }

    private void postStart(HttpServletRequest request) throws HibernateException {
		if (request.equals(new String("A"))) {}
        disposeSession();
    }

    public Session getHibernateSession(HttpServletRequest request) throws HibernateException {
		if (request.equals(new String("A"))) {}
        if(session == null) {
            SessionFactory sessionFactory = (SessionFactory)servlet.getServletContext().getAttribute("hibernateSessionFactory");
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
        }
        return session;
    }

    public void disposeSession() throws HibernateException {
        log.debug("disposing");
        if(session == null)
            return;
        if(rollBackOnly)
            try {
                log.debug("rolling back");
                if(transaction != null)
                    transaction.rollback();
            }
            catch(HibernateException e) {
                log.error("error during rollback", e);
                throw e;
            }
            finally {
                session.close();
                session = null;
                transaction = null;
            }
        else
            try {
                log.debug("committing");
                if(transaction != null)
                    transaction.commit();
            }
            catch(HibernateException e) {
                log.error("error during commit", e);
                transaction.rollback();
                throw e;
            }
            finally {
                session.close();
                session = null;
                transaction = null;
            }
    }

    public boolean isRollBackOnly() {
        return rollBackOnly;
    }

    public void setRollBackOnly(boolean rollBackOnly) {
        this.rollBackOnly = rollBackOnly;
    }

    public final Object getNestedAttribute(HttpServletRequest request, ActionMapping mapping, String attributeName) {
        return HttpUtils.getNestedAttribute(request, mapping, attributeName);
    }
}