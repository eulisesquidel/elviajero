package com.slort.struts.action;

// Log4j Imports
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class UnderConstAction extends Action {
    private static final Logger log;

    static  {
        log = Logger.getLogger(com.slort.struts.action.UnderConstAction.class);
    }
	
    public UnderConstAction() {
        log.debug("UnderConstAction Inicio");
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return mapping.findForward("underConst");
    }
}