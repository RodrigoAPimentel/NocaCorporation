package br.com.pimentel.model.enums;

/**
 * @author Rodrigo Pimentel
 * @NocaCorporation @2018
 *
 * Graus de Instrução
 */
public enum GrauInstrucao {
	
	ANALFABETO("Analfabeto"),
	FUNDAMENTALINCOMPLETO("Ensino Fundamental Incompleto"),
	FUNDAMENTALCOMPLETO("Ensino Fundamental Completo"),
	MEDIOINCOMPLETO("Ensino Medio Incompleto"),
	MEDIOCOMPLETO("Ensino Medio Completo"),
	SUPERIORINCOMPLETO("Ensino Superior Incompleto"),
	SUPERIORCOMPLETO("Ensino Superior Completo"),
	POSGRADUACAOINCOMPLETO("Pos-Graduação Incompleta"),
	POSGRADUACAOCOMPLETO("Pos-Graduação Completa"),
	MESTRADOINCOMPLETO("Mestrado Incompleto"),
	MESTRADOCOMPLETO("Mestrado Completo"),
	DOUTORADOINCOMPLETO("Doutorado Incompleto"),
	DOUTORADOCOMPLETO("Doutorado Completo"),
	PHDINCOMPLETO("Pos-Doutorado Incompleto"),
	PHDCOMPLETO("Pos-Doutorado Completo");
	
	private String descricaoDrauInstrucao;

	/**
	 * @param descricaoDrauInstrucao Grau de Instrução
	 */
	private GrauInstrucao(String descricaoDrauInstrucao) {
		this.descricaoDrauInstrucao = descricaoDrauInstrucao;
	}

	/**
	 * @return Retorna o Grau de Instrução
	 */
	public String getDescricaoDrauInstrucao() {
		return descricaoDrauInstrucao;
	}

}
