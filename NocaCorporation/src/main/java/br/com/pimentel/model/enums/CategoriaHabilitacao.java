/**
 * 
 */
package br.com.pimentel.model.enums;

/**
 * @author Rodrigo Pimentel
 * @NocaCorporation @2018
 *
 * Categorias da Carteira Nacional de Habilitação (CNH)
 */
public enum CategoriaHabilitacao {
	
	A("Motocicleta, Ciclomotor, Motoneta ou Triciclo"),
	B("Automóvel, caminhonete, camioneta, utilitário"),
	C("Caminhão"),
	D("Microônibus, Ônibus"),
	E("Veículo com dois reboques acoplados"),
	ACC("Ciclomotores até 50 Cilindradas"),
	AB("Motocicleta, Ciclomotor, Motoneta ou Triciclo e Automóvel, caminhonete, camioneta, utilitário"),
	AC("Motocicleta, Ciclomotor, Motoneta ou Triciclo e Caminhão"),
	AD("Motocicleta, Ciclomotor, Motoneta ou Triciclo e Microônibus, Ônibus"),
	AE("Motocicleta, Ciclomotor, Motoneta ou Triciclo e Veículo com dois reboques acoplados");
	
	private String descricaoCategoria;

	private CategoriaHabilitacao(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

	/**
	 * Retorna a descrição da categoria da CNH
	 * @return Descrição da categoria da CNH
	 */
	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}	

}
