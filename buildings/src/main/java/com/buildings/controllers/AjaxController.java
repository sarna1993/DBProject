package com.buildings.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.buildings.dao.interfaces.BudynekDao;
import com.buildings.dao.interfaces.LokalDao;
import com.buildings.dao.interfaces.UlicaDao;
import com.buildings.model.Budynek;
import com.buildings.model.Lokal;
import com.buildings.model.Ulica;

@RestController
@RequestMapping("/ajax")
public class AjaxController {

	private UlicaDao ulicaDao;
	
	private BudynekDao budynekDao;
	
	private LokalDao lokalDao;
	
	@RequestMapping(value = "getUlica4SelectedMiasto", method = RequestMethod.POST)
	public @ResponseBody Map<Integer, String> getUlica4SelectedMiasto(@RequestParam(value = "city", required = true) String city) {
		Integer idMiast = Integer.parseInt(city);
		Map<Integer, String> cityList = new HashMap<Integer, String>();
		List<Ulica> cityLst = ulicaDao.getUlica4MiastoList(idMiast);
		for(Ulica ul : cityLst) {
			cityList.put(ul.getIdUl(), ul.getNazwaUl());
		}
		return cityList;
	}

	@RequestMapping(value = "getBudynek4SelectedUlica", method = RequestMethod.POST)
	public @ResponseBody Map<Integer, String> getBudynek4SelectedUlica(@RequestParam(value = "street", required = true) String street) {
		Integer idUl = Integer.parseInt(street);
		Map<Integer, String> budynekList = new HashMap<Integer, String>();
		List<Budynek> budLst = budynekDao.getBudynekList();
		for(Budynek bud : budLst) {
			if(bud.getIdUlica().equals(idUl))
				budynekList.put(bud.getIdBud(), bud.getNrBud());
		}
		return budynekList;
	}
	
	@RequestMapping(value = "getLokal4SelectedBudynek", method = RequestMethod.POST)
	public @ResponseBody Map<Integer, String> getLokal4SelectedBudynek(@RequestParam(value = "building", required = true) String building) {
		Integer idBud = Integer.parseInt(building);
		Map<Integer, String> lokalList = new HashMap<Integer, String>();
		List<Lokal> lokalLst = lokalDao.getLokalList();
		for(Lokal lokal : lokalLst) {
			if(lokal.getIdBud().equals(idBud))
				lokalList.put(lokal.getIdLokal(), lokal.getNrLok());
		}
		return lokalList;
	}
	
	@RequestMapping(value = "getStaraCena4SelectedLokal", method = RequestMethod.POST)
	public @ResponseBody Double getStaraCena4SelectedLokal(@RequestParam(value = "place", required = true) String place) {
		Integer idLok = Integer.parseInt(place);
		Double cena = lokalDao.getLastCena4Lokal(idLok);
		if(cena == null)
			cena = new Double(0);
		
		return cena;
	}

	public void setUlicaDao(UlicaDao ulicaDao) {
		this.ulicaDao = ulicaDao;
	}
	
	public void setBudynekDao(BudynekDao budynekDao) {
		this.budynekDao = budynekDao;
	}

	public void setLokalDao(LokalDao lokalDao) {
		this.lokalDao = lokalDao;
	}
}
