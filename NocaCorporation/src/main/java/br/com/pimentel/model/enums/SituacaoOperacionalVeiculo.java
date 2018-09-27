/**
 * 
 */
package br.com.pimentel.model.enums;

/**
 * @author Rodrigo Pimentel
 * @NocaCorporation @2018
 * 
 * Situacao Operacional do Veiculo
 */
public enum SituacaoOperacionalVeiculo {

	LOCADO("Locado"),
	REVISAO("Em Revisão"),
	DISPONIVEL("Disponivel"),
	FORADESERVICO("Fora de serviço"),
	EMUSO("Em uso pela empresa");

	private String descricaoSituacaoOperacionalVeiculo;

	/**
	 * @param Status de utilização do veiculo
	 */
	private SituacaoOperacionalVeiculo(String descricaoDeStatus) {
		this.descricaoSituacaoOperacionalVeiculo = descricaoDeStatus;
	}

	/**
	 * @return Descrição de qual status esta o veiculo
	 */
	public String getDescricaoSituacaoOperacionalVeiculo() {
		return descricaoSituacaoOperacionalVeiculo;
	}

}
