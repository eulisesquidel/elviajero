package com.bdb.struts.action;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.SessionFactory;
import net.sf.hibernate.cfg.Configuration;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionServlet;
import org.springframework.context.ApplicationContext;

public class BDBActionServlet extends ActionServlet {
	
    private static final Logger log;
    private SessionFactory sessionFactory;

    static  {
        log = Logger.getLogger(com.bdb.struts.action.BDBActionServlet.class);
    }
	
    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;

    public void init() throws ServletException 
    {
        
    	log.debug("Inicializando Hibernate");
        try {
            initHibernate();
            ServletContext servletContext = getServletContext();
            servletContext.setAttribute("hibernateSessionFactory", sessionFactory);
            log.debug("Hibernate inicializado correctamente");
        }
        catch(HibernateException e) {
            log.error("Error en inicializacion de hibernate", e);
        }
        super.init();
    }

    public void destroy() {
        try {
            sessionFactory.close();
        }
        catch(Exception e) {
            log.error("error closing", e);
        }
        super.destroy();
    }

    public BDBActionServlet() {
        log.debug("BDBActionServlet");
    }

    private void initHibernate() throws HibernateException {
        sessionFactory = (new Configuration()).configure().buildSessionFactory();
    }
    

  
    
}