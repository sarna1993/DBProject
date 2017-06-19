package com.buildings.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.buildings.dao.interfaces.KontoDao;
import com.buildings.dao.interfaces.LokatorDao;
import com.buildings.model.Konto;
import com.buildings.model.Lokator;

public class LokatorDaoImpl extends BaseDaoImpl<Lokator> implements LokatorDao {

	private KontoDao kontoDao;
	
	public void setKontoDao(KontoDao kontoDao) {
		this.kontoDao = kontoDao;
	}
	
	@Override
	public Integer createIfNotExistsLokator(Integer idKont) {
		Criteria cr = createCriteria(Lokator.class);
		cr.add(Restrictions.eq("idKont", idKont));
		@SuppressWarnings("unchecked")
		List<Lokator> result = cr.list();
		
		if(result != null && !result.isEmpty()) {
			return result.get(0).getIdLokat();
		}
		
		Lokator lokator = new Lokator();
		lokator.setIdKont(idKont);
		lokator.setKonto(kontoDao.find(Konto.class, idKont));
		lokator = persist(lokator);
		return lokator.getIdLokat();
	}
	
}
