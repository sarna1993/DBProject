package com.buildings.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.util.Assert;

import com.buildings.dao.interfaces.HistPlatDao;
import com.buildings.model.HistPlat;

public class HistPlatDaoImpl extends BaseDaoImpl<HistPlat> implements HistPlatDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<HistPlat> getHistPlat(Integer idLokat) {
		Assert.notNull(idLokat);
		Criteria cr = createCriteria(HistPlat.class);
		cr.add(Restrictions.eq("idLokat", idLokat));
		return (List<HistPlat>) cr.list();
	}

	@Override
	public HistPlat getNewHistPlat() {
		return new HistPlat();
	}

}
