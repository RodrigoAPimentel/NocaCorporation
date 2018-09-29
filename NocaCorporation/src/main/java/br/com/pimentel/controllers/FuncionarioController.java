package br.com.pimentel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dashboard/funcionario")
public class FuncionarioController {
	
	@GetMapping("")
	public ModelAndView dashboard() {

	return new ModelAndView("dashboard/itens/funcionarioCadastro");
	}

}
