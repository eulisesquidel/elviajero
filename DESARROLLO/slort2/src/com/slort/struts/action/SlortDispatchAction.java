package com.slort.struts.action;

// BDB Imports
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.bdb.struts.actions.BDBDispatchAction;

/**
 * @author Diego
 */
public class SlortDispatchAction extends BDBDispatchAction {

    public SlortDispatchAction() {
    }

    public ActionForward execute(ActionMapping in_mapping, ActionForm in_form, HttpServletRequest in_request, HttpServletResponse in_response) throws Exception {
        String lc_parameterName = in_mapping.getParameter();
        if(lc_parameterName != null) {
            String lc_methodName = in_request.getParameter(lc_parameterName);
            if(lc_methodName != null && ("execute".equals(lc_methodName) || "perform".equals(lc_methodName)))
                throw new IllegalArgumentException("illegal parameter");
        }
        return super.execute(in_mapping, in_form, in_request, in_response);
    }

	  protected Long getSelectedId(com.slort.struts.action.ActionForm form, Long defaultValue) {
	        return form.getSelectedId() != null ? form.getSelectedId() : defaultValue;
	    }
}