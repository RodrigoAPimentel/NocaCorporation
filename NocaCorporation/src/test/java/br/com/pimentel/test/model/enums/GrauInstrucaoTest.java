package br.com.pimentel.test.model.enums;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.pimentel.model.enums.GrauInstrucao;

@SuppressWarnings("unused")
public class GrauInstrucaoTest {

	private GrauInstrucao grauInstrucao;
	
	@SuppressWarnings("static-access")
	@Test
	public void testGetDescricaoDrauInstrucao() {
		assertEquals("Analfabeto", grauInstrucao.ANALFABETO.getDescricaoDrauInstrucao());
		assertEquals("Ensino Fundamental Incompleto", grauInstrucao.FUNDAMENTALINCOMPLETO.getDescricaoDrauInstrucao());
		assertEquals("Ensino Fundamental Completo", grauInstrucao.FUNDAMENTALCOMPLETO.getDescricaoDrauInstrucao());
		assertEquals("Ensino Medio Incompleto", grauInstrucao.MEDIOINCOMPLETO.getDescricaoDrauInstrucao());
		assertEquals("Ensino Medio Completo", grauInstrucao.MEDIOCOMPLETO.getDescricaoDrauInstrucao());
		assertEquals("Ensino Superior Incompleto", grauInstrucao.SUPERIORINCOMPLETO.getDescricaoDrauInstrucao());
		assertEquals("Ensino Superior Completo", grauInstrucao.SUPERIORCOMPLETO.getDescricaoDrauInstrucao());
		assertEquals("Pos-Graduação Incompleta", grauInstrucao.POSGRADUACAOINCOMPLETO.getDescricaoDrauInstrucao());
		assertEquals("Pos-Graduação Completa", grauInstrucao.POSGRADUACAOCOMPLETO.getDescricaoDrauInstrucao());
		assertEquals("Mestrado Incompleto", grauInstrucao.MESTRADOINCOMPLETO.getDescricaoDrauInstrucao());
		assertEquals("Mestrado Completo", grauInstrucao.MESTRADOCOMPLETO.getDescricaoDrauInstrucao());
		assertEquals("Doutorado Incompleto", grauInstrucao.DOUTORADOINCOMPLETO.getDescricaoDrauInstrucao());
		assertEquals("Doutorado Completo", grauInstrucao.DOUTORADOCOMPLETO.getDescricaoDrauInstrucao());
		assertEquals("Pos-Doutorado Incompleto", grauInstrucao.PHDINCOMPLETO.getDescricaoDrauInstrucao());
		assertEquals("Pos-Doutorado Completo", grauInstrucao.PHDCOMPLETO.getDescricaoDrauInstrucao());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testEquals() {
		assertEquals(grauInstrucao.ANALFABETO, grauInstrucao.ANALFABETO);
		assertNotEquals(grauInstrucao.PHDCOMPLETO, grauInstrucao.PHDINCOMPLETO);
	}

}
