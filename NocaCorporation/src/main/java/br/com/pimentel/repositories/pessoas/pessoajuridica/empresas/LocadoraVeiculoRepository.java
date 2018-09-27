package br.com.pimentel.repositories.pessoas.pessoajuridica.empresas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pimentel.model.pessoas.pessoajuridica.empresas.LocadoraVeiculo;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Data Access Object(DAO) de Locadora de Veiculo
 */
@Repository
public interface LocadoraVeiculoRepository extends JpaRepository<LocadoraVeiculo, String> {

}
