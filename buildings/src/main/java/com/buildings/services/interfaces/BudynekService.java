package com.buildings.services.interfaces;

import java.math.BigDecimal;

import com.buildings.model.Budynek;

public interface BudynekService extends BaseService {

	void addBudynek(String nrBudynku, BigDecimal pow, boolean isWinda, BigDecimal liczbaPieter);
	
	void updateBudynek(Budynek budynek);
	
	void deleteBudynek(Budynek budynek);
}
