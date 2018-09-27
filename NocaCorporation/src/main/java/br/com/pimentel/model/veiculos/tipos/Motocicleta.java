package br.com.pimentel.model.veiculos.tipos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;

import br.com.pimentel.model.enums.Acessorios;
import br.com.pimentel.model.enums.Combustivel;
import br.com.pimentel.model.enums.SituacaoOperacionalVeiculo;
import br.com.pimentel.model.locacao.PlanoLocacao;
import br.com.pimentel.model.pessoas.pessoajuridica.PessoaJuridica;
import br.com.pimentel.model.veiculos.Veiculo;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Classe que cria um veiculo do tipo Motocicleta
 */
@Entity
public class Motocicleta extends Veiculo implements Serializable {
	
	private static final long serialVersionUID = 4589086548003966362L;

	public Motocicleta() {
		super();
	}

	/**
	 * Cria um objeto Motocicleta
	 * 
	 * @param renavam Numero do Registro Nacional de Veiculos Automotores
	 * @param chassis Numero do Chassis do veiculo
	 * @param numeroMotor Numero do motor do veiculo
	 * @param placa Numero da Placa do veiculo
	 * @param marca Marca do Veiculo 
	 * @param modelo Modelo do Veiculo
	 * @param potencia Potencia (em cavalos) do veiculo
	 * @param cilindrada Dimensão cubica do cilindro do motor do veiculo
	 * @param cor Cor predominante do veiculo
	 * @param tipoCombustivel Tipo de combustivel utilizado pelo veiculo {@link Combustivel}
	 * @param anoFabricacao Ano de fabricação do veiculo
	 * @param anoModelo Ano de modelo do veiculo 
	 * @param dataAquisicao Data de aquisição do veiculo pela empresa
	 * @param locadoraBase Agencia em que esta localizado o veiculo
	 * @param nivelTanque Nivel de combustivel no tanque do veiculo
	 * @param tipoFreios Tipo de freio utilizado pelo veiculo
	 * @param ultimaDataRevisao Data da ultima revisão feita pelo veiculo
	 * @param acessorios Acessorios preentes no veiculo
	 * @param situacaoOperacional Status do veiculo, se esta locado ou não
	 * @param observacaoVeiculo Observações	
	 * @param planoLocacao Plano de Locação ao qual pertence o Veiculos
	 */
	public Motocicleta(String renavam, String chassis, String numeroMotor, String placa, String marca, String modelo,
			Integer potencia, Integer cilindrada, String cor, Combustivel tipoCombustivel, LocalDate anoFabricacao,
			LocalDate anoModelo, LocalDate dataAquisicao, PessoaJuridica locadoraBase, Double nivelTanque, String tipoFreios,
			LocalDate ultimaDataRevisao, List<Acessorios> acessorios, SituacaoOperacionalVeiculo situacaoOperacional,
			String observacaoVeiculo, PlanoLocacao planoLocacao) {
		super(renavam, chassis, numeroMotor, placa, marca, modelo, potencia, cilindrada, cor, tipoCombustivel, anoFabricacao,
				anoModelo, dataAquisicao, locadoraBase, nivelTanque, tipoFreios, ultimaDataRevisao, acessorios,
				situacaoOperacional, observacaoVeiculo, planoLocacao);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Motocicleta [toString()=" + super.toString() + "]";
	}
	
}
