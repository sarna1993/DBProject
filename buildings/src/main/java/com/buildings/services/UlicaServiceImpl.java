package com.buildings.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.buildings.dao.interfaces.UlicaDao;
import com.buildings.model.UlicaMiastoV;
import com.buildings.services.interfaces.UlicaService;

public class UlicaServiceImpl implements UlicaService {

	private UlicaDao ulicaDao;
	
	public void setUlicaDao(UlicaDao ulicaDao) {
		this.ulicaDao = ulicaDao;
	}
	
	@Override
	public Map<Integer, String> getUlicaMiasto() {
		Map<Integer, String> retMap = new HashMap<Integer, String>();
		final List<UlicaMiastoV> ulMiastList = ulicaDao.getUlicaMiastoFromView();
		for(final UlicaMiastoV ul : ulMiastList) {
			retMap.put(ul.getIdUlica(), ul.getNazwaUlMiast());
		}
		return retMap;
	}

}
