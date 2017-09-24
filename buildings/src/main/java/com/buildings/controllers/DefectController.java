package com.buildings.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.buildings.model.Usterka;
import com.buildings.services.interfaces.UsterkaService;

@Controller
@RequestMapping("/defect")
public class DefectController {

	private UsterkaService usterkaService;
	
	public void setUsterkaService(UsterkaService usterkaService) {
		this.usterkaService = usterkaService;
	}
	
	@RequestMapping("/report")
	public String reportDefect(Model model) {
		model.addAttribute("ustModel", new Usterka());
		return "reportDefectPage";
	}

	@RequestMapping(value = "/addDefect", method = RequestMethod.POST)
	public String addDefect(@ModelAttribute("SpringWeb")Usterka usterka, ModelMap model) {
	    usterkaService.addUsterka(usterka);
		return "redirect:/panel/tenant";
	}
}