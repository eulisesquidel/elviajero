package com.slort.model;

// Generated by MyEclipse Persistence Tools

import java.util.Set;

/**
 * OpcionmenuPerfil generated by MyEclipse Persistence Tools
 */
public class OpcionmenuPerfil extends AbstractOpcionmenuPerfil implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public OpcionmenuPerfil() {
	}

	/** minimal constructor */
	public OpcionmenuPerfil(Integer idOpcionmenuPerfil,
			Opcionmenu opcionmenu, Perfil perfil) {
		super(idOpcionmenuPerfil, opcionmenu, perfil);
	}

	/** full constructor */
	public OpcionmenuPerfil(Integer idOpcionmenuPerfil,
			Opcionmenu opcionmenu, Perfil perfil, Double orden) {
		super(idOpcionmenuPerfil, opcionmenu, perfil, orden);
	}

}
