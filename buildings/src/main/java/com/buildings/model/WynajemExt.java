package com.buildings.model;

/**
 * Niezapisywany na bazie obiekt uzywany jako model przy ustalaniu cennika itd
 *
 */
public class WynajemExt {

	private Integer idMiasto;
	private Integer idUlica;
	private Integer idBud;
	private Integer idLokal;
	private Integer idLokat;
	private Double staraCena;
	private Double aktualnaCena;
	private String dataDo;
	private String dataUmowyOd;
	private String dataUmowyDo;
	
	public Integer getIdMiasto() {
		return idMiasto;
	}
	public void setIdMiasto(Integer idMiasto) {
		this.idMiasto = idMiasto;
	}
	public Integer getIdUlica() {
		return idUlica;
	}
	public void setIdUlica(Integer idUlica) {
		this.idUlica = idUlica;
	}
	public Integer getIdBud() {
		return idBud;
	}
	public void setIdBud(Integer idBud) {
		this.idBud = idBud;
	}
	public Integer getIdLokal() {
		return idLokal;
	}
	public void setIdLokal(Integer idLokal) {
		this.idLokal = idLokal;
	}
	public Integer getIdLokat() {
		return idLokat;
	}
	public void setIdLokat(Integer idLokat) {
		this.idLokat = idLokat;
	}
	public Double getStaraCena() {
		return staraCena;
	}
	public void setStaraCena(Double staraCena) {
		this.staraCena = staraCena;
	}
	public Double getAktualnaCena() {
		return aktualnaCena;
	}
	public void setAktualnaCena(Double aktualnaCena) {
		this.aktualnaCena = aktualnaCena;
	}
	public String getDataDo() {
		return dataDo;
	}
	public void setDataDo(String dataDo) {
		this.dataDo = dataDo;
	}
	public void setDataUmowyOd(String dataUmowyOd) {
		this.dataUmowyOd = dataUmowyOd;
	}
	public void setDataUmowyDo(String dataUmowyDo) {
		this.dataUmowyDo = dataUmowyDo;
	}
	public String getDataUmowyOd() {
		return dataUmowyOd;
	}
	public String getDataUmowyDo() {
		return dataUmowyDo;
	}
}
