package com.buildings.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.buildings.dao.interfaces.HistPlatDao;
import com.buildings.dao.interfaces.LokatorDao;
import com.buildings.dao.interfaces.OkresDao;
import com.buildings.dao.interfaces.RozliczeniaDao;
import com.buildings.model.Cennik;
import com.buildings.model.HistPlat;
import com.buildings.model.Lokator;
import com.buildings.model.Rozliczenie;
import com.buildings.model.Wynajem;
import com.buildings.model.WynajemExt;
import com.buildings.services.interfaces.PlatnosciService;
import com.buildings.utils.DateUtils;


public class PlatnosciServiceImpl implements PlatnosciService {

	@Autowired
	private LokatorDao lokatorDao;
	@Autowired
	private HistPlatDao histPlatDao;
	@Autowired
	private RozliczeniaDao rozliczeniaDao;
	@Autowired
	private OkresDao okresDao;
	
	@Override
	public void bookNewPayment(HistPlat platnosc) {
		
		Integer idLokat = lokatorDao.getLokatorByIdKont(platnosc.getIdLokat());
		Assert.notNull(idLokat);
		Lokator lokator = lokatorDao.find(Lokator.class, idLokat);
		Assert.notNull(lokator);
		platnosc.setIdPlat(null);
		platnosc.setLokator(lokator);
		platnosc.setStanPo(1500.0);
		histPlatDao.persist(platnosc);
		
	}

	@Override
	public void createMonthlyCharges(Rozliczenie rozliczenie) {
		rozliczenie.setIdPlat(null);
		rozliczenie.setSaldoMies(-rozliczenie.getObciazenie());
		Integer idLokat = lokatorDao.getLokatorByIdKont(rozliczenie.getIdLokat());
		Lokator lokator = lokatorDao.find(Lokator.class, idLokat);
		rozliczenie.setLokator(lokator);
		okresDao.persist(rozliczenie.getOkres());
		rozliczeniaDao.persist(rozliczenie);
	}

}
