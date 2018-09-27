/**
 * 
 */
package br.com.pimentel.test.model.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import br.com.pimentel.model.enums.Combustivel;

/**
 * @author Rodrigo Pimentel
 * @LocadoraNocaCorporation @2018
 * Classe de teste unitario sobre o Enum Combustivel
 */
public class CombustivelTest {

	private Combustivel combustivel;

	@SuppressWarnings("static-access")
	@Test
	public void testeDescricao() {
		assertEquals("Gasolina", combustivel.GASOLINA.getDescricaoCombustivel());
		assertEquals("Alcool", combustivel.ALCOOL.getDescricaoCombustivel());
		assertEquals("Oleo Diesel", combustivel.DIESEL.getDescricaoCombustivel());
		assertEquals("Gasolina e Alcool", combustivel.FLEX.getDescricaoCombustivel());
		assertEquals("Gasolina, Gasolina Pura, Alcool, GNV", combustivel.TETRAFUEL.getDescricaoCombustivel());
		assertEquals("Gas Natural", combustivel.GNV.getDescricaoCombustivel());		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testeEquals() {
		assertEquals(combustivel.GASOLINA, combustivel.GASOLINA);
		assertNotEquals(combustivel.TETRAFUEL, combustivel.GNV);
	}

}
