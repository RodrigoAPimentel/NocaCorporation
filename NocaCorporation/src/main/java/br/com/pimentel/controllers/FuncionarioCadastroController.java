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

import br.com.pimentel.model.enums.Cargo;
import br.com.pimentel.model.enums.CategoriaHabilitacao;
import br.com.pimentel.model.enums.EstadoCivil;
import br.com.pimentel.model.enums.GrauInstrucao;
import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.AgenteLocacao;
import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.AssistenteAdministrativo;
import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.Gerente;
import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.Mecanico;
import br.com.pimentel.services.AgenteLocacaoService;
import br.com.pimentel.services.AssistenteAdministrativoService;
import br.com.pimentel.services.GerenteService;
import br.com.pimentel.services.MecanicoService;
import br.com.pimentel.util.GeradorCodigo;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioCadastroController {
	
	private static final Logger logger = LoggerFactory.getLogger(FuncionarioCadastroController.class);
	
	@Autowired
	private GerenteService gerenteService;
	
	@Autowired
	private AssistenteAdministrativoService assistenteAdministrativoService;
	
	@Autowired
	private AgenteLocacaoService agenteLocacaoService;
	
	@Autowired
	private MecanicoService mecanicoService;
	
	
	@GetMapping
	public ModelAndView dashboardFuncionario() {
		logger.info("@@ ABRINDO FUNCIONARIO");
		
		ModelAndView mv = new ModelAndView("dashboard/funcionario");
		
		mv.addObject("cargos", Cargo.values());
		mv.addObject("estadosCivil", EstadoCivil.values());
		mv.addObject("grausInstrucao", GrauInstrucao.values());
		mv.addObject("categoriasHabilitacao", CategoriaHabilitacao.values());
		
		mv.addObject("funcionarioGerente", new Gerente());
		mv.addObject("funcionarioAssistenteAdministrativo", new AssistenteAdministrativo());
		mv.addObject("funcionarioAgenteLocacao", new AgenteLocacao());
		mv.addObject("funcionarioMecanico", new Mecanico());
		
		return mv;
	}
	
	@PostMapping("/addGerente")
	public String addGerente(Gerente funcionarioGerente) {
		logger.info("@@ CADASTRANDO GERENTE");
		
		funcionarioGerente.setCargo(Cargo.GERENTE);
		funcionarioGerente.setMatricula(GeradorCodigo.matriculaFuncionario(funcionarioGerente.getCpf(), LocalDate.now()));
		gerenteService.salvar(funcionarioGerente);
		
		logger.info("@@ GERENTE COM MATRICULA [{}] CADASTRADO", funcionarioGerente.getMatricula());
		
		return "redirect:/dashboard";
	}
	
	@PostMapping("/addAssistenteAdministrativo")
	public String addAssistenteAdministrativo(AssistenteAdministrativo funcionarioAssistenteAdministrativo) {
		logger.info("@@ CADASTRANDO ASSISTENTE ADMINISTRATIVO");
		
		funcionarioAssistenteAdministrativo.setCargo(Cargo.ASSISTENTEADMINISTRATIVO);
		funcionarioAssistenteAdministrativo.setMatricula(GeradorCodigo.matriculaFuncionario(funcionarioAssistenteAdministrativo.getCpf(), LocalDate.now()));
		assistenteAdministrativoService.salvar(funcionarioAssistenteAdministrativo);
		
		logger.info("@@ ASSISTENTE ADMINISTRATIVO COM MATRICULA [{}] CADASTRADO", funcionarioAssistenteAdministrativo.getMatricula());
		
		return "redirect:/dashboard";
	}
	
	@PostMapping("/addAgenteLocacao")
	public String addAgenteLocacao(AgenteLocacao funcionarioAgenteLocacao) {
		logger.info("@@ CADASTRANDO AGENTE DE LOCAÇÃO");
		
		funcionarioAgenteLocacao.setCargo(Cargo.AGENTELOCACAO);
		funcionarioAgenteLocacao.setMatricula(GeradorCodigo.matriculaFuncionario(funcionarioAgenteLocacao.getCpf(), LocalDate.now()));
		agenteLocacaoService.salvar(funcionarioAgenteLocacao);
		
		logger.info("@@ AGENTE DE LOCAÇÃO COM MATRICULA [{}] CADASTRADO", funcionarioAgenteLocacao.getMatricula());
		
		return "redirect:/dashboard";
	}
	
	@PostMapping("/addMecanico")
	public String addMecanico(Mecanico funcionarioMecanico) {
		logger.info("@@ CADASTRANDO MECANICO");
		
		funcionarioMecanico.setCargo(Cargo.MECANICO);
		funcionarioMecanico.setMatricula(GeradorCodigo.matriculaFuncionario(funcionarioMecanico.getCpf(), LocalDate.now()));
		mecanicoService.salvar(funcionarioMecanico);
		
		logger.info("@@ MECANICO COM MATRICULA [{}] CADASTRADO", funcionarioMecanico.getMatricula());
		
		return "redirect:/dashboard";
	}
	
}
