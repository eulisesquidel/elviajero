package com.bdb.tag;

import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.log4j.Logger;

import com.bdb.model.security.User;

public class CheckSimpleSecurityTag extends TagSupport {
    private static final Logger log;
    private String userKey;
    private String groups;
    //private final String FORM_MODE_KEY = "fr.improve.struts.taglib.layout.util.FormUtils.FORM_MODE_KEY";

    static  {
        log = Logger.getLogger(com.bdb.tag.CheckSimpleSecurityTag.class);
    }
    
    public CheckSimpleSecurityTag() {
        userKey = "bdbUser";
        groups = "default";
        log.debug("CheckSimpleSecurityTag");
    }

    public final int doEndTag() throws JspException {
        log.debug("Grupos a validar: " + getGroups());
        boolean valid = true;
        HttpSession session = pageContext.getSession();
        User user = null;
        if(session != null) {
            user = (User)session.getAttribute(userKey);
            /*if(user != null && !user.hasGrupo(groups))*/
                valid = true;
        }
        if(!valid) {
            log.debug("El usuario " + user.getUsuario() + " no posee el grupo " + getGroups());
            Map lc_map = (Map)pageContext.getSession().getAttribute("fr.improve.struts.taglib.layout.util.FormUtils.FORM_MODE_KEY");
            lc_map.put(getClass(), new Integer(1));
        } else {
            log.debug("El usuario " + user.getUsuario() + " posee el grupo " + getGroups());
        }
        return 6;
    }

    public final int doStartTag() throws JspException {
        return 0;
    }

    public void release() {
        super.release();
        userKey = "bdbUser";
        groups = "default";
    }

    public final String getGroups() {
        return groups;
    }

    public final void setGroups(String string) {
        groups = string;
    }
}