package br.com.pimentel.model.locacao;

import java.util.List;

import br.com.pimentel.model.veiculos.Veiculo;

/**
 * @author Rodrigo Pimentel
 * @LocadoraNocaCorporation @2018
 *
 * Interface que abstrai um plano de locação
 */
public interface PlanoLocacaoIF {
	
	/**
	 * Retorna o ID do Plano de Locação
	 * @return ID
	 */
	public Integer getIdPlanoLocacao();
	
	/**
	 * Retorna o nome do Plano de Locação
	 * @return Nome do Plano Locação
	 */
	public String getNomePlano();
	
	/**
	 * Altera o nome do Plano de Locação
	 * @param nomePlano Nome do Plano Locação
	 */
	public void setNomePlano(String nomePlano);
	
	/**
	 * Retorna a lista de veiculos que fazem parte do Plano de Locação
	 * @return Veiculos do Plano de Locação
	 */
	public List<Veiculo> getVeiculos();
	
	/**
	 * Altera a lista de veiculos que fazem parte do Plano de Locação
	 * @param veiculos Veiculos do Plano de Locação
	 */
	public void setVeiculos(List<Veiculo> veiculos);
	
	/**
	 * Retorna o Preço do Plano de Locação
	 * @return Preço do Plano
	 */
	public Double getPreco();
	
	/**
	 * Altera o Preço do Plano de Locação
	 * @param preco Preço do Plano
	 */
	public void setPreco(Double preco);
	
	/**
	 * Retorna as observações do Plano de Locação
	 * @return Observações do Plano de Locação
	 */
	public String getObservacao();
	
	/**
	 * Altera as observações do Plano de Locação
	 * @param observacao Observações do Plano de Locação
	 */
	public void setObservacao(String observacao);	
	
}
