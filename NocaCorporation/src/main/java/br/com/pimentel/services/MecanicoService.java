package br.com.pimentel.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.Mecanico;
import br.com.pimentel.repositories.pessoas.pessoafisica.funcionarios.MecanicoRepository;

@Service
public class MecanicoService {
	
	private static final Logger logger = LoggerFactory.getLogger(MecanicoService.class);
	
	@Autowired
	private MecanicoRepository repository;
	
	@Transactional
	public void salvar(Mecanico mecanico) {
		logger.info(" ==> Salvando mecanico com matricula: [{}]", mecanico.getMatricula());
		repository.save(mecanico);
	}

}
