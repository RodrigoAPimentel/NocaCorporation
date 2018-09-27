package br.com.pimentel.repositories.pessoas.pessoajuridica.clientes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pimentel.model.pessoas.pessoajuridica.ClientePJ;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Data Access Object(DAO) de Cliente Pessoa Juridica
 */
@Repository
public interface ClientePJRepository extends JpaRepository<ClientePJ, String> {

}
