package com.slort.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionError;




/** 
 * LogonForm.java created by EasyStruts - XsltGen.
 * http://easystruts.sf.net
 * created on 01-14-2004
 * 
 * XDoclet definition:
 * @struts:form name="logonForm"
 */
public class LogonForm extends ActionForm {

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if(username == null || username.length() < 1)
            errors.add("username", new ActionError("error.username.required"));
        if(password == null || password.length() < 1)
            errors.add("password", new ActionError("error.password.required"));
        return errors;
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        password = "";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String password;
    private String username;
    private String grupo;
    private String[] menues;
	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String[] getMenues() {
		return menues;
	}

	public void setMenues(String[] menues) {
		this.menues = menues;
	}
	
}