package com.buildings.model;
// Generated Jun 2, 2017 5:05:24 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Firma generated by hbm2java
 */
@Entity
@Table(name = "FIRMA", schema = "ADMIN")
public class Firma implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1722146588642027293L;
	private BigDecimal idFirma;
	private Ulica ulica;
	private String nazwaFirm;
	private String nrKontakt;
	private String emailFirm;
	private Set<Zadanie> zadanies = new HashSet<Zadanie>(0);

	public Firma() {
	}

	public Firma(BigDecimal idFirma, Ulica ulica) {
		this.idFirma = idFirma;
		this.ulica = ulica;
	}

	public Firma(BigDecimal idFirma, Ulica ulica, String nazwaFirm, String nrKontakt, String emailFirm,
			Set<Zadanie> zadanies) {
		this.idFirma = idFirma;
		this.ulica = ulica;
		this.nazwaFirm = nazwaFirm;
		this.nrKontakt = nrKontakt;
		this.emailFirm = emailFirm;
		this.zadanies = zadanies;
	}

	@Id

	@Column(name = "ID_FIRMA", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdFirma() {
		return this.idFirma;
	}

	public void setIdFirma(BigDecimal idFirma) {
		this.idFirma = idFirma;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_UL", nullable = false)
	public Ulica getUlica() {
		return this.ulica;
	}

	public void setUlica(Ulica ulica) {
		this.ulica = ulica;
	}

	@Column(name = "NAZWA_FIRM", length = 1020)
	public String getNazwaFirm() {
		return this.nazwaFirm;
	}

	public void setNazwaFirm(String nazwaFirm) {
		this.nazwaFirm = nazwaFirm;
	}

	@Column(name = "NR_KONTAKT", length = 64)
	public String getNrKontakt() {
		return this.nrKontakt;
	}

	public void setNrKontakt(String nrKontakt) {
		this.nrKontakt = nrKontakt;
	}

	@Column(name = "EMAIL_FIRM", length = 512)
	public String getEmailFirm() {
		return this.emailFirm;
	}

	public void setEmailFirm(String emailFirm) {
		this.emailFirm = emailFirm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "firma")
	public Set<Zadanie> getZadanies() {
		return this.zadanies;
	}

	public void setZadanies(Set<Zadanie> zadanies) {
		this.zadanies = zadanies;
	}

}
