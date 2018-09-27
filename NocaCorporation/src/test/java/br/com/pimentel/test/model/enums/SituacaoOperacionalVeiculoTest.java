/**
 * 
 */
package br.com.pimentel.test.model.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import br.com.pimentel.model.enums.SituacaoOperacionalVeiculo;

/**
 * @author Rodrigo Pimentel
 * @LocadoraNocaCorporation @2018
 * Classe de teste unitario sobre o Enum Status
 */
public class SituacaoOperacionalVeiculoTest {

	private SituacaoOperacionalVeiculo situacaoOperacionalVeiculo;

	@SuppressWarnings("static-access")
	@Test
	public void testeDescricao() {
		assertEquals("Locado", situacaoOperacionalVeiculo.LOCADO.getDescricaoSituacaoOperacionalVeiculo());
		assertEquals("Em Revisão", situacaoOperacionalVeiculo.REVISAO.getDescricaoSituacaoOperacionalVeiculo());
		assertEquals("Disponivel", situacaoOperacionalVeiculo.DISPONIVEL.getDescricaoSituacaoOperacionalVeiculo());
		assertEquals("Fora de serviço", situacaoOperacionalVeiculo.FORADESERVICO.getDescricaoSituacaoOperacionalVeiculo());
		assertEquals("Em uso pela empresa", situacaoOperacionalVeiculo.EMUSO.getDescricaoSituacaoOperacionalVeiculo());	
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testeEquals() {
		assertEquals(situacaoOperacionalVeiculo.LOCADO, situacaoOperacionalVeiculo.LOCADO);
		assertNotEquals(situacaoOperacionalVeiculo.EMUSO, situacaoOperacionalVeiculo.FORADESERVICO);
	}

}
