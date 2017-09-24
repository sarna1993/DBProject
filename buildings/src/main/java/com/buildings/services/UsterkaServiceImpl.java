package com.buildings.services;

import com.buildings.dao.interfaces.UsterkaDao;
import com.buildings.model.Usterka;
import com.buildings.services.interfaces.UsterkaService;

public class UsterkaServiceImpl implements UsterkaService {

	private UsterkaDao usterkaDao;
	
	public void setUsterkaDao(UsterkaDao usterkaDao) {
		this.usterkaDao = usterkaDao;
	}
	
	@Override
	public void addUsterka(Usterka usterka) {
		usterka.setStatus("0");
		usterkaDao.persist(usterka);
	}
}
