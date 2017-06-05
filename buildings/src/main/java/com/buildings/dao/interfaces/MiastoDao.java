package com.buildings.dao.interfaces;

import java.util.List;

import com.buildings.model.Miasto;

public interface MiastoDao extends BaseDao<Miasto> {

	/**
	 * Pobiera liste typu string z nazwami wszystkich miast w bazie
	 * @return
	 */
	List<String> getMiastoStringList();
	
	/**
	 * Pobiera miasto po kodzie pocztowym
	 * @param kodPoczt
	 * @return
	 */
	List<Miasto> getMiastoListByKodPoczt(String kodPoczt);
}
