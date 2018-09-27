/**
 * 
 */
package br.com.pimentel.model.enums;

/**
 * @author Rodrigo Pimentel
 * @NocaCorporation @2018
 *
 * Cargos de uma Empresa
 */
public enum Cargo {
	
	GERENTE("Gerente"),
	ASSISTENTEADMINISTRATIVO("Assistente Administrativo"),
	AGENTELOCACAO("Agente de Locação"),
	MECANICO("Mecânico");
	
	private String descricaoCargo;

	/**
	 * @param descricaoCargo Descrição do Cargo
	 */
	private Cargo(String descricaoCargo) {
		this.descricaoCargo = descricaoCargo;
	}

	/**
	 * @return Retorna a Descrição do Cargo
	 */
	public String getDescricaoCargo() {
		return descricaoCargo;
	}

}
