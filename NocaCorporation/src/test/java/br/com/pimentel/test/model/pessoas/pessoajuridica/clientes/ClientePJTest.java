package br.com.pimentel.test.model.pessoas.pessoajuridica.clientes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.pimentel.model.pessoas.pessoafisica.clientes.ClientePF;
import br.com.pimentel.model.pessoas.pessoajuridica.ClientePJ;

public class ClientePJTest {
	
	private static ClientePJ clientePJ;	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		clientePJ = new ClientePJ("11.111.111/1111-11", "Noca Corporation-ME", "Locadora Noca", null, null, 
				LocalDate.of(2000, Month.APRIL, 1), 30, null, null, true, "Observacao PJ", 10, 0.0, LocalDate.of(2018, Month.AUGUST, 2));
	}
	
	@Test
	public void testHashCode() {
		assertNotEquals(1, clientePJ.hashCode());
	}

	@Test
	public void testToString() {
		assertEquals(clientePJ.toString(), clientePJ.toString());
		assertNotEquals(new ClientePF().toString(), clientePJ.toString());
	}

	@Test
	public void testGetSetQuantidadePermitidaLocacao() {
		assertEquals(10, clientePJ.getQuantidadePermitidaLocacao(),0.0);
		clientePJ.setQuantidadePermitidaLocacao(5);
		assertEquals(5, clientePJ.getQuantidadePermitidaLocacao(),0.0);
	}

	@Test
	public void testGetSetDebito() {
		assertEquals(0.0, clientePJ.getDebito(),0.0);
		clientePJ.setDebito(1500.0);
		assertEquals(1500.0, clientePJ.getDebito(),0.0);
	}

	@Test
	public void testGetSetDataCadastro() {
		assertEquals("02/08/2018", clientePJ.getDataCadastro().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		clientePJ.setDataCadastro(LocalDate.of(2016, 4, 1));
		assertEquals("01/04/2016", clientePJ.getDataCadastro().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

	@Test
	public void testEqualsObject() {
		assertEquals(clientePJ, clientePJ);
		assertNotEquals(new ClientePF(), clientePJ);
	}

}
