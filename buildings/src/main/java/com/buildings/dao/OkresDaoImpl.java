package com.buildings.dao;

import com.buildings.dao.interfaces.OkresDao;
import com.buildings.model.Okres;
import org.springframework.transaction.annotation.Transactional;

//@Transactional
public class OkresDaoImpl extends BaseDaoImpl<Okres> implements OkresDao {
	 
	@Override
	@Transactional
	public void addOkres(Okres okres) {
		Okres old = find(Okres.class, okres.getIdOkr());
		if(old != null) {
			merge(okres);
		} else {
			persist(okres);
		}
	}
}
