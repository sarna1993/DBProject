package com.buildings.dao.interfaces;

import java.util.List;

import com.buildings.model.Konto;
import com.buildings.model.KontoRolaV;

public interface KontoDao extends BaseDao<Konto> {

	void addRola4Uzytkownik(String login, String roleName);
	
	String getImieNazwiskoByLogin(String login);
	
	List<KontoRolaV> getAllKontoList();
	
	void aktywujDezaktywujKonto(String login, Boolean enable);
	
	Konto getKontoByLogin(String login);
}
