package br.com.pimentel.repositories.pessoas.pessoafisica.funcionarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.AgenteLocacao;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Data Access Object(DAO) de Agente de Locação
 */
@Repository
public interface AgenteLocacaoRepository extends JpaRepository<AgenteLocacao, String> {

}
