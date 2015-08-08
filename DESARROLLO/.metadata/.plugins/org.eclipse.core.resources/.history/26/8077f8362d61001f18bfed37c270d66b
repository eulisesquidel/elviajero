package com.slort.struts.form.security;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.slort.model.security.Grupo;
import com.slort.model.security.Users;
import com.slort.struts.action.ActionForm;

public class UsuarioForm extends ActionForm {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	private Long idUser;
    private String usuario;
    private String pwd;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private Long   idgrupo;
    private String grupoDesc;
    private Grupo  grupo;
    private String pwdConfirmacion; 
    
    public String getPwdConfirmacion() {
		return pwdConfirmacion;
	}

	public void setPwdConfirmacion(String pwdConfirmacion) {
		this.pwdConfirmacion = pwdConfirmacion;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        validateRequired(errors, "usuario", this.usuario);
        return errors;
    }
	
	public ActionErrors validateCambioPassword(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (this.pwd.compareTo(this.pwdConfirmacion)!=0 ){
            errors.add("org.apache.struts.action.GLOBAL_ERROR", new ActionError("UsuarioForm.msg.Cambiopassword.difiere"));                   	
        }
        if (this.pwd.compareTo(Users.PASSWORD_DEFECTO)==0){
            errors.add("org.apache.struts.action.GLOBAL_ERROR", new ActionError("UsuarioForm.msg.Cambiopassword.is_pwd_default"));                   	
        }
        return errors;
    }


    public void reset(ActionMapping mapping, HttpServletRequest request) {
    	this.idUser=null;
    	this.pwd ="";
    	this.usuario = "";		
        this.apellido="";
        this.nombre="";
        this.telefono="";
        this.email="";
        this.pwdConfirmacion="";
        super.reset(mapping, request);
    }

	public Long getIdGrupo() {
		if (grupo==null)
			return null;
		else
			return this.grupo.getIdGrupo();
	}

	public void setIdGrupo(Long idgrupo) {
		if (grupo==null)
			this.grupo= new Grupo();
		this.grupo.setIdGrupo(idgrupo);
		this.grupo.setLongDesc(grupoDesc);
	}

	public String getGrupoDesc() {
		if (grupo==null)
			return "";
		else
			return grupo.getLongDesc();
	}

	public void setGrupoDesc(String grupoDesc) {
		if (grupo==null)
			this.grupo= new Grupo();
		this.grupo.setIdGrupo(idgrupo);
		this.grupo.setLongDesc(grupoDesc);
	}

}
