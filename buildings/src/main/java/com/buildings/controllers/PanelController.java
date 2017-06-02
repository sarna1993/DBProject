package com.buildings.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/panel")
public class PanelController {

	@RequestMapping("/admin")
	public String showAdminPanel(Model model) {
		return "adminPanelPage";
	}

	@RequestMapping("/tenant")
	public String showTenatPanel(Model model) {
		return "tenantPanelPage";
	}
	
	@RequestMapping("/receptionist")
	public String showBasiaPanel(Model model) {
		return "receptionistPanelPage";
	}

	@RequestMapping("/manager")
	public String showManagerPanel(Model model) {
		return "managerPanelPage";
	}

}
