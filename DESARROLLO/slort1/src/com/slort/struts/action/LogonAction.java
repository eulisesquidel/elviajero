package com.slort.struts.action;

// Log4j Imports
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.bdb.model.hibernate.helper.FindDataObjectSet;
import com.bdb.util.SQLUtils;
import com.slort.model.security.OpcionMenu;
import com.slort.model.security.Users;
import com.slort.struts.form.LogonForm;

public class LogonAction extends Action {

    public ActionForward start(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LogonForm logonForm = (LogonForm)form;
        // Locale locale = getLocale(request);
        // MessageResources messages = getResources(request);
        ActionErrors errors = new ActionErrors();
        String username = logonForm.getUsername();  
        String password = logonForm.getPassword();
        net.sf.hibernate.Session hibSession = getHibernateSession(request);
        Vector arguments = new Vector(1);
        arguments.add((new Object[] {
            "usuario", " = ", username, SQLUtils.QUERY_DATATYPE_STRING
        }));
        FindDataObjectSet findDataSet = new FindDataObjectSet();
        Users user = (Users)findDataSet.getFirstDataObject(hibSession, "Users", arguments);
        if(username == null || "".equals(username) || password == null || "".equals(password) || user == null || !user.getPwd().equals(password))
            errors.add("org.apache.struts.action.GLOBAL_ERROR", new ActionError("message.logon.nouser"));
        logonForm.reset(mapping, request);
        if(!errors.isEmpty()) {
            saveErrors(request, errors);
            return new ActionForward(mapping.getInput());
        }
        
        HttpSession session = request.getSession();
        logonForm.setGrupo(user.getGrupo().toString());
        //TreeSet<OpcionMenu> omd_ord=new TreeSet<OpcionMenu>(user.getGrupo().getOpcionesmenues()); 
        Set<OpcionMenu> oms=user.getGrupo().getOpcionesmenues();
        
        
        session.setAttribute("grupo", user.getGrupo());
        session.setAttribute("opcionesMenues",oms);
        session.setAttribute("bdbUser", user);
        
        if(mapping.getAttribute() != null)
            if("request".equals(mapping.getScope()))
                request.removeAttribute(mapping.getAttribute());
            else
                session.removeAttribute(mapping.getAttribute());
        return mapping.findForward("successLogOn");
    }
}