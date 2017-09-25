package com.buildings.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.buildings.services.interfaces.OkresService;


public class OkresServiceImpl extends BaseServiceImpl implements OkresService {

	@Override
	public void addOkres() {
		// TODO Auto-generated method stub
	}

	@Override
	public List<String> getMonths() {
		List<String> months = new ArrayList<String>();
		months.add("wrzesien");
		months.add("pazdziernik");
		months.add("listopad");
		months.add("grudzien");
		months.add("styczen");
		months.add("luty");
		months.add("marzec");
		months.add("kwiecien");
		months.add("maj");
		months.add("czerwiec");
		months.add("lipiec");
		months.add("sierpien");
		return months;
	}

	@Override
	public List<String> getYears() {
		List<String> years = new ArrayList<String>();
		for(int i = 1990; i < 2031 ; i++){
			years.add(Integer.toString(i));
		}
		return years;
	}

}
