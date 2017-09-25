package com.buildings.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;


public interface OkresService extends BaseService {

	public void addOkres();
	public List<String> getMonths();
	public List<String> getYears();
}
