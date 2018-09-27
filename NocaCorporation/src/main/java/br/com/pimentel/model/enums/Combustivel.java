/**
 * 
 */
package br.com.pimentel.model.enums;

/**
 * @author Rodrigo Pimentel
 * @NocaCorporation 
 * @2018
 *
 * Tipos de combustiveis existentes no mercado
 */
public enum Combustivel {
	
	GASOLINA("Gasolina"),
	ALCOOL("Alcool"),
	DIESEL("Oleo Diesel"),
	FLEX("Gasolina e Alcool"),
	TETRAFUEL("Gasolina, Gasolina Pura, Alcool, GNV"),
	GNV("Gas Natural");

	private String descricaoCombustivel;

	/**
	 * @param Combustivel utilizado
	 */
	private Combustivel(String descricaoCombustivel) {
		this.descricaoCombustivel = descricaoCombustivel;
	}

	/**
	 * @return Descrição do Combustivel
	 */
	public String getDescricaoCombustivel() {
		return descricaoCombustivel;
	}
	
}
