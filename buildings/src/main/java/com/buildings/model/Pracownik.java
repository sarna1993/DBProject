package com.buildings.model;
// Generated Jun 2, 2017 5:05:24 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Pracownik generated by hbm2java
 */
@Entity
@Table(name = "PRACOWNIK", schema = "ADMIN")
public class Pracownik implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7616402104099066878L;
	private Integer idPrac;
	private Integer idKonto;
	private Konto konto;
	private BigDecimal stanowisko;
	private BigDecimal uprawnienia;
	private Set<Zadanie> zadanies = new HashSet<Zadanie>(0);

	public Pracownik() {
	}

	public Pracownik(Integer idPrac, Konto konto) {
		this.idPrac = idPrac;
		this.konto = konto;
	}

	public Pracownik(Integer idPrac, Konto konto,
			BigDecimal stanowisko, BigDecimal uprawnienia, Set<Zadanie> zadanies) {
		this.idPrac = idPrac;
		this.konto = konto;
		this.stanowisko = stanowisko;
		this.uprawnienia = uprawnienia;
		this.zadanies = zadanies;
	}

	@Id
	@GeneratedValue(generator = "SEQ_PRACOWNIK", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQ_PRACOWNIK", sequenceName = "ADMIN.SEQ_PRACOWNIK", allocationSize=1)
	@Column(name = "ID_PRAC", unique = true, nullable = false, precision = 22, scale = 0)
	public Integer getIdPrac() {
		return this.idPrac;
	}

	public void setIdPrac(Integer idPrac) {
		this.idPrac = idPrac;
	}

	@Column(name = "ID_KONT", insertable=false, updatable=false)
	public Integer getIdKonto() {
		return this.idKonto;
	}

	public void setIdKonto(Integer idKonto) {
		this.idKonto = idKonto;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_KONT", nullable = false)
	public Konto getKonto() {
		return this.konto;
	}

	public void setKonto(Konto konto) {
		this.konto = konto;
	}

	@Column(name = "STANOWISKO", precision = 22, scale = 0)
	public BigDecimal getStanowisko() {
		return this.stanowisko;
	}

	public void setStanowisko(BigDecimal stanowisko) {
		this.stanowisko = stanowisko;
	}

	@Column(name = "UPRAWNIENIA", precision = 22, scale = 0)
	public BigDecimal getUprawnienia() {
		return this.uprawnienia;
	}

	public void setUprawnienia(BigDecimal uprawnienia) {
		this.uprawnienia = uprawnienia;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pracownik")
	public Set<Zadanie> getZadanies() {
		return this.zadanies;
	}

	public void setZadanies(Set<Zadanie> zadanies) {
		this.zadanies = zadanies;
	}

}
