package com.slort.struts.action.security;

// Java Imports
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.hibernate.HibernateException;

import org.apache.log4j.Logger;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.slort.model.Perfil;
import com.slort.model.PerfilDAO;
import com.slort.model.Reserva;
import com.slort.model.ReservaDAO;
import com.slort.model.Usuario;
import com.slort.model.UsuarioDAO;
import com.slort.struts.action.SlortDispatchAction;
import com.slort.struts.form.security.UsuarioForm;

import fr.improve.struts.taglib.layout.util.FormUtils;

public class UsuarioAction extends SlortDispatchAction {
    private static final Logger log;

    static  {
        log = Logger.getLogger(com.slort.struts.action.security.UsuarioAction.class);
    }
	
    public UsuarioAction() {
    }

    public ActionForward create(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        log.debug("setting lookups");
        storeLookups(request);
        UsuarioForm currentForm = (UsuarioForm)form;
        currentForm.setReqCode("create");
        return super.create(mapping, form, request, response);
    }

    
    public ActionForward edit(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
        super.edit(mapping, form, request, response);
        log.debug("edit++");
        UsuarioForm currentForm = (UsuarioForm)form;
        Long selectedId = currentForm.getSelectedId();
        currentForm.reset(mapping, request);
        Usuario object = null;
        UsuarioDAO usuarioDAO = (UsuarioDAO) this.getBean(request,"UsuarioDAO");   ;
        object = usuarioDAO.findById(selectedId.intValue());
        /* obtenemos el usuario y lo presentamos en pantalla */ 
        currentForm.setIdUsuario(object.getIdUsuario());
        currentForm.setUsuario(object.getUsuario());
        currentForm.setApellido(object.getApellido());
        currentForm.setNombre(object.getNombre());
        currentForm.setEmail(object.getEmail());
        currentForm.setTelefono(object.getTelefono());
        currentForm.setPerfil(object.getPerfil());
        storeLookups(request);
        
        log.debug("edit--");
        currentForm.setReqCode("edit");
        return mapping.findForward("success");
    }

    public ActionForward saveProcess(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response, boolean isNew) throws HibernateException {
        super.saveProcess(mapping, form, request, response, isNew);
        log.debug("saveProcess++");
        UsuarioForm currentForm = (UsuarioForm)form;
 
        ActionErrors errors = getActionErrors(request);
        if(!errors.isEmpty()) {
            saveErrors(request, errors);
            log.debug("storing lookups");
            storeLookups(request);
            return mapping.findForward("failure");
        }
        
        Long selectedId = getSelectedId(currentForm, new Long (currentForm.getIdUsuario()));
    
    	// iniciamos la transaccion
		this.beginTransactionSpring(request);
		
        Usuario object = null;
        UsuarioDAO usuarioDAO = (UsuarioDAO) this.getBean(request,"UsuarioDAO");   ;
        
        if(!isNew) {
        	object = usuarioDAO.findById(selectedId.intValue());
        } else {
            object = new Usuario();
            object.setPwd(Usuario.PASSWORD_DEFECTO);    
        }
        
        object.setUsuario(currentForm.getUsuario());
        object.setApellido(currentForm.getApellido());
        object.setNombre(currentForm.getNombre());
        object.setEmail(currentForm.getEmail());
        object.setTelefono(currentForm.getTelefono());
        
        Perfil perfil=null;
        PerfilDAO perfilDAO = (PerfilDAO) this.getBean(request,"PerfilDAO"); 
        perfil = perfilDAO.findById(currentForm.getIdperfil());
        object.setPerfil(perfil);
        
        
	
		usuarioDAO.save(object);
		// Finalizamos la transaccion	
		this.commitTransactionSpring(request);	
		
        log.debug("saveProcess--");
        return findData(mapping, form, request, response);
    }

    
    public ActionForward inspect(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
        super.inspect(mapping, form, request, response);
        log.debug("Procesando inspect action");
        UsuarioForm currentForm = (UsuarioForm)form;
        Long selectedId = currentForm.getSelectedId();
        currentForm.reset(mapping, request);
        Usuario object = null;
        UsuarioDAO usuarioDAO = (UsuarioDAO) this.getBean(request,"UsuarioDAO");
        object = usuarioDAO.findById(selectedId.intValue());
        currentForm.setIdUsuario(object.getIdUsuario());
        currentForm.setUsuario(object.getUsuario());
        currentForm.setApellido(object.getApellido());
        currentForm.setNombre(object.getNombre());
        currentForm.setEmail(object.getEmail());
        currentForm.setTelefono(object.getTelefono());
        currentForm.setPerfil(object.getPerfil());
        storeLookups(request);
        currentForm.setReqCode("inspect");
        return mapping.findForward("success");
    }

    public ActionForward find(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		if (response.equals(new String("A"))) {}
        log.debug("Procesando find action");
        storeLookups(request);
        UsuarioForm currentForm = (UsuarioForm)form;
        currentForm.reset(mapping, request);
        log.debug("Seteando en modo EDIT");
        currentForm.setReqCode("find");
        FormUtils.setFormDisplayMode(request, form,   FormUtils.EDIT_MODE);
        return mapping.findForward("findPage");
    }

    public ActionForward findData(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        log.debug("findData++");
        UsuarioDAO usuarioDAO = (UsuarioDAO) this.getBean(request,"UsuarioDAO");
        request.setAttribute("foundResults", usuarioDAO.findAll());
        UsuarioForm currentForm = (UsuarioForm)form;
        currentForm.setReqCode("findData");
        FormUtils.setFormDisplayMode(request, form, 1);
        log.debug("findData--");
        return mapping.findForward("findPage");
    }

    public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        log.debug("delete++");
        UsuarioForm currentForm = (UsuarioForm)form;
        Long selectedId = getSelectedId(currentForm, new Long(currentForm.getIdUsuario()));
        Usuario object = null;
        UsuarioDAO usuarioDAO = (UsuarioDAO) this.getBean(request,"UsuarioDAO");
        object = usuarioDAO.findById(selectedId.intValue());
        
        //comparacion entre usuario actual y usuario a eliminar
        int usuactual=this.getUsuario(request).getIdUsuario();
        int usuaeliminar=object.getIdUsuario();
        if (usuactual==usuaeliminar)
    		return mapping.findForward("failusuario");
        
        //chequeo si hay reservas con el usuario a eliminar
        List<Reserva> object2 = null;
        ReservaDAO ReservaDAO = (ReservaDAO) this.getBean(request,"ReservaDAO");
        object2 = ReservaDAO.findByIdUsuario(object.getIdUsuario());
        if (object2.isEmpty()){
            usuarioDAO.delete(object);
            log.debug("delete--");
            currentForm.setReqCode("delete");
        }
        else
        	{
        	return mapping.findForward("failreserva");
        	}

        return findData(mapping, form, request, response);
    }

    private void storeLookups(HttpServletRequest request) {
        PerfilDAO perfilDAO = (PerfilDAO) this.getBean(request,"PerfilDAO"); 
        request.setAttribute("grupoCollection",     perfilDAO.findAll());
        log.debug("storeLookups--");
    }
    
    
    
	public ActionForward editCambiarPassword(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
		super.edit(mapping, form, request, response);
		log.debug("editCambiarPassword++");
		UsuarioForm currentForm = (UsuarioForm)form;
		log.debug("Inicializando el Formulario");
		currentForm.reset(mapping, request);
		log.debug("Storing Lookups");
		FormUtils.setFormDisplayMode(request, currentForm,  FormUtils.EDIT_MODE);
		currentForm.setReqCode("CambiarPassword");
		log.debug("editCambiarPassword--");
		return mapping.findForward("failure_cambio_pwd");
	}    	
	
	public ActionForward cambiarPassword(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
		super.edit(mapping, form, request, response);
		log.debug("edit++");
		UsuarioForm currentForm = (UsuarioForm)form;
		Usuario usuario_actual=( Usuario)request.getSession().getAttribute("bdbUser");
		Long selectedId = getSelectedId(currentForm,new Long(usuario_actual.getIdUsuario()));		
		ActionMessages errors=currentForm.validateCambioPassword(mapping, request);
		if (!errors.isEmpty()) {
		    request.setAttribute(ActionMessages.GLOBAL_MESSAGE ,errors);
			return mapping.findForward("failure_cambio_pwd");
		}	
		Usuario object = null;
		
    	// iniciamos la transaccion
		this.beginTransactionSpring(request);
		
		UsuarioDAO usuarioDAO = (UsuarioDAO) this.getBean(request,"UsuarioDAO");
		object = usuarioDAO.findById(selectedId.intValue());
		
		if (object.getPwd().compareTo(currentForm.getPwdActual())!=0){
			ActionMessages mensajes = new ActionMessages();
		    ActionMessage unMensaje=  new ActionMessage("UsuarioForm.msg.Cambiopassword.actual.incorrecta");
		    mensajes.add("mensaje",unMensaje);
		    request.setAttribute(ActionMessages.GLOBAL_MESSAGE ,mensajes);
			return mapping.findForward("failure_cambio_pwd");
		}
		
		object.setPwd(currentForm.getPwd());
		usuarioDAO.save(object);
		request.getSession().setAttribute("bdbUser", object);
		// Finalizamos la transaccion	
		this.commitTransactionSpring(request);	
		
        ActionMessages mensajes = new ActionMessages();
        ActionMessage unMensaje=  new ActionMessage("UsuarioForm.msg.Cambiopassword.ok");
        mensajes.add("mensaje",unMensaje);
        request.setAttribute(ActionMessages.GLOBAL_MESSAGE ,mensajes);
        FormUtils.setFormDisplayMode(request, form, FormUtils.INSPECT_MODE);
        log.debug("cambiarPassword--");
		return mapping.findForward("success_cambio_pwd");
		}    	
}