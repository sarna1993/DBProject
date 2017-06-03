package com.buildings.services;

import java.math.BigDecimal;

import com.buildings.dao.interfaces.OkresDao;
import com.buildings.model.Okres;
import com.buildings.services.interfaces.OkresService;
import org.springframework.stereotype.Service;

@Service
public class OkresServiceImpl extends BaseServiceImpl implements OkresService {

	private OkresDao okresDao;
	
	public void setOkresDao(OkresDao okresDao) {
		this.okresDao = okresDao;
	}
	
	@Override
	public void addOkres() {
		okresDao.addOkres(new Okres(new BigDecimal(255), new BigDecimal(6), 
				new BigDecimal(2018)));
		
	}

}
