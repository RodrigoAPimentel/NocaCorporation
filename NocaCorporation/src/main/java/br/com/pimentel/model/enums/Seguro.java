package br.com.pimentel.model.enums;

/**
 * @author Rodrigo Pimentel
 * @NocaCorporation @2018
 *
 * Opções de Seguro
 */
public enum Seguro {
	
	COBERTURAPARCIAL("Arranhões, amassados leves, acessórios danificados, etc"),
	COBERTURATOTAL("Roubo e perda total do veículo");
	
	private String descricaoSeguro;

	/**
	 * Constroi um tipo de seguro
	 * @param descricaoSeguro Descreve o tipo de seguro
	 */
	private Seguro(String descricaoSeguro) {
		this.descricaoSeguro = descricaoSeguro;
	}

	/**
	 * Retorna a descrição do tipo de seguro
	 * @return Descrição do Seguro
	 */
	public String getDescricaoSeguro() {
		return descricaoSeguro;
	}	

}
