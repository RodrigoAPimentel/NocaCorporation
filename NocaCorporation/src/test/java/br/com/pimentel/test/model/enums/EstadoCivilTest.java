package br.com.pimentel.test.model.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import br.com.pimentel.model.enums.EstadoCivil;

public class EstadoCivilTest {
	
	private EstadoCivil estadoCivil;	

	@SuppressWarnings("static-access")
	@Test
	public void testDescricao() {
		assertEquals("Solteiro", estadoCivil.SOLTEIRO.getDescricaoEstadoCivil());
		assertEquals("Casado", estadoCivil.CASADO.getDescricaoEstadoCivil());
		assertEquals("Separado Judicialmente", estadoCivil.SEPARADO.getDescricaoEstadoCivil());
		assertEquals("Divorciado", estadoCivil.DIVORCIADO.getDescricaoEstadoCivil());
		assertEquals("Viúvo", estadoCivil.VIUVO.getDescricaoEstadoCivil());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testEquals() {
		assertEquals(estadoCivil.SEPARADO, estadoCivil.SEPARADO);
		assertNotEquals(estadoCivil.VIUVO, estadoCivil.DIVORCIADO);
	}

}
