package com.slort.model;

// Generated by MyEclipse Persistence Tools

import java.util.Set;

/**
 * Perfil generated by MyEclipse Persistence Tools
 */
public class Perfil extends AbstractPerfil implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Perfil() {
	}

	/** minimal constructor */
	public Perfil(Integer idPerfil, String descripcionCorta,
			String descripcionLarga) {
		super(idPerfil, descripcionCorta, descripcionLarga);
	}

	/** full constructor */
	public Perfil(Integer idPerfil, String descripcionCorta,
			String descripcionLarga, Opcionmenu opcionDefecto, Set usuarios,
			Set opcionmenuPerfils) {
		super(idPerfil, descripcionCorta, descripcionLarga, opcionDefecto,
				usuarios, opcionmenuPerfils);
	}

}
