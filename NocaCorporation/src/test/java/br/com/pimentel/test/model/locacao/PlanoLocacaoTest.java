package br.com.pimentel.test.model.locacao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.pimentel.model.locacao.PlanoLocacao;

public class PlanoLocacaoTest {
	
	private static PlanoLocacao planoLocacao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		planoLocacao = new PlanoLocacao("Plano de Locação A - Carro", null, 120.0, "obs plano locacao");		
	}
	
	@Test
	public void testHashCode() {
		assertNotEquals(1, planoLocacao.hashCode());
	}
	
	@Test
	public void testGetSetNomePlano() {
		assertEquals("Plano de Locação A - Carro", planoLocacao.getNomePlano());
		planoLocacao.setNomePlano("Palno B");
		assertEquals("Palno B", planoLocacao.getNomePlano());
	}

	@Test
	public void testGetSetPreco() {
		assertEquals(120.0, planoLocacao.getPreco(),0.0);
		planoLocacao.setPreco(130.0);
		assertEquals(130.0, planoLocacao.getPreco(),0.0);
	}

	@Test
	public void testGetSetObservacao() {
		assertEquals("obs plano locacao", planoLocacao.getObservacao());
		planoLocacao.setObservacao("obs plano locacao 2");
		assertEquals("obs plano locacao 2", planoLocacao.getObservacao());
	}

	@Test
	public void testEqualsObject() {
		assertEquals(planoLocacao, planoLocacao);
		assertNotEquals(new PlanoLocacao(), planoLocacao);
	}

	@Test
	public void testToString() {
		assertEquals(planoLocacao.toString(), planoLocacao.toString());
		assertNotEquals(new PlanoLocacao().toString(), planoLocacao.toString());
	}

}
