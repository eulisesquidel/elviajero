package com.bdb.tag;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.log4j.Logger;
import org.apache.struts.util.MessageResources;

import com.bdb.util.HttpUtils;

public class ActionLabelTag extends TagSupport {
    private static final Logger log;
    private String parameter;
    private String texto;
    private String styleClass;
    protected String messagesFile;
    protected static MessageResources messages;

    static  {
        log = Logger.getLogger(com.bdb.tag.ActionLabelTag.class);
    }
	
    public ActionLabelTag() {
        parameter = null;
        texto = null;
        styleClass = null;
        messagesFile = "com.bdb.struts.ApplicationResources";
        log.debug("ActionLabelTag");
    }

    public final int doEndTag() throws JspException {
        messages = MessageResources.getMessageResources(messagesFile);
        String result = null;
        result = (String)HttpUtils.getNestedAttribute((HttpServletRequest)pageContext.getRequest(), parameter);
        try {
            if(result != null) {
                StringBuffer buffer = new StringBuffer();
                buffer.append("<span ");
                if(styleClass != null) {
                    buffer.append(" class=\"");
                    buffer.append(styleClass);
                    buffer.append("\"");
                }
                buffer.append(">");
                String s = messages.getMessage("app." + result + ".label", texto);
                if(s != null)
                    buffer.append(s);
                buffer.append("</span>");
                JspWriter writer = pageContext.getOut();
                writer.print(buffer.toString());
            }
        }
        catch(IOException e) {
            log.debug("Fallo al intentar mostrar mensaje");
        }
        return 6;
    }

    public final int doStartTag() throws JspException {
        return 0;
    }

    public void release() {
        super.release();
        parameter = null;
        styleClass = null;
        texto = null;
        messagesFile = "com.bdb.struts.ApplicationResources";
    }

    public String getParameter() {
        return parameter;
    }

    public String getStyleClass() {
        return styleClass;
    }

    public String getTexto() {
        return texto;
    }

    public void setParameter(String string) {
        parameter = string;
    }

    public void setStyleClass(String string) {
        styleClass = string;
    }

    public void setTexto(String string) {
        texto = string;
    }

    public String getMessagesFile() {
        return messagesFile;
    }

    public void setMessagesFile(String string) {
        messagesFile = string;
    }
}