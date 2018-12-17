package br.com.pimentel.test.model.pessoas.pessoafisica.funcionarios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.pimentel.model.documentos.DocumentoPF;
import br.com.pimentel.model.enderecos.EnderecoImpl;
import br.com.pimentel.model.enums.Cargo;
import br.com.pimentel.model.enums.EstadoCivil;
import br.com.pimentel.model.enums.GrauInstrucao;
import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.Gerente;

public class GerenteTest {

	private static Gerente gerente;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {		
		gerente = new Gerente("000.000.000-00", "Javali", "Campina Grande-PB", "Brasileiro", LocalDate.of(1986, Month.AUGUST, 16), 
				null, null, "Sebastião Porto", "Lourdinha", EstadoCivil.CASADO, GrauInstrucao.DOUTORADOCOMPLETO, 
				true, "observacoes", 9000.0, LocalDate.of(2012, Month.MAY, 25), 5.0);
	}

	@Test
	public void testHashCode() {
		assertNotEquals(1, gerente.hashCode()); 
	}
	
	@Test
	public void testGetSetNome() {
		assertEquals("Javali", gerente.getNome());
		gerente.setNome("Joaquim");
		assertEquals("Joaquim", gerente.getNome()); 
	}

	@Test
	public void testGetSetNaturalidade() {
		assertEquals("Campina Grande-PB", gerente.getNaturalidade());
		gerente.setNaturalidade("Esperança-PB");
		assertEquals("Esperança-PB", gerente.getNaturalidade());
	}

	@Test
	public void testGetSetNacionalidade() {
		assertEquals("Brasileiro", gerente.getNacionalidade());
		gerente.setNacionalidade("argentino");
		assertEquals("argentino", gerente.getNacionalidade());
	}

	@Test
	public void testGetSetDataNascimento() throws ParseException {
		assertEquals("16/08/1986", gerente.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		gerente.setDataNascimento(LocalDate.of(2016, 4, 1));
		assertEquals("01/04/2016", gerente.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

	@Test
	public void testGetSetFiliacao() {
		assertEquals("Sebastião Porto", gerente.getFiliacaoPai());
		assertEquals("Lourdinha", gerente.getFiliacaoMae());
		gerente.setFiliacaoPai("Zezinho");
		gerente.setFiliacaoMae("Maria");
		assertEquals("Zezinho", gerente.getFiliacaoPai());
		assertEquals("Maria", gerente.getFiliacaoMae());
	}

	@Test
	public void testGetSetEstadoCivil() {
		assertEquals(EstadoCivil.CASADO, gerente.getEstadoCivil());
		assertEquals("Casado", gerente.getEstadoCivil().getDescricaoEstadoCivil());
		gerente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		assertEquals(EstadoCivil.SOLTEIRO, gerente.getEstadoCivil());
	}

	@Test
	public void testGetSetGrauDeInstrucao() {
		assertEquals(GrauInstrucao.DOUTORADOCOMPLETO, gerente.getGrauDeInstrucao());
		assertEquals("Doutorado Completo", gerente.getGrauDeInstrucao().getDescricaoDrauInstrucao());
		gerente.setGrauDeInstrucao(GrauInstrucao.ANALFABETO);
		assertEquals(GrauInstrucao.ANALFABETO, gerente.getGrauDeInstrucao());
	}

	@Test
	public void testGetSetSexo() {
		assertEquals(true, gerente.getSexo());
		gerente.setSexo(false);
		assertEquals(false, gerente.getSexo());
	}

	@Test
	public void testGetSetEndereco() {
		assertNull(gerente.getEndereco());
		gerente.setEndereco(new EnderecoImpl());
		assertNotNull(gerente.getEndereco());
	}

	@Test
	public void testGetSetDocumento() {
		assertNull(gerente.getDocumento());
		gerente.setDocumento(new DocumentoPF());
		assertNotNull(gerente.getDocumento());
	}

	@Test
	public void testGetSetObservacaoPessoa() {
		assertEquals("observacoes", gerente.getObservacaoPessoa());
		gerente.setObservacaoPessoa("Novas observacoes");
		assertEquals("Novas observacoes", gerente.getObservacaoPessoa());
	}

	@Test
	public void testEqualsObject() {
		assertEquals(gerente, gerente);
		assertNotEquals(new Gerente(), gerente);
	}

	@Test
	public void testToString() {
		assertEquals(gerente.toString(), gerente.toString());
		assertNotEquals(new Gerente().toString(), gerente.toString());
	}

	@Test
	public void testGetSetCargo() {
		assertEquals(Cargo.GERENTE, gerente.getCargo());
		assertEquals("Gerente", gerente.getCargo().getDescricaoCargo());
	}

	@Test
	public void testGetSetSalario() {
		assertEquals(9000.0, gerente.getSalario(),0.0);
		gerente.setSalario(1000.0);
		assertEquals(1000.0, gerente.getSalario(),0.0);
	}

	@Test
	public void testGetSetDataAdmissao() throws ParseException {
		assertEquals("25/05/2012", gerente.getDataAdmissao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		gerente.setDataAdmissao(LocalDate.of(2016, 4, 1));
		assertEquals("01/04/2016", gerente.getDataAdmissao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

	@Test
	public void testGetSetPorcentagemDeComissao() {
		assertEquals(5.0, gerente.getPorcentagemDeComissao(),0.0);
		gerente.setPorcentagemDeComissao(10.0);
		assertEquals(10.0, gerente.getPorcentagemDeComissao(),0.0);
	}

}
