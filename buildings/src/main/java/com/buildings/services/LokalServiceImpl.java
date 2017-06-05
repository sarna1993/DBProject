package com.buildings.services;

import com.buildings.dao.interfaces.LokalDao;
import com.buildings.model.Lokal;
import com.buildings.services.interfaces.LokalService;

public class LokalServiceImpl implements LokalService {

	private LokalDao lokalDao;
	
	
	public LokalDao getLokalDao() {
		return lokalDao;
	}


	public void setLokalDao(LokalDao lokalDao) {
		this.lokalDao = lokalDao;
	}


	@Override
	public void addLokal(final Lokal lokal) {
		lokal.setStatus('0');
		lokalDao.persist(lokal);
	}

}
