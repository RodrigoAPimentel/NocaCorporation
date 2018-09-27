package br.com.pimentel.test.model.enums;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.pimentel.model.enums.Cargo;

public class CargoTest {

	@Test
	public void testGetDescricaoCargo() {
		assertEquals("Gerente", Cargo.GERENTE.getDescricaoCargo());
		assertEquals("Assistente Administrativo", Cargo.ASSISTENTEADMINISTRATIVO.getDescricaoCargo());
		assertEquals("Agente de Locação", Cargo.AGENTELOCACAO.getDescricaoCargo());
		assertEquals("Mecânico", Cargo.MECANICO.getDescricaoCargo());
	}

}
