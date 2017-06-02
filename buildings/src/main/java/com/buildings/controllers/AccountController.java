package com.buildings.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

	@RequestMapping("/add")
	public String addBuildingOrLocal(Model model) {
		return "addAccountPage";
	}

}