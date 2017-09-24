package com.buildings.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.util.Assert;

import com.buildings.dao.interfaces.RozliczeniaDao;
import com.buildings.model.Rozliczenie;

public class RozliczeniaDaoImpl extends BaseDaoImpl<Rozliczenie> implements RozliczeniaDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Rozliczenie> getRozliczenieList(Integer idLokat) {
		Assert.notNull(idLokat);
		Criteria cr = createCriteria(Rozliczenie.class);
		cr.add(Restrictions.eq("idLokat", idLokat));
		return (List<Rozliczenie>) cr.list();
	}

}
