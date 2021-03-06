package com.slort.model;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractPerfil generated by MyEclipse Persistence Tools
 */

public abstract class AbstractPerfil implements java.io.Serializable {

	// Fields

	private Integer    idPerfil;
	private String     descripcionCorta;
	private String     descripcionLarga;
	private Opcionmenu opcionDefecto;
	private Set usuarios = new HashSet(0);
	private Set opcionmenuPerfils = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPerfil() {
	}

	/** minimal constructor */
	public AbstractPerfil(Integer idPerfil, String descripcionCorta,
			String descripcionLarga) {
		this.idPerfil = idPerfil;
		this.descripcionCorta = descripcionCorta;
		this.descripcionLarga = descripcionLarga;
	}

	/** full constructor */
	public AbstractPerfil(Integer idPerfil, String descripcionCorta,
			String descripcionLarga, Opcionmenu opcionDefecto, Set usuarios,
			Set opcionmenuPerfils) {
		this.idPerfil = idPerfil;
		this.descripcionCorta = descripcionCorta;
		this.descripcionLarga = descripcionLarga;
		this.opcionDefecto = opcionDefecto;
		this.usuarios = usuarios;
		this.opcionmenuPerfils = opcionmenuPerfils;
	}

	// Property accessors

	public Integer getIdPerfil() {
		return this.idPerfil;
	}

	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getDescripcionCorta() {
		return this.descripcionCorta;
	}

	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}

	public String getDescripcionLarga() {
		return this.descripcionLarga;
	}

	public void setDescripcionLarga(String descripcionLarga) {
		this.descripcionLarga = descripcionLarga;
	}



	public Set getUsuarios() {
		return this.usuarios;
	}



	public Opcionmenu getOpcionDefecto() {
		return opcionDefecto;
	}

	public void setOpcionDefecto(Opcionmenu opcionDefecto) {
		this.opcionDefecto = opcionDefecto;
	}

	public void setUsuarios(Set usuarios) {
		this.usuarios = usuarios;
	}

	public Set<Opcionmenu> getOpcionmenuPerfils() {
		return this.opcionmenuPerfils;
	}

	public void setOpcionmenuPerfils(Set opcionmenuPerfils) {
		this.opcionmenuPerfils = opcionmenuPerfils;
	}

}