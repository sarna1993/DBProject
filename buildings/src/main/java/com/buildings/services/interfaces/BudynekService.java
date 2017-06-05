package com.buildings.services.interfaces;

import java.util.Map;

import com.buildings.model.Budynek;

public interface BudynekService extends BaseService {

	void addBudynek(final Budynek budynek);
	
	void updateBudynek(Budynek budynek);
	
	void deleteBudynek(Budynek budynek);
	
	Map<Integer, String> getBudynekMap();
}
