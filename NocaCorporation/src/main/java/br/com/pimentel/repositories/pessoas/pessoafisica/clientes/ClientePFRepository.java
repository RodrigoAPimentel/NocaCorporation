package br.com.pimentel.repositories.pessoas.pessoafisica.clientes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pimentel.model.pessoas.pessoafisica.clientes.ClientePF;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Data Access Object(DAO) de Cliente Pessoa Fisica
 */
@Repository
public interface ClientePFRepository extends JpaRepository<ClientePF, String> {

}
