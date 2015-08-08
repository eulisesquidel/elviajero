package com.slort.struts.action.security;

// Java Imports
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.JDBCException;
import net.sf.hibernate.Session;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.bdb.model.hibernate.helper.FindDataObjectSet;
import com.bdb.model.hibernate.helper.HibernateHelper;
import com.bdb.util.BDBUtils;
import com.bdb.util.SQLUtils;
import com.slort.model.security.Grupo;
import com.slort.model.security.Users;
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
        Long selectedId = getSelectedId(currentForm, currentForm.getIdUser());
        log.debug("Inicializando el Formulario");
        currentForm.reset(mapping, request);
        log.debug("Storing Lookups");
        storeLookups(request);
        HibernateHelper hibHelper = new HibernateHelper();
        Users object = (Users)hibHelper.getObjectById(request, mapping, com.slort.model.security.Users.class, selectedId);
        if(object != null) {
            currentForm.setIdUser(object.getIdUser());
            currentForm.setUsuario(object.getUsuario());
            currentForm.setApellido(object.getApellido());
            currentForm.setNombre(object.getNombre());
            currentForm.setEmail(object.getEmail());
            currentForm.setTelefono(object.getTelefono());
            currentForm.setGrupo(object.getGrupo());
        }
        log.debug("edit--");
        currentForm.setReqCode("edit");
        return mapping.findForward("success");
    }

    public ActionForward saveProcess(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response, boolean isNew) throws HibernateException {
        super.saveProcess(mapping, form, request, response, isNew);
        HibernateHelper hibHelper = new HibernateHelper();
        log.debug("saveProcess++");
        UsuarioForm currentForm = (UsuarioForm)form;
        boolean saveOk = false;
        ActionErrors errors = getActionErrors(request);
        if(!errors.isEmpty()) {
            saveErrors(request, errors);
            log.debug("storing lookups");
            storeLookups(request);
            return mapping.findForward("failure");
        }
        Long selectedId = getSelectedId(currentForm, currentForm.getIdUser());
        Users object = null;
        if(!isNew) {
            object = (Users)hibHelper.getObjectById(request, mapping, com.slort.model.security.Users.class, selectedId);
        } else {
            object = new Users();
            object.setPwd(Users.PASSWORD_DEFECTO);    
        }
        object.setUsuario(currentForm.getUsuario());
        object.setApellido(currentForm.getApellido());
        object.setNombre(currentForm.getNombre());
        object.setEmail(currentForm.getEmail());
        object.setTelefono(currentForm.getTelefono());
        // Guardamos el grupo 
        Grupo grupo = (Grupo)hibHelper.getObjectById(request, mapping, com.slort.model.security.Grupo.class,currentForm.getIdGrupo()); 
        object.setGrupo(grupo);
        
        Session hibSession = null;
        setRollBackOnly(request, true);
        try {
            hibSession = getHibernateSession(request);
            hibSession.saveOrUpdate(object);
            saveOk = true;
            setRollBackOnly(request, false);
        }
        catch(JDBCException ee) {
            errors.add("org.apache.struts.action.GLOBAL_ERROR", new ActionError("app.error.BDB102"));
            log.error("Error al grabar una materia", ee);
        }
        catch(HibernateException e) {
            errors.add("org.apache.struts.action.GLOBAL_ERROR", new ActionError("app.error.BDB100"));
            log.error("Error en hibernate", e);
        }
        finally {
            try {
                disposeSession(request);
                if(!isRollBackOnly(request))
                    errors.add("org.apache.struts.action.GLOBAL_MESSAGE", new ActionError("app.transaction.success"));
            }
            catch(HibernateException e) {
                errors.add("org.apache.struts.action.GLOBAL_ERROR", new ActionError("app.error.BDB101"));
                log.error("Error en dispose session", e);
            }
        }
        if(!errors.isEmpty()) {
            saveErrors(request, errors);
            if(isNew && !saveOk)
                return find(mapping, form, request, response);
        }
        log.debug("storing lookups");
        storeLookups(request);
        log.debug("Seteando en modo EDIT");
        /* seteamos el modo del formulario */ 
        FormUtils.setFormDisplayMode(request, form,    FormUtils.EDIT_MODE);
        log.debug("saveProcess--");
        currentForm.setReqCode("save");
        return find(mapping, form, request, response);
    }

    
    public ActionForward inspect(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
        super.inspect(mapping, form, request, response);
        log.debug("Procesando inspect action");
        UsuarioForm currentForm = (UsuarioForm)form;
        Long selectedId = getSelectedId(currentForm, currentForm.getIdUser());
        currentForm.reset(mapping, request);
        storeLookups(request);
        HibernateHelper hibHelper = new HibernateHelper();
        Users object = (Users)hibHelper.getObjectById(request, mapping, com.slort.model.security.Users.class, selectedId);
        if(object != null) {
            currentForm.setIdUser(object.getIdUser());
            currentForm.setUsuario(object.getUsuario());
            currentForm.setApellido(object.getApellido());
            currentForm.setNombre(object.getNombre());
            currentForm.setEmail(object.getEmail());
            currentForm.setTelefono(object.getTelefono());
            currentForm.setGrupo(object.getGrupo());
        }
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
		if (response.equals(new String("A"))) {}
        log.debug("findData++");
        storeLookups(request);
        UsuarioForm currentForm = (UsuarioForm)form;
        Session hibSession = null;
        try {
            hibSession = getHibernateSession(request);
            Vector arguments = new Vector();
            if(!BDBUtils.isEmpty(currentForm.getUsuario()))
                arguments.add((new Object[] {
                    "usuario", " LIKE ", currentForm.getUsuario()+"%", SQLUtils.QUERY_DATATYPE_STRING
                }));
            if(!BDBUtils.isEmpty(currentForm.getNombre()))
                arguments.add((new Object[] {
                    "nombre", " LIKE ", currentForm.getNombre() + "%", SQLUtils.QUERY_DATATYPE_STRING
                }));
            if(!BDBUtils.isEmpty(currentForm.getApellido()))
                arguments.add((new Object[] {
                    "apellido", " LIKE ", currentForm.getApellido() + "%", SQLUtils.QUERY_DATATYPE_STRING
                }));
            FindDataObjectSet findDataSet = new FindDataObjectSet();
            java.util.List results = findDataSet.getDataObjectSet(hibSession, "Users", arguments);
            request.setAttribute("foundResults", results);
        }
        catch(HibernateException e) {
            log.error("Error en hibernate", e);
        }
        finally {
            try {
                disposeSession(request);
            }
            catch(HibernateException e) {
                log.error("Error en dispose session", e);
            }
        }
        log.debug("findData--");
        currentForm.setReqCode("findData");
        FormUtils.setFormDisplayMode(request, form, 1);
        return mapping.findForward("findPage");
    }

    public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        log.debug("delete++");
        UsuarioForm currentForm = (UsuarioForm)form;
        Long selectedId = getSelectedId(currentForm, currentForm.getIdUser());
        ActionErrors errors = new ActionErrors();
        HibernateHelper hibHelper = new HibernateHelper();
        Users object = (Users)hibHelper.getObjectById(request, mapping, com.slort.model.security.Users.class, selectedId);
        Session hibSession = null;
        setRollBackOnly(request, true);
        try {
            hibSession = getHibernateSession(request);
            if(object != null) {
                hibSession.delete(object);
                setRollBackOnly(request, false);
            } else {
                errors.add("org.apache.struts.action.GLOBAL_ERROR", new ActionError("app.error.BDB100"));
            }
        }
        catch(HibernateException e) {
            errors.add("org.apache.struts.action.GLOBAL_ERROR", new ActionError("app.error.BDB100"));
            log.error("Error en hibernate", e);
        }
        finally {
            try {
                disposeSession(request);
                if(!isRollBackOnly(request))
                    errors.add("org.apache.struts.action.GLOBAL_MESSAGE", new ActionError("app.transaction.success"));
            }
            catch(HibernateException e) {
                errors.add("org.apache.struts.action.GLOBAL_ERROR", new ActionError("app.error.BDB101"));
                log.error("Error en dispose session", e);
            }
        }
        if(!errors.isEmpty())
            saveErrors(request, errors);
        log.debug("delete--");
        currentForm.setReqCode("delete");
        return find(mapping, form, request, response);
    }

    private void storeLookups(HttpServletRequest request) {
		if (request.equals(new String("A"))) {}
        log.debug("storeLookups++");
        Session hibSession = null;
        setRollBackOnly(request, true);
        try {
            hibSession = getHibernateSession(request);
            FindDataObjectSet findDataSet = new FindDataObjectSet();
            findDataSet.setOrderByClause("object.longDesc");
            java.util.List list = findDataSet.getDataObjectSet(hibSession, "Grupo", null);
            request.setAttribute("grupoCollection", list);
        }
        catch(HibernateException e) {
            log.error("Error en hibernate", e);
        }
        finally {
            try {
                disposeSession(request);
            }
            catch(HibernateException e) {
                log.error("Error en dispose session", e);
            }
        }
        log.debug("storeLookups--");
    }
    
    
    
	public ActionForward editCambiarPassword(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
		super.edit(mapping, form, request, response);
		log.debug("editCambiarPassword++");
		UsuarioForm currentForm = (UsuarioForm)form;
		log.debug("Inicializando el Formulario");
		currentForm.reset(mapping, request);
		log.debug("Storing Lookups");
		FormUtils.setFormDisplayMode(request, form,  FormUtils.EDIT_MODE);
		currentForm.setReqCode("CambiarPassword");
		log.debug("editCambiarPassword--");
		return mapping.findForward("failure_cambio_pwd");
	}    	
	
	public ActionForward cambiarPassword(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
		super.edit(mapping, form, request, response);
		log.debug("edit++");
		UsuarioForm currentForm = (UsuarioForm)form;
		Users usuario_actual=(Users)request.getSession().getAttribute("bdbUser");
		Long selectedId = getSelectedId(currentForm,usuario_actual.getIdUser());		
		ActionErrors errors=currentForm.validateCambioPassword(mapping, request);
		if (!errors.isEmpty()) {
			saveErrors(request, errors);
			return mapping.findForward("failure_cambio_pwd");
		}		
		HibernateHelper hibHelper = new HibernateHelper();
		Users object = (Users)hibHelper.getObjectById(request, mapping, com.slort.model.security.Users.class, selectedId);
		if(object == null) {
			return mapping.findForward("failure_cambio_pwd");	
		}
		object.setPwd(currentForm.getPwd());
		Session hibSession = null;
        setRollBackOnly(request, true);
        try {
            hibSession = getHibernateSession(request);
            if(object != null) {
                hibSession.update(object);
                setRollBackOnly(request, false);
                disposeSession(request);
            }
        }
        catch(HibernateException e) {
            errors.add("org.apache.struts.action.GLOBAL_ERROR", new ActionError("app.error.BDB100"));
            log.error("Error en hibernate", e);
        }
        
        usuario_actual.setPwd(currentForm.getPwd());
        
        ActionMessages mensajes = new ActionMessages();
        ActionMessage unMensaje=  new ActionMessage("UsuarioForm.msg.Cambiopassword.ok");
        mensajes.add("mensaje",unMensaje);
        request.setAttribute(ActionMessages.GLOBAL_MESSAGE ,mensajes);
        FormUtils.setFormDisplayMode(request, form, FormUtils.INSPECT_MODE);
        log.debug("cambiarPassword--");
		return mapping.findForward("success_cambio_pwd");
		}    	
}