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
import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.AgenteLocacao;

public class AgenteLocacaoTest {

	private static AgenteLocacao locador;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		locador = new AgenteLocacao("333.333.333-33", "Leão", "Campina Grande-PB", "Brasileiro", LocalDate.of(1986, Month.AUGUST, 16), 
				null, null, "Sebastião Porto", "Lourdinha", EstadoCivil.CASADO, GrauInstrucao.DOUTORADOCOMPLETO, true, 
				"Observação", 900.0, LocalDate.of(1986, Month.AUGUST, 16), 5.0);
	}

	@Test
	public void testHashCode() {
		assertNotEquals(1, locador.hashCode());
	}
	
	@Test
	public void testGetCpf() {
		assertEquals("33333333333", locador.getCpf());
	}

	@Test
	public void testEqualsObject() {
		assertEquals(locador, locador);
		assertNotEquals(new AgenteLocacao(), locador);
	}

	@Test
	public void testToString() {
		assertEquals(locador.toString(), locador.toString());
		assertNotEquals(new AgenteLocacao().toString(), locador.toString());
	}

	@Test
	public void testGetSetCargo() {
		assertEquals(Cargo.AGENTELOCACAO, locador.getCargo());
		assertEquals("Agente de Locação", locador.getCargo().getDescricaoCargo());
		assertEquals(Cargo.AGENTELOCACAO, locador.getCargo());
	}

	@Test
	public void testGetSetSalario() {
		assertEquals(900.0, locador.getSalario(),0.0);
		locador.setSalario(1000.0);
		assertEquals(1000.0, locador.getSalario(),0.0);
	}

	@Test
	public void testGetSetDataAdmissao() throws ParseException {
		assertEquals("16/08/1986", locador.getDataAdmissao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		locador.setDataAdmissao(LocalDate.of(2016, 4, 1));
		assertEquals("01/04/2016", locador.getDataAdmissao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

	@Test
	public void testGetSetPorcentagemDeComissao() {
		assertEquals(5.0, locador.getPorcentagemDeComissao(),0.0);
		locador.setPorcentagemDeComissao(10.0);
		assertEquals(10.0, locador.getPorcentagemDeComissao(),0.0);
	}

}
