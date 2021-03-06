package com.slort.security;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import org.apache.log4j.Logger;

import com.bdb.model.security.User;

import fr.improve.struts.taglib.layout.policy.AbstractPolicy;

public class SlortPolicy extends AbstractPolicy {
	private static final Logger log;

	static  {
		log = Logger.getLogger(com.slort.security.SlortPolicy.class);
	}
	
	public SlortPolicy() {
	}

	public short getAuthorizedDisplayMode(String in_policy, String in_name, String in_property, PageContext in_pageContext) {
		short salida;
		log.debug("Validando: " + in_policy);
		boolean valid = false;
		HttpSession session = in_pageContext.getSession();
		User user = null;
		if(session != null) {
			user = (User)session.getAttribute("bdbUser");
			/*if(user != null && user.hasGrupo(in_policy))*/
			valid = true;
		}
		
		if (valid) {
			salida = MODE_EDIT;
		} else {
			salida = MODE_INSPECT_ONLY;
		}
		
		return salida;
	}
}
