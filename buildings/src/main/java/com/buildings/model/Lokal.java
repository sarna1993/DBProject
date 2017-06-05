package com.buildings.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "LOKAL", schema = "ADMIN")
public class Lokal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1413696270126195625L;

	private Integer idLokal;
	private Integer idBud;
	private String nrLok;
	private BigDecimal powLok;
	private Integer liczbaPom;
	private Boolean isBalkon;
	private Character status;
	
	@Id
	@GeneratedValue(generator = "SEQ_LOKAL", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQ_LOKAL", sequenceName = "ADMIN.SEQ_LOKAL", allocationSize=1)
	@Column(name = "ID_LOKAL", unique = true, nullable = false, precision = 22, scale = 0)
	public Integer getIdLokal() {
		return idLokal;
	}
	public void setIdLokal(Integer idLokal) {
		this.idLokal = idLokal;
	}
	@Column(name = "ID_BUD")
	public Integer getIdBud() {
		return idBud;
	}
	public void setIdBud(Integer idBud) {
		this.idBud = idBud;
	}
	@Column(name = "NR_LOK")
	public String getNrLok() {
		return nrLok;
	}
	public void setNrLok(String nrLok) {
		this.nrLok = nrLok;
	}
	@Column(name = "POW_LOK")
	public BigDecimal getPowLok() {
		return powLok;
	}
	public void setPowLok(BigDecimal powLok) {
		this.powLok = powLok;
	}
	@Column(name = "LICZBA_POM")
	public Integer getLiczbaPom() {
		return liczbaPom;
	}
	public void setLiczbaPom(Integer liczbaPom) {
		this.liczbaPom = liczbaPom;
	}
	@Column(name = "IS_BALKON", length = 1)
	public Boolean getIsBalkon() {
		return isBalkon;
	}
	public void setIsBalkon(Boolean isBalkon) {
		this.isBalkon = isBalkon;
	}
	@Column(name = "STATUS", length = 1)
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}

    
}
