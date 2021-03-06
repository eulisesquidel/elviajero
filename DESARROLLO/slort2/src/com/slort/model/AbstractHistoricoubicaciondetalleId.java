package com.slort.model;

/**
 * AbstractHistoricoubicaciondetalleId generated by MyEclipse Persistence Tools
 */

public abstract class AbstractHistoricoubicaciondetalleId implements
		java.io.Serializable {

	// Fields

	private Calculoubicacion calculoubicacion;
	private Flota flota;

	// Constructors

	/** default constructor */
	public AbstractHistoricoubicaciondetalleId() {
	}

	/** full constructor */
	public AbstractHistoricoubicaciondetalleId(
			Calculoubicacion calculoubicacion, Flota flota) {
		this.calculoubicacion = calculoubicacion;
		this.flota = flota;
	}

	// Property accessors

	public Calculoubicacion getCalculoubicacion() {
		return this.calculoubicacion;
	}

	public void setCalculoubicacion(Calculoubicacion calculoubicacion) {
		this.calculoubicacion = calculoubicacion;
	}

	public Flota getFlota() {
		return this.flota;
	}

	public void setFlota(Flota flota) {
		this.flota = flota;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHistoricoubicaciondetalleId))
			return false;
		AbstractHistoricoubicaciondetalleId castOther = (AbstractHistoricoubicaciondetalleId) other;

		return ((this.getCalculoubicacion() == castOther.getCalculoubicacion()) || (this
				.getCalculoubicacion() != null
				&& castOther.getCalculoubicacion() != null && this
				.getCalculoubicacion().equals(castOther.getCalculoubicacion())))
				&& ((this.getFlota() == castOther.getFlota()) || (this
						.getFlota() != null
						&& castOther.getFlota() != null && this.getFlota()
						.equals(castOther.getFlota())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCalculoubicacion() == null ? 0 : this
						.getCalculoubicacion().hashCode());
		result = 37 * result
				+ (getFlota() == null ? 0 : this.getFlota().hashCode());
		return result;
	}

}