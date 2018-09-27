package br.com.pimentel.test.model.pessoas.pessoafisica.clientes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.pimentel.model.enums.EstadoCivil;
import br.com.pimentel.model.enums.GrauInstrucao;
import br.com.pimentel.model.pessoas.pessoafisica.clientes.ClientePF;

public class ClientePFTest {
	
	private static ClientePF clientePF;	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		clientePF = new ClientePF("000.000.000-00", "Javali", "Campina Grande-PB", "Brasileiro", LocalDate.of(1986, Month.AUGUST, 16), 
				null, null, "Sebastião Porto", "Lourdinha", EstadoCivil.CASADO, GrauInstrucao.DOUTORADOCOMPLETO, 
				true, "observacoes", 3, 0.0, LocalDate.of(2018, Month.AUGUST, 2));
	}
	
	@Test
	public void testHashCode() {
		assertNotEquals(1, clientePF.hashCode());
	}

	@Test
	public void testToString() {
		assertEquals(clientePF.toString(), clientePF.toString());
		assertNotEquals(new ClientePF().toString(), clientePF.toString());
	}

	@Test
	public void testGetSetQuantidadePermitidaLocacao() {
		assertEquals(3, clientePF.getQuantidadePermitidaLocacao(),0.0);
		clientePF.setQuantidadePermitidaLocacao(5);
		assertEquals(5, clientePF.getQuantidadePermitidaLocacao(),0.0);
	}

	@Test
	public void testGetSetDebito() {
		assertEquals(0.0, clientePF.getDebito(),0.0);
		clientePF.setDebito(1500.0);
		assertEquals(1500.0, clientePF.getDebito(),0.0);
	}

	@Test
	public void testGetSetDataCadastro() {
		assertEquals("02/08/2018", clientePF.getDataCadastro().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		clientePF.setDataCadastro(LocalDate.of(2016, 4, 1));
		assertEquals("01/04/2016", clientePF.getDataCadastro().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

	@Test
	public void testEqualsObject() {
		assertEquals(clientePF, clientePF);
		assertNotEquals(new ClientePF(), clientePF);
	}

}
