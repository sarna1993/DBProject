package com.buildings.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.buildings.dao.interfaces.MiastoDao;
import com.buildings.model.Miasto;

public class MiastoDaoImpl extends BaseDaoImpl<Miasto> implements MiastoDao {

	@Override
	@SuppressWarnings("unchecked")
	public List<String> getMiastoStringList() {
		List<String> ret = new ArrayList<String>();
		Query q = createQuery("select m from Miasto m");
		List<Miasto> miastoList = q.getResultList();
		for(Miasto miasto : miastoList) {
			ret.add(miasto.getNazwaMiast());
		}
		return ret;
	 }

	@SuppressWarnings("unchecked")
	@Override
	public List<Miasto> getMiastoListByKodPoczt(String kodPoczt) {
		Criteria cr = createCriteria(Miasto.class);
		cr.add(Restrictions.like("kodPoczt", kodPoczt));
		return (List<Miasto>) cr.list();
	}

}
