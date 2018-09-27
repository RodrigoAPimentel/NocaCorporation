/**
 * 
 */
package br.com.pimentel.model.enums;

/**
 * @author Rodrigo Pimentel
 * @NocaCorporation 
 * @2018
 *
 * Acessorios que podem estar incluso em um veiculo
 */
public enum Acessorios {

	ARCONDICIONADO("Ar Condicionado"),
	DIRECAOHIDRAULICA("Direção Hidraulica"),
	DIRECAOELETRICA("Direção Eletrica"),
	VIDROELETRICO("Vidro Eletrico"),
	CENTRALMULTIMIDIA("Central Multimidia"),
	AIRBAG("Air Bag"),
	FREIOABS("Freios Abs"),
	RADIO("Radio"),
	CAMERARE("Camera de ré"),
	SENSORESTACIONAMENTO("Sensor de estacionamento");
	
	private String descricaoAcessorio;
	
	/**
	 * @param descricaoAcessorio Acessorio utilizado
	 */
	private Acessorios(String descricaoAcessorio) {
		this.descricaoAcessorio = descricaoAcessorio;
	}
	/**
	 * @return Retorna a descrição do Acessorio
	 */
	public String getDescricaoAcessorio() {
		return descricaoAcessorio;
	}
		
}
