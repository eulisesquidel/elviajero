package com.slort.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.slort.model.Usuario;
import com.slort.model.UsuarioDAO;
import com.slort.struts.form.LogonForm;

public class LogonActionSpring extends SlortDispatchAction {
	
    public ActionForward start(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
    	HttpSession session = request.getSession();
    	LogonForm logonForm = (LogonForm)form;
        ActionErrors errors = new ActionErrors();
        
        Usuario usuario= new Usuario();
        usuario.setPwd(logonForm.getPassword());
        usuario.setUsuario( logonForm.getUsername());
        
        UsuarioDAO usuarioDAO =(UsuarioDAO) this.getBean(request,"UsuarioDAO");
        
        if (!(usuarioDAO.validarUsuario(usuario))) {
            errors.add("org.apache.struts.action.GLOBAL_ERROR", new ActionError("message.logon.nouser"));
            logonForm.reset(mapping, request);
            saveErrors(request, errors);
            return new ActionForward(mapping.getInput());
        }
        
        
        
        // Verificamos usuarios
        // Obtenemos perfil 
        // Obtenemos opciones para el perfil
        
        session.setAttribute("perfil", usuarioDAO.getUsuario_encontrado().getPerfil());
        session.setAttribute("opcionDefecto", usuarioDAO.getUsuario_encontrado().getPerfil().getOpcionDefecto());        
        session.setAttribute("opcionesMenues", usuarioDAO.getUsuario_encontrado().getPerfil().getOpcionmenuPerfils());
        session.setAttribute("bdbUser", usuarioDAO.getUsuario_encontrado());
        
        return mapping.findForward("successLogOn");
        
        
    }
    
}
