package com.buildings.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaymentController {

	@RequestMapping("/charges/monthly")
	public String showMonthlyCharges(Model model) {
		// model.addAttribute("customers", customerService.getAllCustomers());
		return "showMonthlyChargesPage";
	}

	@RequestMapping("/payments/history")
	public String showPaymentsHistory(Model model) {
		// model.addAttribute("customers", customerService.getAllCustomers());
		return "showPaymentsHistoryPage";
	}
	
	@RequestMapping("/payments/book")
	public String bookPayments(Model model) {
		// model.addAttribute("customers", customerService.getAllCustomers());
		return "bookPaymentsPage";
	}

}