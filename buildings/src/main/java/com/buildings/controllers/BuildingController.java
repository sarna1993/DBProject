package com.buildings.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.buildings.model.Budynek;
import com.buildings.model.Lokal;
import com.buildings.services.interfaces.BudynekService;
import com.buildings.services.interfaces.LokalService;
import com.buildings.services.interfaces.UlicaService;

@Controller
@RequestMapping("/building")
public class BuildingController {

	private BudynekService budynekService;
	private UlicaService ulicaService;
	private LokalService lokalService;
	
	public void setBudynekService(BudynekService budynekService) {
		this.budynekService = budynekService;
	}
	
	public void setUlicaService(UlicaService ulicaService) {
		this.ulicaService = ulicaService;
	}
	
	public void setLokalService(LokalService lokalService) {
		this.lokalService = lokalService;
	}

	/********************* Request mapping *************************/
	@RequestMapping("/add")
	public String addBuildingOrLocal(Model model) {
		model.addAttribute("budModel", new Budynek());
		model.addAttribute("lokModel", new Lokal());
		return "addBuildingPage";
	}
	
	@RequestMapping(value = "/addBuilding", method = RequestMethod.POST)
	public String addBuilding(@ModelAttribute("SpringWeb")Budynek budynek, ModelMap model) {
		budynekService.addBudynek(budynek);    
	    return "redirect:/building/add";
	}

	@RequestMapping(value = "/addPlace", method = RequestMethod.POST)
	public String addPlace(@ModelAttribute("SpringWeb")Lokal lokal, ModelMap model) {
		lokalService.addLokal(lokal); 
	    return "redirect:/building/add";
	}
	
	/********************** Model Attributes ******************/
	
	@ModelAttribute("ulicaList")
	public Map<Integer, String> getUlicaMiastoList() {
		return ulicaService.getUlicaMiasto();
	}
	
	@ModelAttribute("budynekList")
	public Map<Integer, String> getBudynekList() {
		return budynekService.getBudynekMap();
	}
}