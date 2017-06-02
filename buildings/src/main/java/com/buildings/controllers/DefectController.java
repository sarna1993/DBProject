package com.buildings.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/defect")
public class DefectController {

	@RequestMapping("/report")
	public String reportDefect(Model model) {
		return "reportDefectPage";
	}

}