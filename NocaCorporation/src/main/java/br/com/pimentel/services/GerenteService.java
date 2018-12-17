package br.com.pimentel.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.Gerente;
import br.com.pimentel.repositories.pessoas.pessoafisica.funcionarios.GerenteRepository;

@Service
public class GerenteService {
	
	private static final Logger logger = LoggerFactory.getLogger(GerenteService.class);
	
	@Autowired
	private GerenteRepository repository;
	
	@Transactional
	public void salvar(Gerente gerente) {
		logger.info(" ==> Salvando gerente com matricula: [{}]", gerente.getMatricula());
		repository.save(gerente);
	}

}
