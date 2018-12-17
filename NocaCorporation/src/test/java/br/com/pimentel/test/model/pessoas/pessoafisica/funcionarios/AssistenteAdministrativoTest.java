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
import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.AssistenteAdministrativo;

public class AssistenteAdministrativoTest {

	private static AssistenteAdministrativo assistenteAdministrativo;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	
		assistenteAdministrativo = new AssistenteAdministrativo("222.222.222-22", "Hipopotamo", "Campina Grande-PB", "Brasileiro", 
				LocalDate.of(1986, Month.AUGUST, 16), null, null, "Sebastião Porto", "Lourdinha", EstadoCivil.CASADO, 
				GrauInstrucao.DOUTORADOCOMPLETO, true, "Observação", 900.0, LocalDate.of(1986, Month.AUGUST, 16));
	}

	@Test
	public void testHashCode() {
		assertNotEquals(1, assistenteAdministrativo.hashCode());
	}

	@Test
	public void testEqualsObject() {
		assertEquals(assistenteAdministrativo, assistenteAdministrativo);
		assertNotEquals(new AssistenteAdministrativo(), assistenteAdministrativo);
	}

	@Test
	public void testToString() {
		assertEquals(assistenteAdministrativo.toString(), assistenteAdministrativo.toString());
		assertNotEquals(new AssistenteAdministrativo().toString(), assistenteAdministrativo.toString());
	}

	@Test
	public void testGetSetCargo() {
		assertEquals(Cargo.ASSISTENTEADMINISTRATIVO, assistenteAdministrativo.getCargo());
		assertEquals("Assistente Administrativo", assistenteAdministrativo.getCargo().getDescricaoCargo());
	}

	@Test
	public void testGetSetSalario() {
		assertEquals(900.0, assistenteAdministrativo.getSalario(),0.0);
		assistenteAdministrativo.setSalario(1000.0);
		assertEquals(1000.0, assistenteAdministrativo.getSalario(),0.0);
	}

	@Test
	public void testGetSetDataAdmissao() throws ParseException {
		assertEquals("16/08/1986", assistenteAdministrativo.getDataAdmissao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		assistenteAdministrativo.setDataAdmissao(LocalDate.of(2016, 4, 1));
		assertEquals("01/04/2016", assistenteAdministrativo.getDataAdmissao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}
	
}
