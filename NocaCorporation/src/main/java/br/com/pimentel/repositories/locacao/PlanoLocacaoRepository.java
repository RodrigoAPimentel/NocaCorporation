package br.com.pimentel.repositories.locacao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pimentel.model.locacao.PlanoLocacao;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Data Access Object(DAO) de Plano Locação
 */
@Repository
public interface PlanoLocacaoRepository extends JpaRepository<PlanoLocacao, Integer> {

	public PlanoLocacao findByNomePlano(String nomePlano);
	
}
