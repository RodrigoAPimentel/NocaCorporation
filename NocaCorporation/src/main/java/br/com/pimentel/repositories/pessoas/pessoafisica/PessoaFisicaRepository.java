package br.com.pimentel.repositories.pessoas.pessoafisica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pimentel.model.pessoas.pessoafisica.PessoaFisica;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Data Access Object(DAO) de Pessoa Fisica
 */
@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, String> {

}
