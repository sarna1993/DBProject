package com.buildings.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.buildings.dao.interfaces.KontoDao;
import com.buildings.dao.interfaces.PracownikDao;
import com.buildings.enums.TypKontaEnum;
import com.buildings.model.Konto;
import com.buildings.model.KontoRolaV;
import com.buildings.model.Pracownik;
import com.buildings.services.interfaces.KontoService;

public class KontoServiceImpl implements KontoService {

	private KontoDao kontoDao;
	private PracownikDao pracownikDao;
	
	public void setKontoDao(KontoDao kontoDao) {
		this.kontoDao = kontoDao;
	}
	
	public void setPracownikDao(PracownikDao pracownikDao) {
		this.pracownikDao = pracownikDao;
	}
	
	@Override
	public List<KontoRolaV> getAllKontoList() {
		return kontoDao.getAllKontoList();
	}
	
	@Override
	public List<String> getTypyKontaList() {
		List<String> typKonta = new ArrayList<String>();
		for(TypKontaEnum typ : TypKontaEnum.values())
			typKonta.add(typ.getRoleName());
		
		return typKonta;
	}

	@Override
	public void addKonto(Konto konto) {
		//TODO: walidatory! - czy login nie uzywany w systemie
		konto.setAktywny("0");
		kontoDao.addRola4Uzytkownik(konto.getLogin(), konto.getTypKonta());
		kontoDao.persist(konto);
	}
	
	public void setAktywacjaKonta(String login, Boolean enable) {
		kontoDao.aktywujDezaktywujKonto(login, enable);
	}

	@Override
	public void removeKonto(String login) {
		Konto konto = kontoDao.getKontoByLogin(login);
		kontoDao.remove(konto);
		
	}

	@Override
	public List<KontoRolaV> getKontoList4Typ(TypKontaEnum typKonta) {
		return kontoDao.getKontoList4Typ(typKonta);
	}
}
