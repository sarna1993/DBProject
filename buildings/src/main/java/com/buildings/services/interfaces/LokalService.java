package com.buildings.services.interfaces;

import java.util.Map;

import com.buildings.model.Lokal;
import com.buildings.model.WynajemExt;

public interface LokalService extends BaseService {

	void addLokal(Lokal lokal);
	
	Map<Integer, String> getLokalMap();
		
	void saveNewCennik4Lokal(WynajemExt wynajem);
	
	void addNowyWynajem(WynajemExt wynajem);
}
