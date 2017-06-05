package com.buildings.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "ULICA_MIASTO_V", schema = "ADMIN")
public class UlicaMiastoV implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8601636543702699753L;

	@Id
	@Column(name="ID_UL")
	private Integer idUlica;

	@Column(name="ID_MIAST")
	private Integer idMiast;
	
	@Column(name="NAZWA")
	private String nazwaUlMiast;
	
	public Integer getIdUlica() {
		return idUlica;
	}

	public void setIdUlica(Integer idUlica) {
		this.idUlica = idUlica;
	}

	public Integer getIdMiast() {
		return idMiast;
	}

	public void setIdMiast(Integer idMiast) {
		this.idMiast = idMiast;
	}

	public String getNazwaUlMiast() {
		return nazwaUlMiast;
	}

	public void setNazwaUlMiast(String nazwaUlMiast) {
		this.nazwaUlMiast = nazwaUlMiast;
	}
}
