package br.com.pimentel.test.model.pessoas.pessoajuridica.empresas;

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

import br.com.pimentel.model.documentos.DocumentoPJ;
import br.com.pimentel.model.enderecos.EnderecoImpl;
import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.Gerente;
import br.com.pimentel.model.pessoas.pessoajuridica.empresas.LocadoraVeiculo;

public class LocadoraVeiculoTest {

	private static LocadoraVeiculo locadoraVeiculo;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {		
		locadoraVeiculo = new LocadoraVeiculo("11.111.111/1111-11", "Noca Corporation-ME", "Locadora Noca", null, null, 
				LocalDate.of(2000, Month.APRIL, 1), 30, null, null, true, "Observacao PJ", 150);
	}

	@Test
	public void testHashCode() {
		assertNotEquals(1, locadoraVeiculo.hashCode());
	}

	@Test
	public void testGetSetEndereco() {
		assertNull(locadoraVeiculo.getEndereco());
		locadoraVeiculo.setEndereco(new EnderecoImpl());
		assertNotNull(locadoraVeiculo.getEndereco());
	}

	@Test
	public void testGetSetDocumento() {
		assertNull(locadoraVeiculo.getDocumento());
		locadoraVeiculo.setDocumento(new DocumentoPJ());
		assertNotNull(locadoraVeiculo.getDocumento());
	}

	@Test
	public void testGetSetRazaoSocial() {
		assertEquals("Noca Corporation-ME", locadoraVeiculo.getRazaoSocial());
		locadoraVeiculo.setRazaoSocial("Bangui");
		assertEquals("Bangui", locadoraVeiculo.getRazaoSocial());
	}

	@Test
	public void testGetSetNomeFantasia() {
		assertEquals("Locadora Noca", locadoraVeiculo.getNomeFantasia());
		locadoraVeiculo.setNomeFantasia("Peteca");
		assertEquals("Peteca", locadoraVeiculo.getNomeFantasia());
	}

	@Test
	public void testGetSetDataFundacao() throws ParseException {
		assertEquals("01/04/2000", locadoraVeiculo.getDataFundacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		locadoraVeiculo.setDataFundacao(LocalDate.of(2016, 4, 1));
		assertEquals("01/04/2016", locadoraVeiculo.getDataFundacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

	@Test
	public void testGetSetNumeroDeFuncionarios() {
		assertEquals(30, locadoraVeiculo.getNumeroDeFuncionarios(),0.0);
		locadoraVeiculo.setNumeroDeFuncionarios(50);
		assertEquals(50, locadoraVeiculo.getNumeroDeFuncionarios(),0.0);
	}

	@Test
	public void testGetSetPropietario() {
		assertNull(locadoraVeiculo.getPropietario());
		locadoraVeiculo.setPropietario(new Gerente());
		assertNotNull(locadoraVeiculo.getPropietario());
	}

	@Test
	public void testGetSetPessoaDeContato() {
		assertNull(locadoraVeiculo.getPessoaDeContato());
		locadoraVeiculo.setPessoaDeContato(new Gerente());
		assertNotNull(locadoraVeiculo.getPessoaDeContato());
	}

	@Test
	public void testGetSetMatriz() {
		assertEquals(true, locadoraVeiculo.getMatriz());
		locadoraVeiculo.setMatriz(false);
		assertEquals(false, locadoraVeiculo.getMatriz());
	}

	@Test
	public void testGetSetObservacaoPessoa() {
		assertEquals("Observacao PJ", locadoraVeiculo.getObservacaoPessoa());
		locadoraVeiculo.setObservacaoPessoa("obs nova");
		assertEquals("obs nova", locadoraVeiculo.getObservacaoPessoa());
	}

	@Test
	public void testEqualsObject() {
		assertEquals(locadoraVeiculo, locadoraVeiculo);
		assertNotEquals(new LocadoraVeiculo(), locadoraVeiculo);
		assertNotEquals(new LocadoraVeiculo().getQuantidadeDeVeiculos(), locadoraVeiculo.getQuantidadeDeVeiculos());
	}

	@Test
	public void testGetSetQuantidadeDeVeiculos() {
		assertEquals(150, locadoraVeiculo.getQuantidadeDeVeiculos(),0.0);
		locadoraVeiculo.setQuantidadeDeVeiculos(46);
		assertEquals(46, locadoraVeiculo.getQuantidadeDeVeiculos(),0.0);
	}

}
