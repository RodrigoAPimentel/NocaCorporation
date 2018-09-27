/**
 * 
 */
package br.com.pimentel.model.pessoas.pessoajuridica.empresas;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;

import br.com.pimentel.model.documentos.DocumentoPJ;
import br.com.pimentel.model.enderecos.EnderecoImpl;
import br.com.pimentel.model.pessoas.pessoafisica.PessoaFisica;
import br.com.pimentel.model.pessoas.pessoajuridica.PessoaJuridica;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Classe que abstrai uma Pessoa Juridica do tipo Locadora de Veiculos
 */
@Entity
public class LocadoraVeiculo extends PessoaJuridica implements Serializable {

	private static final long serialVersionUID = 37419586408611071L;
	
	private Integer quantidadeDeVeiculos;
	
	public LocadoraVeiculo() {
		super();
	}

	/**
	 * Cria uma locadora de veiculos
	 * 
	 * @param cnpj Numero do Cadastro Nacional de Pessoa Juridica (CNPJ)
	 * @param razaoSocial Razão social da empresa
	 * @param nomeFantasia Nome fantasia da empresa
	 * @param endereco Endereço da empresa
	 * @param documento Documentos da empresa
	 * @param dataFundacao Data de fundação da empresa
	 * @param numeroDeFuncionarios Numero de funcionarios da empresa
	 * @param propietario Proprietario da empresa
	 * @param pessoaDeContato Pessoa para pessoaDeContato da empresa
	 * @param matriz Se a empresa é a matriz ou filial (TRUE - Matiz | FALSE - Filial)
	 * @param observacao Observações
	 * @param quantidadeDeVeiculos Quantidade de Veiculos da locadora
	 */
	public LocadoraVeiculo(String cnpj, String razaoSocial, String nomeFantasia, EnderecoImpl endereco, DocumentoPJ documento,
			LocalDate dataFundacao, Integer numeroDeFuncionarios, PessoaFisica propietario, PessoaFisica pessoaDeContato,
			Boolean matriz, String observacao, Integer quantidadeDeVeiculos) {
		super(cnpj.replaceAll("[^0-9]", ""), razaoSocial, nomeFantasia, endereco, documento, dataFundacao, numeroDeFuncionarios, propietario,
				pessoaDeContato, matriz, observacao);
		this.quantidadeDeVeiculos = quantidadeDeVeiculos;
	}

	/**
	 * Retorna a quantidade de veiculos
	 * @return Quantidade de veiculos
	 */
	public Integer getQuantidadeDeVeiculos() {
		return quantidadeDeVeiculos;
	}

	/**
	 * Altera a quantidade de veiculos
	 * @param quantidadeDeVeiculos Quantidade de veiculos
	 */
	public void setQuantidadeDeVeiculos(Integer quantidadeDeVeiculos) {
		this.quantidadeDeVeiculos = quantidadeDeVeiculos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((quantidadeDeVeiculos == null) ? 0 : quantidadeDeVeiculos.hashCode());
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
		if (!(obj instanceof LocadoraVeiculo)) {
			return false;
		}
		LocadoraVeiculo other = (LocadoraVeiculo) obj;
		if (quantidadeDeVeiculos == null) {
			if (other.quantidadeDeVeiculos != null) {
				return false;
			}
		} else if (!quantidadeDeVeiculos.equals(other.quantidadeDeVeiculos)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LocadoraVeiculo [ " + super.toString() + "quantidadeDeVeiculos=" + quantidadeDeVeiculos + "]";
	}

}
