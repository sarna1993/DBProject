package com.buildings.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rent")
public class RentController {

	@RequestMapping("/create")
	public String createRent(Model model) {
		return "createRentPage";
	}
	
	@RequestMapping("/approve")
	public String approveRent(Model model) {
		return "approveRentPage";
	}
	
	@RequestMapping("/price/set")
	public String setRentPrice(Model model) {
		return "setRentPricePage";
	}

}