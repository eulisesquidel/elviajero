package com.slort.model;

// Generated by MyEclipse Persistence Tools

import java.util.Date;

/**
 * Reserva generated by MyEclipse Persistence Tools
 */
public class Reserva extends AbstractReserva implements java.io.Serializable {

	// Constructors
	public static String ESTADO_ENPROCESO = "En proceso";
	public static String ESTADO_A_REALIZAR = "A realizar";
	public static String ESTADO_REALIZADA = "Realizada";
	public static String ESTADO_CANCELADA = "Cancelada";

	/** default constructor */
	public Reserva() {
	}

	/** minimal constructor */
	public Reserva(Integer idReserva) {
		super(idReserva);
	}

	/** full constructor */
	public Reserva(Integer idReserva, Flota flota, Hotel hotel,
			Cliente cliente, Calculoubicacion calculoubicacion, Date fecha,
			Date hora, String estado, Integer idUsuario, String observaciones,
			String direccion, String telefono, String entreCalles,
			String localidad, Double latitud, Double longitud) {
		super(idReserva, flota, hotel, cliente, calculoubicacion, fecha, hora,
				estado, idUsuario, observaciones, direccion, telefono,
				entreCalles, localidad, latitud, longitud);
	}

}