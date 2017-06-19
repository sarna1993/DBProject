package com.buildings.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.buildings.dao.interfaces.UlicaDao;
import com.buildings.model.Miasto;
import com.buildings.model.Ulica;
import com.buildings.model.UlicaMiastoV;

public class UlicaDaoImpl extends BaseDaoImpl<Ulica> implements UlicaDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<UlicaMiastoV> getUlicaMiastoFromView() {
		Query q = createQuery("from UlicaMiastoV v");
		return (List<UlicaMiastoV>) q.getResultList();
	}
	
	@Override
	public String getUlicaMiastoName4IdUl(Integer idUl) {
		Criteria cr = createCriteria(UlicaMiastoV.class);
		cr.add(Restrictions.eq("idUlica", idUl));
		cr.setMaxResults(1);
		
		String str = null;
		@SuppressWarnings("unchecked")
		List<UlicaMiastoV> ulMiastV = cr.list();
		if(!ulMiastV.isEmpty()) {
			final UlicaMiastoV ulica = ulMiastV.get(0);
			str = ulica.getNazwaUlMiast();
		}
		return str;
	}

	@SuppressWarnings("unchecked")
	public List<Miasto> getMiastoList() {
		Query q = createQuery("from Miasto m");
		return (List<Miasto>) q.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Ulica> getUlica4MiastoList(Integer idMiast) {
		Query q = createQuery("select u from Ulica u where u.idMiast = :idMiast");
		q.setParameter("idMiast", idMiast);
		return (List<Ulica>) q.getResultList();
	}
}
