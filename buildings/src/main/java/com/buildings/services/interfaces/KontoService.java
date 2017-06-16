package com.buildings.services.interfaces;

import java.util.List;

import com.buildings.model.Konto;
import com.buildings.model.KontoRolaV;

public interface KontoService extends BaseService {

	List<String> getTypyKontaList();
	
	void addKonto(Konto konto);
	
	void removeKonto(String login);

	List<KontoRolaV> getAllKontoList();
	
	void setAktywacjaKonta(String login, Boolean enable);
}
