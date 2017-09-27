package com.buildings.dao;

import java.util.List;

import org.hibernate.Criteria;

import com.buildings.dao.interfaces.WynajemDao;
import com.buildings.model.Wynajem;

public class WynajemDaoImpl extends BaseDaoImpl<Wynajem> implements WynajemDao {

	@Override
	public List<Wynajem> getWynajemList() {
		Criteria cr = createCriteria(Wynajem.class);
		@SuppressWarnings("unchecked")
		List<Wynajem> result = cr.list();
		return result;
	}
}
