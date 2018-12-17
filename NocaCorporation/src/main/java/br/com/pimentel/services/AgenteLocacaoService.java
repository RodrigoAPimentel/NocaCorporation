package br.com.pimentel.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.AgenteLocacao;
import br.com.pimentel.repositories.pessoas.pessoafisica.funcionarios.AgenteLocacaoRepository;

@Service
public class AgenteLocacaoService {
	
	private static final Logger logger = LoggerFactory.getLogger(AgenteLocacaoService.class);
	
	@Autowired
	private AgenteLocacaoRepository repository;
	
	@Transactional
	public void salvar(AgenteLocacao agenteLocacao) {
		logger.info(" ==> Salvando agente de locação com matricula: [{}]", agenteLocacao.getMatricula());
		repository.save(agenteLocacao);
	}

}
