package br.com.pimentel.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.pimentel.model.pessoas.pessoafisica.clientes.ClientePF;
import br.com.pimentel.repositories.pessoas.pessoafisica.clientes.ClientePFRepository;

@Service
public class ClientePFService {
	
	private static final Logger logger = LoggerFactory.getLogger(ClientePFService.class);
	
	@Autowired
	private ClientePFRepository repository;
	
	@Transactional
	public void salvar(ClientePF clientePF) {
		logger.info(" ==> Salvando cliente PF com codigo: [{}]", clientePF.getCodigo());
		repository.save(clientePF);
	}

}
