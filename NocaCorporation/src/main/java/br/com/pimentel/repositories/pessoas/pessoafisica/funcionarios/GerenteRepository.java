package br.com.pimentel.repositories.pessoas.pessoafisica.funcionarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.Gerente;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Data Access Object(DAO) de Gerente
 */
@Repository
public interface GerenteRepository extends JpaRepository<Gerente, String> {

}
