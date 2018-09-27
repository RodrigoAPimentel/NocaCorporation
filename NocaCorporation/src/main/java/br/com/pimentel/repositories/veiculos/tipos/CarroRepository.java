package br.com.pimentel.repositories.veiculos.tipos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pimentel.model.veiculos.tipos.Carro;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Data Access Object(DAO) de Carro
 */
@Repository
public interface CarroRepository extends JpaRepository<Carro, String> {

}
