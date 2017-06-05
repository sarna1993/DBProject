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
 * Konto generated by hbm2java
 */
@Entity
@Table(name = "KONTO", schema = "ADMIN")
public class Konto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8880965596155970017L;
	private BigDecimal idKont;
	private String login;
	private String passw;
	private String email;
	private Set<Pracownik> pracowniks = new HashSet<Pracownik>(0);
	private Set<Lokator> lokators = new HashSet<Lokator>(0);

	public Konto() {
	}

	public Konto(BigDecimal idKont) {
		this.idKont = idKont;
	}

	public Konto(BigDecimal idKont, String login, String passw, String email, Set<Pracownik> pracowniks,
			Set<Lokator> lokators) {
		this.idKont = idKont;
		this.login = login;
		this.passw = passw;
		this.email = email;
		this.pracowniks = pracowniks;
		this.lokators = lokators;
	}

	@Id
	@GeneratedValue(generator = "SEQ_KONTO", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQ_KONTO", sequenceName = "ADMIN.SEQ_KONTO", allocationSize=1)
	@Column(name = "ID_KONT", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdKont() {
		return this.idKont;
	}

	public void setIdKont(BigDecimal idKont) {
		this.idKont = idKont;
	}

	@Column(name = "LOGIN", length = 1020)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "PASSW", length = 1020)
	public String getPassw() {
		return this.passw;
	}

	public void setPassw(String passw) {
		this.passw = passw;
	}

	@Column(name = "EMAIL", length = 1020)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "konto")
	public Set<Pracownik> getPracowniks() {
		return this.pracowniks;
	}

	public void setPracowniks(Set<Pracownik> pracowniks) {
		this.pracowniks = pracowniks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "konto")
	public Set<Lokator> getLokators() {
		return this.lokators;
	}

	public void setLokators(Set<Lokator> lokators) {
		this.lokators = lokators;
	}

}
