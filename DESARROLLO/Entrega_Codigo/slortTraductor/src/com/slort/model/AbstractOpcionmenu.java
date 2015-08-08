package com.slort.model;

/**
 * AbstractOpcionmenu generated by MyEclipse Persistence Tools
 */

public abstract class AbstractOpcionmenu implements java.io.Serializable {

	// Fields

	private Integer idOpcionmenu;
	private String descripcionCorta;
	private String descripcionLargo;
	private String link;

	
	
	// Constructors

	/** default constructor */
	public AbstractOpcionmenu() {
	}

	/** minimal constructor */
	public AbstractOpcionmenu(Integer idOpcionmenu, String descripcionCorta,
			String descripcionLargo) {
		this.idOpcionmenu = idOpcionmenu;
		this.descripcionCorta = descripcionCorta;
		this.descripcionLargo = descripcionLargo;
	}

	/** full constructor */
	public AbstractOpcionmenu(Integer idOpcionmenu, String descripcionCorta,
			String descripcionLargo, String link) {
		this.idOpcionmenu = idOpcionmenu;
		this.descripcionCorta = descripcionCorta;
		this.descripcionLargo = descripcionLargo;
		this.link = link;
	}

	// Property accessors

	public Integer getIdOpcionmenu() {
		return this.idOpcionmenu;
	}

	public void setIdOpcionmenu(Integer idOpcionmenu) {
		this.idOpcionmenu = idOpcionmenu;
	}

	public String getDescripcionCorta() {
		return this.descripcionCorta;
	}

	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}

	public String getDescripcionLargo() {
		return this.descripcionLargo;
	}

	public void setDescripcionLargo(String descripcionLargo) {
		this.descripcionLargo = descripcionLargo;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj==null) return false;
		Opcionmenu otraOpcionmenu =(Opcionmenu)obj;
		return this.idOpcionmenu.equals(otraOpcionmenu.getIdOpcionmenu());
	}
	
	

}