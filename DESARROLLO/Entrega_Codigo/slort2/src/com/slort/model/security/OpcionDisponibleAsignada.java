package com.slort.model.security;

import com.slort.model.Opcionmenu;

public class OpcionDisponibleAsignada {

	Opcionmenu opcionmenu;
	boolean asignada;
	int orden;


	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
	public Opcionmenu getOpcionmenu() {
		return opcionmenu;
	}
	public void setOpcionmenu(Opcionmenu opcionmenu) {
		this.opcionmenu = opcionmenu;
	}
	public boolean isAsignada() {
		return asignada;
	}
	public void setAsignada(boolean asignada) {
		this.asignada = asignada;
	}
	
}
