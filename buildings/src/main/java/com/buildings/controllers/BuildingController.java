package com.buildings.controllers;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.buildings.services.interfaces.BudynekService;

@Controller
@RequestMapping("/building")
public class BuildingController {

	private BudynekService budynekService;
	
	public void setBudynekService(BudynekService budynekService) {
		this.budynekService = budynekService;
	}
	
	@RequestMapping("/add")
	public String addBuildingOrLocal(Model model) {
		return "addBuildingPage";
	}
	
	@RequestMapping(value="/addBuilding", method = RequestMethod.GET)
	public String addBuilding(final HttpServletRequest request) {
		
		//TODO: Fajnie by by³o dodaæ tu jakiegoœ try..catcha który ³apa³by wyj¹tki jeœli b³¹d w zapisie
		// jeœli brak exeptions wyœwietlamy jakiegoœ pop-upa ¿e budynek utworzony
		//TODO: Moze jakis Helper ogolny dla rozpakowywania tych parametrow?
		String nrBudynku = request.getParameter("_name");
		String powBud = request.getParameter("_area");
		String isWinda = request.getParameter("_isElevator");
		String floors = request.getParameter("_floors");
		budynekService.addBudynek(nrBudynku, new BigDecimal(powBud), isWinda.equals("1"), new BigDecimal(floors));
		
		return "redirect:/building/add";
	}

}