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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Miasto generated by hbm2java
 */
@Entity
@Table(name = "MIASTO", schema = "ADMIN")
public class Miasto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2650640716251330679L;
	private BigDecimal idMiast;
	private String nazwaMiast;
	private String kodPoczt;
	private Set<Ulica> ulicas = new HashSet<Ulica>(0);

	public Miasto() {
	}

	public Miasto(BigDecimal idMiast) {
		this.idMiast = idMiast;
	}

	public Miasto(BigDecimal idMiast, String nazwaMiast, String kodPoczt, Set<Ulica> ulicas) {
		this.idMiast = idMiast;
		this.nazwaMiast = nazwaMiast;
		this.kodPoczt = kodPoczt;
		this.ulicas = ulicas;
	}

	@Id
	@GeneratedValue(generator = "SEQ_MIASTO", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQ_MIASTO", sequenceName = "ADMIN.SEQ_MIASTO", allocationSize=1)
	@Column(name = "ID_MIAST", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdMiast() {
		return this.idMiast;
	}

	public void setIdMiast(BigDecimal idMiast) {
		this.idMiast = idMiast;
	}

	@Column(name = "NAZWA_MIAST", length = 1020)
	public String getNazwaMiast() {
		return this.nazwaMiast;
	}

	public void setNazwaMiast(String nazwaMiast) {
		this.nazwaMiast = nazwaMiast;
	}

	@Column(name = "KOD_POCZT", length = 40)
	public String getKodPoczt() {
		return this.kodPoczt;
	}

	public void setKodPoczt(String kodPoczt) {
		this.kodPoczt = kodPoczt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "miasto")
	public Set<Ulica> getUlicas() {
		return this.ulicas;
	}

	public void setUlicas(Set<Ulica> ulicas) {
		this.ulicas = ulicas;
	}

}
