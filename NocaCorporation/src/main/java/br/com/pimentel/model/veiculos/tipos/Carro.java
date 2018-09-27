package br.com.pimentel.model.veiculos.tipos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
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
 * Classe que cria um veiculo do tipo Carro
 */
@Entity
public class Carro extends Veiculo implements Serializable {

	private static final long serialVersionUID = 1852002184564765128L;
	
	@Column(length=5) private Integer quantidadePortas;
	@Column(length=5) private Integer capacidadeOcupantes;
	
	public Carro() {
		super();
	}

	/**
	 * Cria um objeto Carro
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
	 * @param quantidadePortas Quantidade de portas do Carro2
	 * @param capacidadeOcupantes Capacidade de ocupantes do veiculo
	 * @param planoLocacao Plano de Locação ao qual pertence o Veiculos
	 */
	public Carro(String renavam, String chassis, String numeroMotor, String placa, String marca, String modelo,
			Integer potencia, Integer cilindrada, String cor, Combustivel tipoCombustivel, LocalDate anoFabricacao,
			LocalDate anoModelo, LocalDate dataAquisicao, PessoaJuridica locadoraBase, Double nivelTanque, String tipoFreios,
			LocalDate ultimaDataRevisao, List<Acessorios> acessorios, SituacaoOperacionalVeiculo situacaoOperacional,
			String observacaoVeiculo, PlanoLocacao planoLocacao, Integer quantidadePortas, Integer capacidadeOcupantes) {
		super(renavam, chassis, numeroMotor, placa, marca, modelo, potencia, cilindrada, cor, tipoCombustivel,
				anoFabricacao, anoModelo, dataAquisicao, locadoraBase, nivelTanque, tipoFreios, ultimaDataRevisao,
				acessorios, situacaoOperacional, observacaoVeiculo, planoLocacao);
		this.quantidadePortas = quantidadePortas;
		this.capacidadeOcupantes = capacidadeOcupantes;
	}

	/**
	 * Retorna a quantidade de portas do carro
	 * @return Quantidade de portas do carro
	 */
	public Integer getQuantidadePortas() {
		return quantidadePortas;
	}

	/**
	 * Altera a quantidade de portas do carro
	 * @param quantidadePortas Quantidade de portas do carro
	 */
	public void setQuantidadePortas(Integer quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	/**
	 * Retorna a capacidade de Ocupantes
	 * @return Capacidade de Ocupantes
	 */
	public Integer getCapacidadeOcupantes() {
		return capacidadeOcupantes;
	}

	/**
	 * Altera a capacidade de Ocupantes
	 * @param capacidadeOcupantes Capacidade de Ocupantes
	 */
	public void setCapacidadeOcupantes(Integer capacidadeOcupantes) {
		this.capacidadeOcupantes = capacidadeOcupantes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((capacidadeOcupantes == null) ? 0 : capacidadeOcupantes.hashCode());
		result = prime * result + ((quantidadePortas == null) ? 0 : quantidadePortas.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Carro)) {
			return false;
		}
		Carro other = (Carro) obj;
		if (capacidadeOcupantes == null) {
			if (other.capacidadeOcupantes != null) {
				return false;
			}
		} else if (!capacidadeOcupantes.equals(other.capacidadeOcupantes)) {
			return false;
		}
		if (quantidadePortas == null) {
			if (other.quantidadePortas != null) {
				return false;
			}
		} else if (!quantidadePortas.equals(other.quantidadePortas)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Carro [quantidadePortas=" + quantidadePortas + ", capacidadeOcupantes=" + capacidadeOcupantes
				+ ", toString()=" + super.toString() + "]";
	}

}
