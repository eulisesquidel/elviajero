package com.slort.model;

// Generated by MyEclipse Persistence Tools

import java.util.Set;

/**
 * Calculoubicacion generated by MyEclipse Persistence Tools
 */
public class Calculoubicacion extends AbstractCalculoubicacion implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Calculoubicacion() {
	}

	/** minimal constructor */
	public Calculoubicacion(Integer idCalculoDeUbicacion) {
		super(idCalculoDeUbicacion);
	}

	/** full constructor */
	public Calculoubicacion(Integer idCalculoDeUbicacion, Integer codUnidad,
			Set reservas, Set historicoubicaciondetalles, Set ubicacionreals) {
		super(idCalculoDeUbicacion, codUnidad, reservas,
				historicoubicaciondetalles, ubicacionreals);
	}

}
