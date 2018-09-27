/**
 * 
 */
package br.com.pimentel.model.enums;

/**
 * @author Rodrigo Pimentel
 * @NocaCorporation @2018
 *
 * Estados civis
 */
public enum EstadoCivil {

	SOLTEIRO("Solteiro"),
	CASADO("Casado"),
	SEPARADO("Separado Judicialmente"),
	DIVORCIADO("Divorciado"),
	VIUVO("Viúvo");
	
	private String descricaoEstadoCivil;

	/**
	 * @param descricaoEstadoCivil Descricao do estado civil
	 */
	private EstadoCivil(String descricaoEstadoCivil) {
		this.descricaoEstadoCivil = descricaoEstadoCivil;
	}

	/**
	 * @return Retorna a descricao do estado civil
	 */
	public String getDescricaoEstadoCivil() {
		return descricaoEstadoCivil;
	}
	
}
