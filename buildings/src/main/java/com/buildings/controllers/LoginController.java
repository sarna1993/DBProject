package com.buildings.controllers;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.buildings.dao.interfaces.KontoDao;

@Controller
public class LoginController {
	
	private KontoDao kontoDao;
	
	public void setKontoDao(KontoDao kontoDao) {
		this.kontoDao = kontoDao;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {
		
		ModelAndView model = new ModelAndView();
		if(error != null) {
			model.addObject("error", "Invalid username and password!");
		}
		
		if(logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		
		model.setViewName("loginPage");
		return model;
	}

	@RequestMapping(value = "/adminAuth", method = RequestMethod.GET)
	public String adminPage(HttpServletRequest request) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();
		String userData = kontoDao.getImieNazwiskoByLogin(username);
		request.getSession().setAttribute("userData", userData);
		return "redirect:/panel/admin";
	}
	
	@RequestMapping(value = "/managerAuth", method = RequestMethod.GET)
	public String managerPage(HttpServletRequest request) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();
		String userData = kontoDao.getImieNazwiskoByLogin(username);
		request.getSession().setAttribute("userData", userData);
		return "redirect:/panel/manager";
	}
	
	@RequestMapping(value = "/receptionistAuth", method = RequestMethod.GET)
	public String receptionistPage(HttpServletRequest request) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();
		String userData = kontoDao.getImieNazwiskoByLogin(username);
		request.getSession().setAttribute("userData", userData);
		return "redirect:/panel/receptionist";
	}
	
	@RequestMapping(value = "/tenantAuth", method = RequestMethod.GET)
	public String tenantPage(HttpServletRequest request) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();
		String userData = kontoDao.getImieNazwiskoByLogin(username);
		request.getSession().setAttribute("userData", userData);
		return "redirect:/panel/tenant";
	}
	
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied(Principal user) {
		ModelAndView model = new ModelAndView();
		model.addObject("msg", "Nie masz uprawnien do przegladania tej strony.");
		model.setViewName("403");
		return model;
	}
	
	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginerror(Model model) {
		model.addAttribute("error", "true");
		return "loginPage";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model) {
		return "loginPage";
	}
}