// Decompiled by DJ v3.7.7.81 Copyright 2004 Atanas Neshkov  Date: 20/06/2004 11:11:44 p.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) nonlb 
// Source File Name:   CheckSecurity.java

package com.slort.tag;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import com.slort.model.security.Users;

public class CheckSecurity extends TagSupport {

    public CheckSecurity() {
        grupoPermiso = "default";
        typeAction = "reqCode";
        userKey = "bdbUser";
    }

    public void release() {
        super.release();
        grupoPermiso = "default";
        typeAction = "reqCode";
        userKey = "bdbUser";
    }

    public int doStartTag() throws JspException {
        return 0;
    }

    public int doEndTag() throws JspException {
        boolean valid = false;
        HttpSession session = pageContext.getSession();
        if(session != null && session.getAttribute(userKey) != null) {
             valid = true;            
        }
        if(valid)
            return 6;
        else
            throw new JspException("NO TIENE PERMISO.");
    }

    public String getGrupoPermiso() {
        return grupoPermiso;
    }

    public String getTypeAction() {
        return typeAction;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setGrupoPermiso(String string) {
        grupoPermiso = string;
    }

    public void setTypeAction(String string) {
        typeAction = string;
    }

    public void setUserKey(String string) {
        userKey = string;
    }

    private String grupoPermiso;
    private String typeAction;
    private String userKey;
}