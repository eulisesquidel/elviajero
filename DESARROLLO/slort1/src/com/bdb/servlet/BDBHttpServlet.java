package com.bdb.servlet;

import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;

public class BDBHttpServlet extends HttpServlet {
    /**
     * Comment for <code>serialVersionUID</code>
     */
	
	private static final Logger log;

    static  {
		
        log = Logger.getLogger(com.bdb.servlet.BDBHttpServlet.class);
    }
    
    private static final long serialVersionUID = 1L;

    public BDBHttpServlet() {
        log.debug("BDBHttpServlet");
    }


}