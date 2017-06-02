package com.buildings.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tenant")
public class TenantController {

	@RequestMapping("/add")
	public String addTenant(Model model) {
		return "addTenantPage";
	}

}