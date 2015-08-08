package com.bdb.struts.action;

import org.apache.log4j.Logger;
import org.apache.struts.action.ExceptionHandler;

public class BDBExceptionHandler extends ExceptionHandler {
    private static final Logger log;

    static  {
        log = Logger.getLogger(com.bdb.struts.action.BDBExceptionHandler.class);
    }
	
    public BDBExceptionHandler() {
        log.debug("BDBExceptionHandler");
    }
}