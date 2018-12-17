package br.com.pimentel.model.pessoas;

import java.time.LocalDate;

/**
 * @author Rodrigo Pimentel
 * @LocadoraNocaCorporation @2018
 *
 * Interface para abstratir as funções de um Cliente
 */
public interface Cliente {
	
	/**
	 * Retorna o Codigo de identificação do cliente
	 * @return Codigo de identificação do cliente
	 */
	public String getCodigo();
	
	/**
	 * Altera o Codigo de identificação do cliente
	 * @param codigo Codigo de identificação do cliente
	 */
	public void setCodigo(String codigo);
	
	/**
	 * Retorna a quantidade maxima de veiculo que podem ser locados ao mesmo tempo
	 * @return Quantidade de veiculos permitido
	 */
	public Integer getQuantidadePermitidaLocacao();
	
	/**
	 * Altera a quantidade maxima de veiculo que podem ser locados ao mesmo tempo
	 * @return Quantidade de veiculos permitido
	 */
	public void setQuantidadePermitidaLocacao(Integer quantidadePermitida);
	
	/**
	 * Retorna o debito existente do cliente
	 * @return Valor do debito
	 */
	public Double getDebito(); 
	
	/**
	 * Altera o debito existente do cliente
	 * @return Valor do debito
	 */
	public void setDebito(Double debito); 

	/**
	 * Retorna a data de cadastro
	 * @return Data de cadastro
	 */
	public LocalDate getDataCadastro();

	/**
	 * Altera a data de cadastro
	 * @param Data de cadastro
	 */
	public void setDataCadastro(LocalDate dataCadastro);

}
