package com.buildings.model;
// Generated Jun 2, 2017 5:05:24 PM by Hibernate Tools 4.3.1.Final

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
 * Lokator generated by hbm2java
 */
@Entity
@Table(name = "LOKATOR", schema = "ADMIN")
public class Lokator implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1435543839289678919L;
	private Integer idLokat;
	private Integer idKont;
	private Konto konto;
	private Set<HistPlat> histPlats = new HashSet<HistPlat>(0);
	private Set<StanKonta> stanKontas = new HashSet<StanKonta>(0);
	private Set<Rozliczenie> rozliczenies = new HashSet<Rozliczenie>(0);
	private Set<Wynajem> wynajems = new HashSet<Wynajem>(0);

	public Lokator() {
	}

	public Lokator(Integer idLokat, Konto konto) {
		this.idLokat = idLokat;
		this.konto = konto;
	}

	public Lokator(Integer idLokat, Konto konto, Set<HistPlat> histPlats, Set<StanKonta> stanKontas, 
			Set<Rozliczenie> rozliczenies, Set<Wynajem> wynajems) {
		this.idLokat = idLokat;
		this.konto = konto;
		this.histPlats = histPlats;
		this.stanKontas = stanKontas;
		this.rozliczenies = rozliczenies;
		this.wynajems = wynajems;
	}

	@Id
	@GeneratedValue(generator = "SEQ_LOKATOR", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQ_LOKATOR", sequenceName = "ADMIN.SEQ_LOKATOR", allocationSize=1)
	@Column(name = "ID_LOKAT", unique = true, nullable = false, precision = 22, scale = 0)
	public Integer getIdLokat() {
		return this.idLokat;
	}

	public void setIdLokat(Integer idLokat) {
		this.idLokat = idLokat;
	}

	@Column(name = "ID_KONT", insertable = false, updatable = false)
	public Integer getIdKont() {
		return this.idKont;
	}
	
	public void setIdKont(Integer idKont) {
		this.idKont = idKont;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_KONT", nullable = false)
	public Konto getKonto() {
		return this.konto;
	}

	public void setKonto(Konto konto) {
		this.konto = konto;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lokator")
	public Set<HistPlat> getHistPlats() {
		return this.histPlats;
	}

	public void setHistPlats(Set<HistPlat> histPlats) {
		this.histPlats = histPlats;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lokator")
	public Set<StanKonta> getStanKontas() {
		return this.stanKontas;
	}

	public void setStanKontas(Set<StanKonta> stanKontas) {
		this.stanKontas = stanKontas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lokator")
	public Set<Rozliczenie> getRozliczenies() {
		return this.rozliczenies;
	}

	public void setRozliczenies(Set<Rozliczenie> rozliczenies) {
		this.rozliczenies = rozliczenies;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lokator")
	public Set<Wynajem> getWynajems() {
		return this.wynajems;
	}

	public void setWynajems(Set<Wynajem> wynajems) {
		this.wynajems = wynajems;
	}

}
