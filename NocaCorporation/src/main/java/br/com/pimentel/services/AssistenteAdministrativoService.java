package br.com.pimentel.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.AssistenteAdministrativo;
import br.com.pimentel.repositories.pessoas.pessoafisica.funcionarios.AssistenteAdministrativoRepository;

@Service
public class AssistenteAdministrativoService {
	
	private static final Logger logger = LoggerFactory.getLogger(AssistenteAdministrativoService.class);
	
	@Autowired
	private AssistenteAdministrativoRepository repository;
	
	@Transactional
	public void salvar(AssistenteAdministrativo assistenteAdministrativo) {
		logger.info(" ==> Salvando assistente administrativo com matricula: [{}]", assistenteAdministrativo.getMatricula());
		repository.save(assistenteAdministrativo);
	}

}
