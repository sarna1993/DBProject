package com.buildings.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.buildings.dao.interfaces.HistPlatDao;
import com.buildings.dao.interfaces.LokatorDao;
import com.buildings.dao.interfaces.RozliczeniaDao;
import com.buildings.model.Lokator;

@Controller
public class PaymentController {

	private RozliczeniaDao rozliczeniaDao;
	private HistPlatDao histPlatDao;
	private LokatorDao lokatorDao;
	
	public void setRozliczeniaDao(RozliczeniaDao rozliczeniaDao) {
		this.rozliczeniaDao = rozliczeniaDao;
	}

	public void setHistPlatDao(HistPlatDao histPlatDao) {
		this.histPlatDao = histPlatDao;
	}
	
	public void setLokatorDao(LokatorDao lokatorDao) {
		this.lokatorDao = lokatorDao;
	}
	
	@RequestMapping("/charges/monthly")
	public String showMonthlyCharges(Model model) {
		String login = SecurityContextHolder.getContext().getAuthentication().getName();
		Lokator lokator = lokatorDao.getLokatorByUsername(login);
		model.addAttribute("payments", histPlatDao.getHistPlat(lokator.getIdLokat()));
		return "showMonthlyChargesPage";
	}

	@RequestMapping("/payments/history")
	public String showPaymentsHistory(Model model) {
		String login = SecurityContextHolder.getContext().getAuthentication().getName();
		Lokator lokator = lokatorDao.getLokatorByUsername(login);
		model.addAttribute("payments", rozliczeniaDao.getRozliczenieList(lokator.getIdLokat()));
		return "showPaymentsHistoryPage";
	}
	
	@RequestMapping("/payments/book")
	public String bookPayments(Model model) {
		// model.addAttribute("customers", customerService.getAllCustomers());
		return "bookPaymentsPage";
	}

}