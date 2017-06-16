package com.buildings.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.buildings.model.Konto;
import com.buildings.model.KontoRolaV;
import com.buildings.services.interfaces.KontoService;

@Controller
@RequestMapping("/account")
public class AccountController {

	private KontoService kontoService;
	
	public void setKontoService(KontoService kontoService) {
		this.kontoService = kontoService;
	}
	
	@RequestMapping("/register")
	public String addAccount(Model model) {
		model.addAttribute("kontoModel", new Konto());
		return "addAccountPage";
	}

	@RequestMapping(value = "/addAccount", method = RequestMethod.POST)
	public String addAccount(@ModelAttribute("SpringWeb")Konto konto, ModelMap model) {
		kontoService.addKonto(konto); 
	    return "redirect:/account/register";
	}
	
    @RequestMapping(value = "/manage", method = RequestMethod.GET)
    public String listUsers(ModelMap model) {
 
        List<KontoRolaV> users = kontoService.getAllKontoList();
        model.addAttribute("users", users);
        return "manageAccount";
    }
    
    @RequestMapping(value = { "/enable-{login}" }, method = RequestMethod.GET)
    public String enableUser(@PathVariable String login, ModelMap model) {
        kontoService.setAktywacjaKonta(login, true);
        List<KontoRolaV> users = kontoService.getAllKontoList();
        model.addAttribute("users", users);
        return "manageAccount";
    }
    
    @RequestMapping(value = { "/disable-{login}" }, method = RequestMethod.GET)
    public String disableUser(@PathVariable String login, ModelMap model) {
        kontoService.setAktywacjaKonta(login, false);
        List<KontoRolaV> users = kontoService.getAllKontoList();
        model.addAttribute("users", users);
        return "manageAccount";
    }
    
    @RequestMapping(value = { "/delete-{login}" }, method = RequestMethod.GET)
    public String deleteUser(@PathVariable String login, ModelMap model) {
    	kontoService.removeKonto(login);
        List<KontoRolaV> users = kontoService.getAllKontoList();
        model.addAttribute("users", users);
        return "manageAccount";
    }
	/********************** Model Attributes ******************/
	@ModelAttribute("rolesList")
	public List<String> getRolesList() {
		return kontoService.getTypyKontaList();
	}
}