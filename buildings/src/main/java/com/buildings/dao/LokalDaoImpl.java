package com.buildings.dao;

import java.util.List;

import javax.persistence.Query;

import com.buildings.dao.interfaces.LokalDao;
import com.buildings.model.Lokal;

public class LokalDaoImpl extends BaseDaoImpl<Lokal> implements LokalDao {

	public List<Lokal> getLokalList() {
		Query q = createQuery("select l from Lokal l");
		@SuppressWarnings("unchecked")
		List<Lokal> lokalList = q.getResultList();
		return lokalList;
	}

	@Override
	public Double getLastCena4Lokal(Integer idLok) {
		Query q = createQuery("select c.cena from Cennik c where c.idLokal = :idLok");
		q.setParameter("idLok", idLok);
		@SuppressWarnings("unchecked")
		List<Double> resultList = q.getResultList();
		return resultList.isEmpty() ? null : resultList.get(0);
	}
}
