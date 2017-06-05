package com.buildings.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.buildings.dao.interfaces.UlicaDao;
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

}
