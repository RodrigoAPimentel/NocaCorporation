package br.com.pimentel.repositories.pessoas.pessoajuridica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pimentel.model.pessoas.pessoajuridica.PessoaJuridica;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Data Access Object(DAO) de Pessoa Juridica
 */
@Repository
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, String> {

}
