package com.slort.struts.form.security;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.slort.model.Perfil;
import com.slort.model.Usuario;
import com.slort.struts.action.ActionForm;

public class UsuarioForm extends ActionForm {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


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


	private Integer idUsuario;
    private String usuario;
    private String pwd;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private Integer idperfil;
    private String  descripcion_larga;
    private Perfil  perfil;
    private String  pwdConfirmacion; 
    private String pwdActual; 
    
    public String getPwdActual() {
		return pwdActual;
	}

	public void setPwdActual(String pwdActual) {
		this.pwdActual = pwdActual;
	}

	public String getPwdConfirmacion() {
		return pwdConfirmacion;
	}

	public void setPwdConfirmacion(String pwdConfirmacion) {
		this.pwdConfirmacion = pwdConfirmacion;
	}



	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        validateRequired(errors, "usuario", this.usuario);
        return errors;
    }
	
	public ActionMessages validateCambioPassword(ActionMapping mapping, HttpServletRequest request) {
		ActionMessages mensajes = new ActionMessages();
        if (this.pwdActual.length()==0 ){
		    ActionMessage unMensaje=  new ActionMessage("UsuarioForm.msg.Cambiopassword.actual.incorrecta");
		    mensajes.add("mensaje",unMensaje);    
        }
        if (this.pwdConfirmacion.length()==0 ){
		    ActionMessage unMensaje=  new ActionMessage("UsuarioForm.msg.Cambiopassword.is_pwd_default");
		    mensajes.add("mensaje",unMensaje);    
        }
        if (this.pwd.compareTo(this.pwdConfirmacion)!=0){
		    ActionMessage unMensaje=  new ActionMessage("UsuarioForm.msg.Cambiopassword.difiere");
		    mensajes.add("mensaje",unMensaje);  
        }
        if (this.pwd.compareTo(Usuario.PASSWORD_DEFECTO)==0){
		    ActionMessage unMensaje=  new ActionMessage("UsuarioForm.msg.Cambiopassword.is_pwd_default");
		    mensajes.add("mensaje",unMensaje);                    	
        }
        return mensajes;
    }


    public void reset(ActionMapping mapping, HttpServletRequest request) {
    	this.idUsuario=null;
    	this.pwd =null;
    	this.usuario = "";		
        this.apellido="";
        this.nombre="";
        this.telefono="";
        this.email="";
        this.pwdConfirmacion="";
        super.reset(mapping, request);
    }

	public Integer getIdperfil() {
		if (perfil==null)
			return null;
		else
			return this.perfil.getIdPerfil();
	}

	public void setIdperfil(Integer idperfil){
		if (perfil==null)
			this.perfil= new Perfil();
		this.perfil.setIdPerfil(idperfil) ;
		this.perfil.setDescripcionLarga(this.descripcion_larga);
	}
  
	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public String getDescripcion_larga() {
		if (perfil==null)
			return "";
		else
			return perfil.getDescripcionLarga();
	}

	public void setDescripcion_larga(String perfilDesc) {
		if (perfil==null)
			this.perfil= new Perfil();
		this.perfil.setIdPerfil(this.idperfil);
		this.perfil.setDescripcionLarga(perfilDesc);
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

}
