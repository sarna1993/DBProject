package com.buildings.dao.interfaces;

import java.util.List;

import com.buildings.model.Lokal;

public interface LokalDao extends BaseDao<Lokal> {
	List<Lokal> getLokalList();
	
	Double getLastCena4Lokal(Integer idLok);
}
