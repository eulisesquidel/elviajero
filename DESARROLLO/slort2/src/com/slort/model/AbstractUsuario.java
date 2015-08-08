package com.slort.model;

/**
 * AbstractUsuario generated by MyEclipse Persistence Tools
 */

public abstract class AbstractUsuario implements java.io.Serializable {

	// Fields

	private Integer idUsuario;
	private Perfil perfil;
	private String usuario;
	private String pwd;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;

	// Constructors

	/** default constructor */
	public AbstractUsuario() {
	}

	/** minimal constructor */
	public AbstractUsuario(Integer idUsuario, String usuario, String pwd,
			String nombre, String apellido) {
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.pwd = pwd;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	/** full constructor */
	public AbstractUsuario(Integer idUsuario, Perfil perfil, String usuario,
			String pwd, String nombre, String apellido, String email,
			String telefono) {
		this.idUsuario = idUsuario;
		this.perfil = perfil;
		this.usuario = usuario;
		this.pwd = pwd;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}

	// Property accessors

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}