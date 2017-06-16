package com.buildings.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.util.Assert;

import com.buildings.dao.interfaces.KontoDao;
import com.buildings.model.Konto;
import com.buildings.model.KontoRolaV;

public class KontoDaoImpl extends BaseDaoImpl<Konto> implements KontoDao {

	@Override
	public void addRola4Uzytkownik(String login, String roleName) {
		Assert.notNull(login);
		Assert.notNull(roleName);
		
		Query q = createNativeQuery("insert into rola (id_rola, login, rola) values (seq_rola.nextval, :login, :rola)");
		q.setParameter("login", login);
		q.setParameter("rola", roleName);
		q.executeUpdate();
	}
	
	@Override
	public String getImieNazwiskoByLogin(String login) {
		Konto wynik = getKontoByLogin(login);
		
		return wynik != null ? wynik.getImie() + " " + wynik.getNazwisko() : null;
	}
	
	@Override
	public List<KontoRolaV> getAllKontoList() {
		Query q = createQuery("select k from KontoRolaV k");
		@SuppressWarnings("unchecked")
		List<KontoRolaV> result = q.getResultList();
		return result;
	}
	
	@Override
	public void aktywujDezaktywujKonto(String login, Boolean enable) {
		Konto konto = getKontoByLogin(login);
		Assert.notNull(konto);
		
		String aktywny = enable ? "1" : "0";
		konto.setAktywny(aktywny);
		merge(konto);
	}
	
	@Override
	public Konto getKontoByLogin(String login) {
		Criteria cr = createCriteria(Konto.class);
		cr.add(Restrictions.eq("login", login));
		@SuppressWarnings("unchecked")
		List<Konto> wynik = cr.list();
		return !wynik.isEmpty() ? wynik.get(0) : null;
	}
}
