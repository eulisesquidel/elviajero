package com.bdb.struts.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Session;
import net.sf.hibernate.SessionFactory;
import net.sf.hibernate.Transaction;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.util.RequestUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.bdb.conexion.AdmConexiones;
import com.bdb.conexion.Conexion;
import com.bdb.model.security.User;
import com.bdb.util.HttpUtils;

import fr.improve.struts.taglib.layout.util.FormUtils;

public class BDBDispatchAction extends DispatchAction {
    private static final Logger log;
    
    static  {
        log = Logger.getLogger(com.bdb.struts.actions.BDBDispatchAction.class);
    }
    
    public BDBDispatchAction() {
    }
    
    public Session getHibernateSession(HttpServletRequest request) throws HibernateException {
        log.debug("getting hibernateSession");
        HttpSession httpSession = request.getSession();
        //Session session = (Session)httpSession.getAttribute("bdb.action.hibSession");
        Session session=null; 
        Transaction transaction = (Transaction)httpSession.getAttribute("bdb.action.hibTransaction");
        if(session == null) {
            log.debug("getting hibernateSession from Factory");
            SessionFactory sessionFactory = (SessionFactory)servlet.getServletContext().getAttribute("hibernateSessionFactory");
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            log.debug("setting hibernateSession and transaction in HttpSession");
            httpSession.setAttribute("bdb.action.hibSession", session);
            httpSession.setAttribute("bdb.action.hibTransaction", transaction);
            httpSession.setAttribute("bdb.action.conexiones", cargarConexionesdelAmbiente(session));
            
        }
        session.clear(); // Limpiamos la session Hibernate -- borramos los datos que se encuentran en la caye de datos
        return session;
    }

    public void disposeSession(HttpServletRequest request) throws HibernateException {
        log.debug("disposing");
        HttpSession httpSession = request.getSession();
        Session session = (Session)httpSession.getAttribute("bdb.action.hibSession");
        boolean rollBackOnly = isRollBackOnly(request);
        Transaction transaction = (Transaction)httpSession.getAttribute("bdb.action.hibTransaction");
        if(session == null)
            return;
        if(rollBackOnly)
            try {
                log.debug("rolling back");
                if(transaction != null)
                    transaction.rollback();
            }
            catch(HibernateException e) {
                log.error("error during rollback (Hibernate)", e);
            }
            finally {
                session.close();
                session = null;
                transaction = null;
                log.debug("returning session");
                httpSession.setAttribute("bdb.action.hibSession", null);
                httpSession.setAttribute("bdb.action.hibTransaction", null);
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
                log.debug("returning session");
                httpSession.setAttribute("bdb.action.hibSession", null);
                httpSession.setAttribute("bdb.action.hibTransaction", null);
            }
    }

    public boolean isRollBackOnly(HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        Boolean rollBackOnly = (Boolean)httpSession.getAttribute("bdb.action.rollBackOnly");
        if(rollBackOnly == null) {
            rollBackOnly = Boolean.FALSE;
            setRollBackOnly(request, false);
        }
        return rollBackOnly.booleanValue();
    }

    public void setRollBackOnly(HttpServletRequest request, boolean aRollBackOnly) {
        HttpSession httpSession = request.getSession();
        // Boolean rollBackOnly = (Boolean)httpSession.getAttribute("bdb.action.rollBackOnly");
        httpSession.setAttribute("bdb.action.rollBackOnly", Boolean.valueOf(aRollBackOnly));
    }

    public ActionForward create(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        if (response.equals(new String("A"))) {}
        log.debug("create++");
        form.reset(mapping, request);
        log.debug("Seteando en modo CREATE");
        FormUtils.setFormDisplayMode(request, form, 0);
		//RequestUtils.createActionForm(request,form,null,null);
        log.debug("create--");
        return mapping.findForward("success");
    }

    public ActionForward edit(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
        if (response.equals(new String("A"))) {}
        log.debug("edit++");
        log.debug("Seteando en modo EDIT");
        FormUtils.setFormDisplayMode(request, form, 1);
        log.debug("edit--");
        return mapping.findForward("success");
    }

    public ActionForward save(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
        log.debug("save++");
        ActionErrors errors = form.validate(mapping, request);
        setActionErrors(request, errors);
        if(!errors.isEmpty())
            setActionErrors(request, errors);
        ActionForward retorno = saveProcess(mapping, form, request, response, false);
        setActionErrors(request, null);
        return retorno;
    }

    public ActionForward saveNew(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
        log.debug("saveNew++");
        ActionErrors errors = form.validate(mapping, request);
        setActionErrors(request, errors);
        if(!errors.isEmpty())
            setActionErrors(request, errors);
        ActionForward retorno = saveProcess(mapping, form, request, response, true);
        setActionErrors(request, null);
        return retorno;
    }

    public ActionForward saveProcess(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response, boolean isNew) throws HibernateException {
        if (form.equals(new String("A"))) {}
		if (response.equals(new String("A"))) {}
		if (request.equals(new String("A"))) {}
		if (isNew) {}
        return mapping.findForward("success");
    }

    public ActionForward inspect(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
        if (response.equals(new String("A"))) {}
        log.debug("inspect++");
        log.debug("Seteando en modo INSPECT");
        FormUtils.setFormDisplayMode(request, form, 2);
        log.debug("inspect--");
        return mapping.findForward("success");
    }
	
    public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
        if (form.equals(new String("A"))) {}
		if (response.equals(new String("A"))) {}
		if (request.equals(new String("A"))) {}
        log.debug("delete++");
        log.debug("delete--");
        return mapping.findForward("find");
    }

    public final Object getNestedAttribute(HttpServletRequest request, ActionMapping mapping, String attributeName) {
        return HttpUtils.getNestedAttribute(request, mapping, attributeName);
    }

    public ActionErrors getActionErrors(HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        ActionErrors actionErrors = (ActionErrors)httpSession.getAttribute("bdb.action.actionErrors");
        if(actionErrors == null)
            setActionErrors(request, new ActionErrors());
        return actionErrors;
    }

    public void setActionErrors(HttpServletRequest request, ActionErrors errors) {
        if(errors == null)
            errors = new ActionErrors();
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("bdb.action.actionErrors", errors);
    }

    public ActionForward list(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        if (form.equals(new String("A"))) {}
		if (response.equals(new String("A"))) {}
		if (request.equals(new String("A"))) {}
        log.debug("list++");
        log.debug("list--");
        return mapping.findForward("success");
    }

    public ActionForward generate(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        if (form.equals(new String("A"))) {}
        if (response.equals(new String("A"))) {}
        if (request.equals(new String("A"))) {}
        return mapping.findForward("findData");
    }
    
    
    private AdmConexiones cargarConexionesdelAmbiente( Session psession ){
    	// Obtenemos las informaciones de conexiones de acuerdo al ambiente
    	// que se este ejecutando
    	System.out.println( super.getServlet().getServletContext().getAttribute("Ambiente"));
    	String ambiente=(String) super.getServlet().getServletContext().getAttribute("Ambiente"); 
    	AdmConexiones conexiones = new AdmConexiones(psession,ambiente);
    	return conexiones;
    }
    
    
    public Conexion obtenerConexionparaJDBC(String nombreConexion,HttpServletRequest  request){
    	try {
			getHibernateSession(request);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		HttpSession httpSession = request.getSession();
    	// Obtenemos la conexion solicitada para el ambiente en ejecución
    	AdmConexiones conexiones = (AdmConexiones) httpSession.getAttribute("bdb.action.conexiones");
    	return conexiones.getConexion(nombreConexion);
    }
    
    public User getUsuario(HttpServletRequest  request){
    	return (User)request.getSession().getAttribute("bdbUser");	
    }
    
    
    public Object getBean(HttpServletRequest request, String nombreBean)  {
    	log.debug("getBean");
    	ApplicationContext applicationContext =(ApplicationContext) this.servlet.getServletContext().getAttribute("applicationContext");
    	return applicationContext.getBean(nombreBean);
    }
    
    
    public   void beginTransactionSpring(HttpServletRequest request)  {
    	log.debug("begintransaccion++");
		HibernateTransactionManager txManager =(HibernateTransactionManager) getBean(request,"txManager");
		DefaultTransactionDefinition mySettings = new DefaultTransactionDefinition();
		//mySettings.setPropagationBehavior(DefaultTransactionDefinition.PROPAGATION_MANDATORY); 
		TransactionDefinition midef= new DefaultTransactionDefinition();
		request.setAttribute("Transaction_status", txManager.getTransaction(midef));
    }
    
    
    public   void rollbackTransactionSpring(HttpServletRequest request)  {
    	log.debug("rollbackTransactionSpring++");
		HibernateTransactionManager txManager =(HibernateTransactionManager) getBean(request,"txManager");
		txManager.rollback((TransactionStatus)request.getAttribute("Transaction_status"));
		log.debug("rollbackTransactionSpring--");		
    }    
    
    
    
    public void  commitTransactionSpring( HttpServletRequest request)  {
    	log.debug("commitTransactionSpring++");
    	TransactionStatus status = (TransactionStatus) request.getAttribute("Transaction_status");
    	HibernateTransactionManager txManager =(HibernateTransactionManager) getBean(request,"txManager");
    	txManager.setTransactionSynchronization(HibernateTransactionManager.SYNCHRONIZATION_ON_ACTUAL_TRANSACTION);
    	txManager.commit(status);  
    	txManager.setTransactionSynchronization(HibernateTransactionManager.SYNCHRONIZATION_ALWAYS);
		log.debug("commitTransactionSpring--");
		 
    }
    
    public void  roolbackTransactionSpring( HttpServletRequest request)  {
    	log.debug("roolbackTransactionSpring++");
    	TransactionStatus status = (TransactionStatus) request.getAttribute("Transaction_status");
    	HibernateTransactionManager txManager =(HibernateTransactionManager) getBean(request,"txManager");
    	txManager.rollback(status);
		log.debug("roolbackTransactionSpring--");
    }    
    
    
}