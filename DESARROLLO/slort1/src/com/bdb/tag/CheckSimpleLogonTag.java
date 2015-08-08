package com.bdb.tag;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.log4j.Logger;

import com.slort.model.security.Users;

public class CheckSimpleLogonTag extends TagSupport {
    private static final Logger log;
    private String userKey;
    private String pageLogon;

    static  {
        log = Logger.getLogger(com.bdb.tag.CheckSimpleLogonTag.class);
    }
	
    public CheckSimpleLogonTag() {
        userKey = "bdbUser";
        pageLogon = "/logon.jsp";
        log.debug("CheckSimpleLogonTag");
    }

    public final int doEndTag() throws JspException {
        log.debug("Comienzo de validacion de logueo");
        boolean valid = false;
        HttpSession session = pageContext.getSession();
        if(session != null && session.getAttribute(userKey) != null)
            valid = true;
        	Users user=(Users)session.getAttribute(userKey);
        	
        if(valid && (user.getPwd()!=null)) {
        	if (user.esPasswordDefecto()){
        		try {
					pageContext.forward("/usuario.do?reqCode=editCambiarPassword");
				} catch (ServletException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}	
            log.debug("Fin de validacion. Resultado: OK");
            return 6;
        }
        try {
            pageContext.forward(pageLogon);
        }
        catch(Exception e) {
            log.error("Error al hacer forward:" + e.toString());
            throw new JspException(e.toString());
        }
        log.debug("Fin de validacion. Resultado: ERROR -> Redireccionado a la pantalla de logon.");
        return 5;
    }

    public final int doStartTag() throws JspException {
        return 0;
    }

    public final String getPageLogon() {
        return pageLogon;
    }

    public final void setPageLogon(String pageLogon) {
        this.pageLogon = pageLogon;
    }

    public void release() {
        super.release();
        userKey = "bdbUser";
        pageLogon = "/logon.jsp";
    }
}