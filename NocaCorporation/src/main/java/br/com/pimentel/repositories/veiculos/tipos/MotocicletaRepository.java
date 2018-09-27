package br.com.pimentel.repositories.veiculos.tipos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pimentel.model.veiculos.tipos.Motocicleta;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Data Access Object(DAO) de Motocicleta
 */
@Repository
public interface MotocicletaRepository extends JpaRepository<Motocicleta, String> {

}
