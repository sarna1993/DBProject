package com.buildings.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.buildings.dao.interfaces.KontoDao;
import com.buildings.dao.interfaces.UlicaDao;
import com.buildings.enums.TypKontaEnum;
import com.buildings.model.Budynek;
import com.buildings.model.KontoRolaV;
import com.buildings.model.Miasto;
import com.buildings.model.WynajemExt;
import com.buildings.services.interfaces.BudynekService;
import com.buildings.services.interfaces.LokalService;
import com.buildings.services.interfaces.UlicaService;

@Controller
@RequestMapping("/rent")
public class RentController {

	private LokalService lokalService;
	private UlicaDao ulicaDao;
	private KontoDao kontoDao;
	
	public void setUlicaDao(UlicaDao ulicaDao) {
		this.ulicaDao = ulicaDao;
	}

	public void setKontoDao(KontoDao kontoDao) {
		this.kontoDao = kontoDao;
	}
	
	public void setLokalService(LokalService lokalService) {
		this.lokalService = lokalService;
	}
	
	@RequestMapping("/create")
	public String createRent(Model model) {
		model.addAttribute("tenantModel", new WynajemExt());
		return "createRentPage";
	}
	
	@RequestMapping("/approve")
	public String approveRent(Model model) {
		return "approveRentPage";
	}
	
	@RequestMapping("/price/set")
	public String setRentPrice(Model model) {
		model.addAttribute("cennikModel", new WynajemExt());
		return "setRentPricePage";
	}
	
	@RequestMapping(value = "/addTenant", method = RequestMethod.POST)
	public String addTenant(@ModelAttribute("SpringWeb")WynajemExt wynajem, ModelMap model) {
		lokalService.addNowyWynajem(wynajem);
	    return "redirect:/rent/create";
	}
	
	@RequestMapping(value = "/price/addNewPrice", method = RequestMethod.POST)
	public String addNewPrice(@ModelAttribute("SpringWeb")WynajemExt wynajem, ModelMap model) {
		lokalService.saveNewCennik4Lokal(wynajem);
		
		return "redirect:/rent/price/set";
	}
	
	@ModelAttribute("miastoList")
	public List<Miasto> getMiastoList() {
		return ulicaDao.getMiastoList();
	}
	
	@ModelAttribute("lokatorList")
	public List<KontoRolaV> getLokatorList() {
		return kontoDao.getKontoList4Typ(TypKontaEnum.LOKATOR);
	}
}