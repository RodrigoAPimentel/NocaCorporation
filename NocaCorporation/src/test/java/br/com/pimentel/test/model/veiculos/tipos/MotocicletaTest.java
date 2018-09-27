package br.com.pimentel.test.model.veiculos.tipos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.pimentel.model.enums.Combustivel;
import br.com.pimentel.model.enums.SituacaoOperacionalVeiculo;
import br.com.pimentel.model.veiculos.tipos.Motocicleta;

public class MotocicletaTest {

	private static Motocicleta moto;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	
		moto = new Motocicleta("67890", "09854", "9328475212", "ABC-1234", "Ford", "KA", 75, 1400, "Preto", Combustivel.ALCOOL, LocalDate.of(2000, Month.APRIL, 1), 
				LocalDate.of(2000, Month.APRIL, 1), LocalDate.of(2000, Month.APRIL, 1), null, 35.0, "ABS", LocalDate.of(2000, Month.APRIL, 1), null, 
				SituacaoOperacionalVeiculo.DISPONIVEL, "observacao veiculo", null);
	}

	@Test
	public void testHashCode() {
		assertNotEquals(1, moto.hashCode());
	}

	@Test
	public void testEqualsObject() {
		assertEquals(moto, moto);
		assertNotEquals(new Motocicleta(), moto);
	}
	
	@Test
	public void testGetToString() {
		assertEquals(moto.toString(), moto.toString());
		assertNotEquals(new Motocicleta().toString(), moto.toString());
	}
	
}
