package com.buildings.services;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;

import com.buildings.dao.interfaces.CennikDao;
import com.buildings.dao.interfaces.KontoDao;
import com.buildings.dao.interfaces.LokalDao;
import com.buildings.dao.interfaces.LokatorDao;
import com.buildings.dao.interfaces.StanKontaDao;
import com.buildings.dao.interfaces.WynajemDao;
import com.buildings.model.Cennik;
import com.buildings.model.Lokal;
import com.buildings.model.Lokator;
import com.buildings.model.Wynajem;
import com.buildings.model.WynajemExt;
import com.buildings.services.interfaces.LokalService;
import com.buildings.utils.DateUtils;

public class LokalServiceImpl implements LokalService {

	private LokalDao lokalDao;
	private CennikDao cennikDao;
	private LokatorDao lokatorDao;
	private WynajemDao wynajemDao;
	
	public void setLokalDao(LokalDao lokalDao) {
		this.lokalDao = lokalDao;
	}

	public void setCennikDao(CennikDao cennikDao) {
		this.cennikDao = cennikDao;
	}
	
	public void setLokatorDao(LokatorDao lokatorDao) {
		this.lokatorDao = lokatorDao;
	}

	public void setWynajemDao(WynajemDao wynajemDao) {
		this.wynajemDao = wynajemDao;
	}

	@Override
	public void addLokal(final Lokal lokal) {
		lokal.setStatus('0');
		lokalDao.persist(lokal);
	}


	@Override
	public Map<Integer, String> getLokalMap() {
		Map<Integer, String> retMap = new HashMap<Integer, String>();
			final List<Lokal> lokalList = lokalDao.getLokalList();
			for(final Lokal lok : lokalList) {
				retMap.put(lok.getIdLokal(), lok.getNrLok());
			}
			return retMap;
	}

	@Override
	public void saveNewCennik4Lokal(WynajemExt wynajem) {
		Cennik cennik = new Cennik();
		cennik.setIdCennik(null);
		cennik.setIdLokal(wynajem.getIdLokal());
		cennik.setDtCenOd(new Date());
		cennik.setDtCenDo(DateUtils.parseDate(wynajem.getDataDo()));
		cennik.setCena(wynajem.getAktualnaCena());
		cennikDao.persist(cennik);
	}
	
	@Override
	public void addNowyWynajem(WynajemExt wynajem) {
		Integer idLokat = lokatorDao.createIfNotExistsLokator(wynajem.getIdLokat());
		Assert.notNull(idLokat);
		Lokator lokator = lokatorDao.find(Lokator.class, idLokat);
		Assert.notNull(lokator);
		Wynajem newWynajem = new Wynajem();
		newWynajem.setIdWynaj(null);
		Double cena = lokalDao.getLastCena4Lokal(wynajem.getIdLokal());
		if(cena == null)
			cena = new Double(0);
		newWynajem.setCenaWynaj(cena);
		if(wynajem.getDataUmowyOd() != null)
			newWynajem.setDtUmowyOd(DateUtils.parseDate(wynajem.getDataUmowyOd()));
		
		if(wynajem.getDataUmowyDo() != null)
			newWynajem.setDtUmowyDo(DateUtils.parseDate(wynajem.getDataUmowyDo()));
		
		newWynajem.setNrUmowy("MOCK");
		newWynajem.setIdLokator(idLokat);
		newWynajem.setLokator(lokator);
		newWynajem.setIdLokal(wynajem.getIdLokal());
		wynajemDao.persist(newWynajem);
		
		
	}
}
