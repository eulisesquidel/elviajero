package com.slort.struts.action;

// Log4j Imports
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdb.struts.action.BDBActionServlet;

/**
 * @author Eulises
 */
public class SlortActionServlet extends BDBActionServlet {

	private static ApplicationContext applicationContext;
    private static final Logger log;
    
    static  {
        log = Logger.getLogger(com.slort.struts.action.SlortActionServlet.class);
    }
    
    public SlortActionServlet() {
    	super();    	
    }

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		initSpring();
		System.out.println(this.getInitParameter("Ambiente"));
		this.getServletContext().setAttribute("Ambiente",this.getInitParameter("Ambiente"));
	}
	
	
    private void initSpring() {
		// TODO Auto-generated method stub
		applicationContext = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		ServletContext servletContext = getServletContext();
        servletContext.setAttribute("applicationContext", applicationContext);
        log.debug("Spring Hibernate inicializado correctamente");
		return;
    }
    
}
    
