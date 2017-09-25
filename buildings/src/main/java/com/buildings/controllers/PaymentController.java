package com.buildings.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.buildings.dao.interfaces.HistPlatDao;
import com.buildings.dao.interfaces.LokatorDao;
import com.buildings.dao.interfaces.RozliczeniaDao;
import com.buildings.enums.TypKontaEnum;
import com.buildings.model.HistPlat;
import com.buildings.model.Konto;
import com.buildings.model.Lokator;
import com.buildings.model.Okres;
import com.buildings.model.Rozliczenie;
import com.buildings.model.WynajemExt;
import com.buildings.services.interfaces.KontoService;
import com.buildings.services.interfaces.OkresService;
import com.buildings.services.interfaces.PlatnosciService;

@Controller
public class PaymentController {

	private RozliczeniaDao rozliczeniaDao;
	private HistPlatDao histPlatDao;
	private LokatorDao lokatorDao;
	@Autowired
	private PlatnosciService platnosciService;

	@Autowired
	private OkresService okresService;
	
	@Autowired
	private KontoService kontoService;
	
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
		model.addAttribute("histPlatModel", new HistPlat());
		model.addAttribute("lokatorList", kontoService.getKontoList4Typ(TypKontaEnum.LOKATOR));
		return "bookPaymentsPage";
	}
	
	@RequestMapping(value = "/payments/bookNewPayment", method = RequestMethod.POST)
	public String bookNewPayments(@ModelAttribute("SpringWeb")HistPlat histPlatModel, ModelMap model) {
		platnosciService.bookNewPayment(histPlatModel);
	    return "redirect:/payments/book";
	}
	
	@RequestMapping("/charges/monthly/create")
	public String createMonthlyCharges(Model model) {
		model.addAttribute("histPlatModel", new HistPlat());
		model.addAttribute("monthList", okresService.getMonths());
		model.addAttribute("yearList", okresService.getYears());
		model.addAttribute("rozliczenieModel", new Rozliczenie());
		model.addAttribute("lokatorList", kontoService.getKontoList4Typ(TypKontaEnum.LOKATOR));
		return "createMonthlyChargesPage";
	}
	
	@RequestMapping(value = "/charges/monthly/createNewMonthlyCharges", method = RequestMethod.POST)
	public String createNewMonthlyCharges(@ModelAttribute("SpringWeb") Rozliczenie rozliczenie, ModelMap model) {
		platnosciService.createMonthlyCharges(rozliczenie);
		return "redirect:/charges/monthly/create";
	}

}