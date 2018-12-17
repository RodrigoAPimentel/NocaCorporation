package br.com.pimentel.controllers;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.pimentel.model.enums.CategoriaHabilitacao;
import br.com.pimentel.model.enums.EstadoCivil;
import br.com.pimentel.model.enums.GrauInstrucao;
import br.com.pimentel.model.pessoas.pessoafisica.clientes.ClientePF;
import br.com.pimentel.services.ClientePFService;
import br.com.pimentel.util.GeradorCodigo;

@Controller
@RequestMapping("/clientePF")
public class ClienteController {
	
	private static final Logger logger = LoggerFactory.getLogger(ClienteController.class);
	
	@Autowired
	private ClientePFService clientePFService;
	
	@GetMapping
	public ModelAndView dashboardFuncionario() {
		logger.info("@@ ABRINDO CLIENTE-PF");
		
		ModelAndView mv = new ModelAndView("dashboard/clientePF");
		

		mv.addObject("estadosCivil", EstadoCivil.values());
		mv.addObject("grausInstrucao", GrauInstrucao.values());
		mv.addObject("categoriasHabilitacao", CategoriaHabilitacao.values());
		
		mv.addObject("clientePF", new ClientePF());
		
		return mv;
	}
	
	@PostMapping("/add")
	public void add(ClientePF clientePF) {
		logger.info("@@ CADASTRANDO CLIENTE");
		
		clientePF.setDataCadastro(LocalDate.now());
		clientePF.setCodigo(GeradorCodigo.codigoClientePF(clientePF.getCpf(), LocalDate.now()));
		
		clientePFService.salvar(clientePF);
		
		logger.info("@@ CLIENTE COM CODIGO [{}] CADASTRADO", clientePF.getCodigo());
		
		
	}
	
}
