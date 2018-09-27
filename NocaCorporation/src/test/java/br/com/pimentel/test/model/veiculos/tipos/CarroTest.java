package br.com.pimentel.test.model.veiculos.tipos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.pimentel.model.enums.Combustivel;
import br.com.pimentel.model.enums.SituacaoOperacionalVeiculo;
import br.com.pimentel.model.pessoas.pessoajuridica.empresas.LocadoraVeiculo;
import br.com.pimentel.model.veiculos.tipos.Carro;

public class CarroTest {
	
	private static Carro carro;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {		
		carro = new Carro("12345", "02191", "9328475212", "ABC-1234", "Ford", "KA", 75, 1400, "Preto", Combustivel.ALCOOL, LocalDate.of(2000, Month.APRIL, 1), 
				LocalDate.of(2000, Month.APRIL, 1), LocalDate.of(2000, Month.APRIL, 1), null, 35.0, "ABS", LocalDate.of(2000, Month.APRIL, 1), null, 
				SituacaoOperacionalVeiculo.DISPONIVEL, "observacao veiculo", null, 4, 5);
	}

	@Test
	public void testHashCode() {
		assertNotEquals(1, carro.hashCode());
	}
	
	@Test
	public void testGetSetRenavam() {
		assertEquals("12345", carro.getRenavam());
		carro.setRenavam("908475");
		assertEquals("908475", carro.getRenavam());
	}

	@Test
	public void testGetSetChassis() {
		assertEquals("02191", carro.getChassis());
		carro.setChassis("908475");
		assertEquals("908475", carro.getChassis());
	}

	@Test
	public void testGetSetNumeroMotor() {
		assertEquals("9328475212", carro.getNumeroMotor());
		carro.setNumeroMotor("908475");
		assertEquals("908475", carro.getNumeroMotor());
	}

	@Test
	public void testGetSetPlaca() {
		assertEquals("ABC-1234", carro.getPlaca());
		carro.setPlaca("POP-0099");
		assertEquals("POP-0099", carro.getPlaca());
	}

	@Test
	public void testGetSetMarca() {
		assertEquals("Ford", carro.getMarca());
		carro.setMarca("Fiat");
		assertEquals("Fiat", carro.getMarca());
	}

	@Test
	public void testGetSetModelo() {
		assertEquals("KA", carro.getModelo());
		carro.setModelo("Palio");
		assertEquals("Palio", carro.getModelo());
	}

	@Test
	public void testGetSetPotencia() {
		assertEquals(75, carro.getPotencia(),0.0);
		carro.setPotencia(105);
		assertEquals(105, carro.getPotencia(),0.0);
	}

	@Test
	public void testGetSetCilindrada() {
		assertEquals(1400, carro.getCilindrada(),0.0);
		carro.setCilindrada(1800);
		assertEquals(1800, carro.getCilindrada(),0.0);
	}

	@Test
	public void testGetSetCor() {
		assertEquals("Preto", carro.getCor());
		carro.setCor("Azul");
		assertEquals("Azul", carro.getCor());
	}

	@Test
	public void testGetSetTipoCombustivel() {
		assertEquals(Combustivel.ALCOOL, carro.getTipoCombustivel());
		assertEquals("Alcool", carro.getTipoCombustivel().getDescricaoCombustivel());
		carro.setTipoCombustivel(Combustivel.FLEX);
		assertEquals(Combustivel.FLEX, carro.getTipoCombustivel());
	}

	@Test
	public void testGetSetAnoFabricacao() throws ParseException {
		assertEquals("01/04/2000", carro.getAnoFabricacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		carro.setAnoFabricacao(LocalDate.of(2016, 4, 1));
		assertEquals("01/04/2016", carro.getAnoFabricacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

	@Test
	public void testGetSetAnoModelo() throws ParseException {
		assertEquals("01/04/2000", carro.getAnoModelo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		carro.setAnoModelo(LocalDate.of(2016, 4, 1));
		assertEquals("01/04/2016", carro.getAnoModelo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

	@Test
	public void testGetSetDataAquisicao() throws ParseException {
		assertEquals("01/04/2000", carro.getDataAquisicao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		carro.setDataAquisicao(LocalDate.of(2016, 4, 1));
		assertEquals("01/04/2016", carro.getDataAquisicao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

	@Test
	public void testGetSetLocadoraBase() {
		assertNull(carro.getLocadoraBase());
		carro.setLocadoraBase(new LocadoraVeiculo());
		assertNotNull(carro.getLocadoraBase());
	}

	@Test
	public void testGetSetNivelTanque() {
		assertEquals(35.0, carro.getNivelTanque(),0.0);
		carro.setNivelTanque(23.0);
		assertEquals(23.0, carro.getNivelTanque(),0.0);
	}

	@Test
	public void testGetSetTipoFreios() {
		assertEquals("ABS", carro.getTipoFreios());
		carro.setTipoFreios("Disco");
		assertEquals("Disco", carro.getTipoFreios());
	}

	@Test
	public void testGetSetUltimaRevisao() throws ParseException {
		assertEquals("01/04/2000", carro.getUltimaRevisao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		carro.setUltimaRevisao(LocalDate.of(2016, 4, 1));
		assertEquals("01/04/2016", carro.getUltimaRevisao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

	@Test
	public void testGetSetAcessorios() {
		assertNull(carro.getAcessorios());
		carro.setAcessorios(new ArrayList<>());
		assertNotNull(carro.getAcessorios());
	}

	@Test
	public void testGetSetSituacaoOperacional() {
		assertEquals(SituacaoOperacionalVeiculo.DISPONIVEL, carro.getSituacaoOperacional());
		assertEquals("Disponivel", carro.getSituacaoOperacional().getDescricaoSituacaoOperacionalVeiculo());
		carro.setSituacaoOperacional(SituacaoOperacionalVeiculo.EMUSO);
		assertEquals(SituacaoOperacionalVeiculo.EMUSO, carro.getSituacaoOperacional());
	}

	@Test
	public void testGetSetObservacoesVeiculo() {
		assertEquals("observacao veiculo", carro.getObservacoesVeiculo());
		carro.setObservacoesVeiculo("outra obs");
		assertEquals("outra obs", carro.getObservacoesVeiculo());
	}

	@Test
	public void testEqualsObject() {
		assertEquals(carro, carro);
		assertNotEquals(new Carro(), carro);
	}

	@Test
	public void testGetSetQuantidadePortas() {
		assertEquals(4, carro.getQuantidadePortas(),0.0);
		carro.setQuantidadePortas(5);
		assertEquals(5, carro.getQuantidadePortas(),0.0);
	}

	@Test
	public void testGetSetCapacidadeOcupantes() {
		assertEquals(5, carro.getCapacidadeOcupantes(),0.0);
		carro.setCapacidadeOcupantes(7);
		assertEquals(7, carro.getCapacidadeOcupantes(),0.0);
	}
	
}
