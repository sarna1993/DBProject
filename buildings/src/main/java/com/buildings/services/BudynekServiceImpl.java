package com.buildings.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.buildings.dao.interfaces.BudynekDao;
import com.buildings.dao.interfaces.UlicaDao;
import com.buildings.model.Budynek;
import com.buildings.model.Ulica;
import com.buildings.services.interfaces.BudynekService;

public class BudynekServiceImpl implements BudynekService {

	//TODO: Pamietac o konfiguracji springowej w buildings-cfg.xml
	private BudynekDao budynekDao;
	private UlicaDao ulicaDao;
	
	public void setBudynekDao(BudynekDao budynekDao) {
		this.budynekDao = budynekDao;
	}
	
	public void setUlicaDao(UlicaDao ulicaDao) {
		this.ulicaDao = ulicaDao;
	}
	
	@Override
	public Map<Integer, String> getBudynekMap() {
		Map<Integer, String> budMap = new HashMap<Integer, String>();
		List<Budynek> budList = budynekDao.getBudynekList();
		for(final Budynek budynek : budList) {
			String budFullName = budynek.getNrBud() + " - " + ulicaDao.getUlicaMiastoName4IdUl(budynek.getIdUlica());
			budMap.put(budynek.getIdBud(), budFullName);
		}
		return budMap;
	}
	
	@Override
	public void addBudynek(final Budynek bud) {
		// FIXME: walidatory czy taki budynek nie istnieje pod danym aderesem, nie jest za duzy itp
		Ulica ulica = ulicaDao.find(Ulica.class, bud.getIdUlica());
		Budynek budynek = new Budynek();
		budynek.setIdBud(null);
		budynek.setLiczbaPieter(bud.getLiczbaPieter());
		budynek.setNrBud(bud.getNrBud());
		budynek.setPowBud(bud.getPowBud());
		budynek.setCzyWinda(bud.getCzyWinda());
		budynek.setUlica(ulica);
		budynekDao.persist(budynek);
	}
	
	@Override
	public void updateBudynek(Budynek budynek) {
		// walidatory
		
		budynekDao.merge(budynek);
		
	}

	@Override
	public void deleteBudynek(Budynek budynek) {
		// walidatory
		
		budynekDao.remove(budynek);
	}


}
