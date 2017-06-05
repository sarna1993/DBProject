package com.buildings.dao.interfaces;

import java.util.List;

import com.buildings.model.Ulica;
import com.buildings.model.UlicaMiastoV;

public interface UlicaDao extends BaseDao<Ulica> {

	List<UlicaMiastoV> getUlicaMiastoFromView();
	
	String getUlicaMiastoName4IdUl(Integer idUl);
}
