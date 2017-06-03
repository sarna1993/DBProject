package com.buildings.services;

import java.math.BigDecimal;

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
	public void addBudynek(String nrBudynku, BigDecimal pow, boolean isWinda, BigDecimal liczbaPieter) {
		// FIXME: walidatory czy taki budynek nie istnieje pod danym aderesem, nie jest za duzy itp
		Character czyWinda = isWinda ? '1' : '0';
		Ulica ulica = ulicaDao.find(Ulica.class, new BigDecimal(2));
		Budynek budynek = new Budynek();
		budynek.setIdBud(new BigDecimal(2));
		budynek.setLiczbaPieter(liczbaPieter);
		budynek.setNrBud(nrBudynku);
		budynek.setPowBud(pow);
		budynek.setCzyWinda(czyWinda);
		budynek.setUlica(ulica);
		// na razie na chama wpycham na baze zeby pokazac jak dzialaja poszczegolne metody :D
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
