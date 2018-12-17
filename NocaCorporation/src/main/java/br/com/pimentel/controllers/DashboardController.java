package br.com.pimentel.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {
	
	private static final Logger logger = LoggerFactory.getLogger(DashboardController.class);
	
	@GetMapping
	public ModelAndView dashboard() {
		logger.info("@@ ABRINDO DASHBOARD");
		
		return new ModelAndView("dashboard/dashboard");
	}
	
	
}
