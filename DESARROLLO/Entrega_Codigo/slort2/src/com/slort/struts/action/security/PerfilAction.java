package com.slort.struts.action.security;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
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

import com.slort.model.Opcionmenu;
import com.slort.model.OpcionmenuDAO;
import com.slort.model.OpcionmenuPerfil;
import com.slort.model.OpcionmenuPerfilDAO;
import com.slort.model.Perfil;
import com.slort.model.PerfilDAO;
import com.slort.model.Reserva;
import com.slort.model.ReservaDAO;
import com.slort.model.Usuario;
import com.slort.model.UsuarioDAO;
import com.slort.model.security.AdmPerfiles;
import com.slort.model.security.OpcionDisponibleAsignada;
import com.slort.struts.action.SlortDispatchAction;
import com.slort.struts.form.security.PerfilForm;
import com.slort.struts.form.security.UsuarioForm;
import com.slort.util.Numbers;

import fr.improve.struts.taglib.layout.util.FormUtils;

public class PerfilAction extends SlortDispatchAction {

	   private static final Logger log;

	    static  {
	        log = Logger.getLogger(com.slort.struts.action.security.UsuarioAction.class);
	    }
		
	    public PerfilAction() {
	    }

	    public ActionForward create(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("setting lookups");
	        PerfilForm currentForm = (PerfilForm)form;
	        storeLookups(request,null);
	        currentForm.setReqCode("create");
	        FormUtils.setFormDisplayMode(request, form, FormUtils.EDIT_MODE);
	        return super.create(mapping, form, request, response);
	    }

	    
	    public ActionForward edit(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
	        super.edit(mapping, form, request, response);
	        log.debug("edit++");
	        PerfilForm currentForm = (PerfilForm)form;
	        Long selectedId = currentForm.getSelectedId();
	        currentForm.reset(mapping, request);
	        Perfil object = null;
	        PerfilDAO PerfilDAO = (PerfilDAO) this.getBean(request,"PerfilDAO");   ;
	        object = PerfilDAO.findById(selectedId.intValue());
	        /* obtenemos el Perfil y lo presentamos en pantalla */ 
	        currentForm.setIdPerfil(object.getIdPerfil());
	        currentForm.setDescripcionCorta(object.getDescripcionCorta());
	        currentForm.setDescripcionLarga(object.getDescripcionLarga());
	        OpcionmenuDAO opcionmenuDAO = (OpcionmenuDAO) this.getBean(request,"OpcionmenuDAO");   ;
	        opcionmenuDAO.findById(selectedId.intValue());
	        currentForm.setOpcionmenuDefecto(object.getOpcionDefecto());
	        storeLookups(request,object);
	        log.debug("edit--");
	        currentForm.setReqCode("edit");
	        return mapping.findForward("success");
	    }

	    public ActionForward saveProcess(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response, boolean isNew) throws HibernateException {
	        super.saveProcess(mapping, form, request, response, isNew);
	        log.debug("saveProcess++");
	        PerfilForm currentForm = (PerfilForm)form;
	 
	        ActionErrors errors = getActionErrors(request);
	        if(!errors.isEmpty()) {
	            saveErrors(request, errors);
	            log.debug("storing lookups");
	            return mapping.findForward("failure");
	        }
	        
	        Long selectedId = getSelectedId(currentForm, new Long (currentForm.getIdPerfil()));
	    
	        
	        //System.out.print(currentForm.getOpcionAsignada()[0]);
	        
	    	// iniciamos la transaccion
			this.beginTransactionSpring(request);
			
	        Perfil object = null;
	        PerfilDAO PerfilDAO = (PerfilDAO) this.getBean(request,"PerfilDAO"); 
			OpcionmenuPerfilDAO una_opcionmenuPerfilDAO = (OpcionmenuPerfilDAO) this.getBean(request,"OpcionmenuPerfilDAO"); 
	        
	        if(!isNew) {
	        	object = PerfilDAO.findById(selectedId.intValue());
	        } else {
	            object = new Perfil();    
	        }
	        
	        object.setDescripcionCorta(currentForm.getDescripcionCorta());
	        object.setDescripcionLarga(currentForm.getDescripcionLarga());
	        object.setOpcionDefecto(currentForm.getOpcionmenuDefecto());
	        	
	        if (!isNew){
				object.getOpcionmenuPerfils().clear();
				object.getOpcionmenuPerfiles().clear();
				PerfilDAO.save(object);
				PerfilDAO.getHibernateTemplate().flush();
	        }
		
	        PerfilDAO.save(object);
	        
			
			OpcionmenuDAO una_opcionmenuDAO = (OpcionmenuDAO) this.getBean(request,"OpcionmenuDAO"); 
			OpcionmenuPerfilDAO una_OpcionmenuPerfilDAO =  (OpcionmenuPerfilDAO) this.getBean(request,"OpcionmenuPerfilDAO"); 
			
			for (int i = 0; i < currentForm.getIdsOpcionmenu().length; i++) {
				OpcionmenuPerfil una_OpcionmenuPerfil = new OpcionmenuPerfil();
				una_OpcionmenuPerfil.setPerfil(object);
				if (currentForm.getIdsOpcionmenu()[i]=="") continue;
				una_OpcionmenuPerfil.setOpcionmenu(una_opcionmenuDAO.findById( new Integer(currentForm.getIdsOpcionmenu()[i])));
				if (Numbers.isNumber(currentForm.getOrden()[i], Integer.class))
					una_OpcionmenuPerfil.setOrden(new Double( currentForm.getOrden()[i]));
				else
					una_OpcionmenuPerfil.setOrden(new Double(0));
				
				object.getOpcionmenuPerfiles().add(una_OpcionmenuPerfil);
				una_OpcionmenuPerfilDAO.save(una_OpcionmenuPerfil);
				PerfilDAO.getHibernateTemplate().flush();
				//object.getOpcionmenuPerfils().add( una_opcionmenuDAO.findById( new Integer(currentForm.getOpcionAsignada()[i])));
			}
			
			
			

			

			// Finalizamos la transaccion	
			this.commitTransactionSpring(request);	
			
	        log.debug("saveProcess--");
	        return findData(mapping, form, request, response);
	    }

	    
	    public ActionForward inspect(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
	        super.inspect(mapping, form, request, response);
	        log.debug("Procesando inspect action");
	        PerfilForm currentForm = (PerfilForm)form;
	        Long selectedId = currentForm.getSelectedId();
	        currentForm.reset(mapping, request);
	        Perfil object = null;
	        PerfilDAO PerfilDAO = (PerfilDAO) this.getBean(request,"PerfilDAO");
	        object = PerfilDAO.findById(selectedId.intValue());
	        currentForm.setIdPerfil(object.getIdPerfil());
	        currentForm.setDescripcionCorta(object.getDescripcionCorta());
	        currentForm.setDescripcionLarga(object.getDescripcionLarga());
	        currentForm.setOpcionmenuDefecto(object.getOpcionDefecto());
	        storeLookups(request,object);
	        currentForm.setReqCode("inspect");
	        return mapping.findForward("success");
	    }

	    public ActionForward find(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
			if (response.equals(new String("A"))) {}
	        log.debug("Procesando find action");

	        PerfilForm currentForm = (PerfilForm)form;
	        currentForm.reset(mapping, request);
	        log.debug("Seteando en modo EDIT");
	        currentForm.setReqCode("find");
	        FormUtils.setFormDisplayMode(request, form,   FormUtils.EDIT_MODE);
	        return mapping.findForward("findPage");
	    }

	    public ActionForward findData(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("findData++");
	        PerfilDAO PerfilDAO = (PerfilDAO) this.getBean(request,"PerfilDAO");
	        request.setAttribute("foundResults", PerfilDAO.findAll());
	        PerfilForm currentForm = (PerfilForm)form;
	        currentForm.setReqCode("findData");
	        FormUtils.setFormDisplayMode(request, form, FormUtils.EDIT_MODE);
	        log.debug("findData--");
	        return mapping.findForward("findPage");
	    }

	    public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("delete++");
	        PerfilForm currentForm = (PerfilForm)form;
	        Long selectedId = getSelectedId(currentForm, new Long(currentForm.getIdPerfil()));
	        Perfil object = null;
	        PerfilDAO PerfilDAO = (PerfilDAO) this.getBean(request,"PerfilDAO");
		    
	    	// iniciamos la transaccion
			this.beginTransactionSpring(request);
	        object = PerfilDAO.findById(selectedId.intValue());
	        List<Usuario> object2 = null;
	        UsuarioDAO UsuarioDAO = (UsuarioDAO) this.getBean(request,"UsuarioDAO");
	        object2 = UsuarioDAO.findByIdPerfil(object);
	        if (object2.isEmpty()){
	        	PerfilDAO.delete(object);
	        	this.commitTransactionSpring(request);	
	        	log.debug("delete--");
	        	currentForm.setReqCode("delete");
	        }
	        else
	        	{
	        	this.rollbackTransactionSpring(request);
	        	return mapping.findForward("failusuario");
	        	}
	        return findData(mapping, form, request, response);
	    }


	    private void storeLookups(HttpServletRequest request, Perfil perfil) {
	    	// para el menu por defecto
	    	OpcionmenuDAO opcionmenuDAO = (OpcionmenuDAO) this.getBean(request,"OpcionmenuDAO"); 
	        request.setAttribute("grupoCollection",     opcionmenuDAO.findAll());
	        if  (perfil==null)
	        	request.setAttribute("opcionesDisponiblesAsignadas", AdmPerfiles.obtenerOpcionMenuesDisponibles(opcionmenuDAO.findAll(), null));
	        else
//	        	request.setAttribute("opcionesDisponiblesAsignadas", AdmPerfiles.obtenerOpcionMenuesDisponibles(opcionmenuDAO.findAll(), perfil.getOpcionmenuPerfils()));
	        	request.setAttribute("opcionesDisponiblesAsignadas", AdmPerfiles.obtenerOpcionMenuesDisponibles(opcionmenuDAO.findAll(), perfil.getOpcionmenuPerfiles()));
	    	    
	        log.debug("storeLookups--");
	    }
	    
	    
}
