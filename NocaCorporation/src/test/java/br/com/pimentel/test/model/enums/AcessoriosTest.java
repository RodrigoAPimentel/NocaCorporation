/**
 * 
 */
package br.com.pimentel.test.model.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import br.com.pimentel.model.enums.Acessorios;

/**
 * @author Rodrigo Pimentel
 * @LocadoraNocaCorporation @2018
 * Classe de teste unitario sobre o Enum Acessorios
 */
public class AcessoriosTest {

	private Acessorios acessorios;

	@SuppressWarnings("static-access")
	@Test
	public void testeDescricao() {
		assertEquals("Ar Condicionado", acessorios.ARCONDICIONADO.getDescricaoAcessorio());
		assertEquals("Direção Hidraulica", acessorios.DIRECAOHIDRAULICA.getDescricaoAcessorio());
		assertEquals("Direção Eletrica", acessorios.DIRECAOELETRICA.getDescricaoAcessorio());
		assertEquals("Vidro Eletrico", acessorios.VIDROELETRICO.getDescricaoAcessorio());
		assertEquals("Central Multimidia", acessorios.CENTRALMULTIMIDIA.getDescricaoAcessorio());
		assertEquals("Air Bag", acessorios.AIRBAG.getDescricaoAcessorio());
		assertEquals("Freios Abs", acessorios.FREIOABS.getDescricaoAcessorio());
		assertEquals("Radio", acessorios.RADIO.getDescricaoAcessorio());
		assertEquals("Camera de ré", acessorios.CAMERARE.getDescricaoAcessorio());
		assertEquals("Sensor de estacionamento", acessorios.SENSORESTACIONAMENTO.getDescricaoAcessorio());		
	}

	@SuppressWarnings("static-access")
	@Test
	public void testeEquals() {
		assertEquals(acessorios.ARCONDICIONADO, acessorios.ARCONDICIONADO);
		assertNotEquals(acessorios.SENSORESTACIONAMENTO, acessorios.ARCONDICIONADO);
	}
}
