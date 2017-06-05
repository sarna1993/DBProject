package com.buildings.dao.interfaces;

import java.util.List;

import com.buildings.model.Budynek;

public interface BudynekDao extends BaseDao<Budynek> {
	//Metody potrzebne do wykonywania operacji na budynkach
	
	/**
	 * Pobiera liste wszystkich budynków
	 * @return
	 */
	List<Budynek> getBudynekList();
	
}
