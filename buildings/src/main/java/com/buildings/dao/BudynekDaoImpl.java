package com.buildings.dao;


import java.util.List;

import javax.persistence.Query;

import com.buildings.dao.interfaces.BudynekDao;
import com.buildings.model.Budynek;

public class BudynekDaoImpl extends BaseDaoImpl<Budynek> implements BudynekDao {

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Budynek> getBudynekList() {
		Query q = createQuery("from Budynek b");
		return (List<Budynek>) q.getResultList();
	}

}
