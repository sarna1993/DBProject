package com.buildings.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/building")
public class BuildingController {

	@RequestMapping("/add")
	public String addBuildingOrLocal(Model model) {
		return "addBuildingPage";
	}

}