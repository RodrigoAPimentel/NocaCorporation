package br.com.pimentel.test.model.pessoas.pessoafisica.funcionarios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.pimentel.model.enums.Cargo;
import br.com.pimentel.model.enums.EstadoCivil;
import br.com.pimentel.model.enums.GrauInstrucao;
import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.Mecanico;

public class MecanicoTest {

	private static Mecanico mecanico;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {		
		mecanico = new Mecanico("111.111.111-11", "Zebra", "Campina Grande-PB", "Brasileiro", LocalDate.of(1986, Month.AUGUST, 16), 
				null, null, "Sebastião Porto", "Lourdinha", EstadoCivil.CASADO, GrauInstrucao.DOUTORADOCOMPLETO, true, 
				"Observação", 900.0, LocalDate.of(1986, Month.AUGUST, 16));
	}

	@Test
	public void testHashCode() {
		assertNotEquals(1, mecanico.hashCode());
	}

	@Test
	public void testEqualsObject() {
		assertEquals(mecanico, mecanico);
		assertNotEquals(new Mecanico(), mecanico);
	}

	@Test
	public void testToString() {
		assertEquals(mecanico.toString(), mecanico.toString());
		assertNotEquals(new Mecanico().toString(), mecanico.toString());
	}

	@Test
	public void testGetCargo() {
		assertEquals(Cargo.MECANICO, mecanico.getCargo());
		assertEquals("Mecânico", mecanico.getCargo().getDescricaoCargo());
	}

	@Test
	public void testGetSetSalario() {
		assertEquals(900.0, mecanico.getSalario(),0.0);
		mecanico.setSalario(1000.0);
		assertEquals(1000.0, mecanico.getSalario(),0.0);
	}

	@Test
	public void testGetSetDataAdmissao() throws ParseException {
		assertEquals("16/08/1986", mecanico.getDataAdmissao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		mecanico.setDataAdmissao(LocalDate.of(2016, 4, 1));
		assertEquals("01/04/2016", mecanico.getDataAdmissao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

}
