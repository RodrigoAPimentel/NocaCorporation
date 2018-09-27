package br.com.pimentel.repositories.veiculos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pimentel.model.veiculos.Veiculo;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Data Access Object(DAO) de Veiculo
 */
@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, String> {

}
