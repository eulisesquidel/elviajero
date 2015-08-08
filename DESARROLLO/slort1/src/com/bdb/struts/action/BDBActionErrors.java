package com.bdb.struts.action;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionErrors;

public class BDBActionErrors extends ActionErrors {
    private static final Logger log;

    static  {
        log = Logger.getLogger(com.bdb.struts.action.BDBActionErrors.class);
    }
    
    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;

    public BDBActionErrors() {
        log.debug("BDBActionErrors");
    }

    public BDBActionErrors(ActionErrors arg0) {
        super(arg0);
    }
}