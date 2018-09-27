package br.com.pimentel.test.model.documentos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.pimentel.model.documentos.DocumentoPF;
import br.com.pimentel.model.enums.CategoriaHabilitacao;

public class DocumentoPFTest {

	private static DocumentoPF documentoPF;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		documentoPF = new DocumentoPF("21323", "SSP/PB", false, "1234567890", "Campina Grande-PB",
				"10", "20", "3475679823", "90488639", "2134-09", "0938472", CategoriaHabilitacao.AB, 
				"todos originais");	
	}

	@Test
	public void testGetSetIdentidade() {
		assertEquals("21323", documentoPF.getIdentidade());
		documentoPF.setIdentidade("54646");
		assertEquals("54646", documentoPF.getIdentidade());
	}

	@Test
	public void testGetSetIdentidadeOrgaoEmissor() {
		assertEquals("SSP/PB", documentoPF.getIdentidadeOrgaoEmissor());
		documentoPF.setIdentidadeOrgaoEmissor("SSP/PE");
		assertEquals("SSP/PE", documentoPF.getIdentidadeOrgaoEmissor());
	}

	@Test
	public void testGetSetIdentidade2Via() {
		assertEquals(false, documentoPF.getIdentidade2Via());
		documentoPF.setIdentidade2Via(true);
		assertEquals(true, documentoPF.getIdentidade2Via());
	}

	@Test
	public void testGetSetTituloEleitor() {
		assertEquals("1234567890", documentoPF.getTituloEleitor());
		documentoPF.setTituloEleitor("89765432");
		assertEquals("89765432", documentoPF.getTituloEleitor());
	}

	@Test
	public void testGetSetTituloEleitorLocalidade() {
		assertEquals("Campina Grande-PB", documentoPF.getTituloEleitorLocalidade());
		documentoPF.setTituloEleitorLocalidade("Gurjão-PB");
		assertEquals("Gurjão-PB", documentoPF.getTituloEleitorLocalidade());
	}

	@Test
	public void testGetSetTituloEleitorZona() {
		assertEquals("10", documentoPF.getTituloEleitorZona());
		documentoPF.setTituloEleitorZona("99");
		assertEquals("99", documentoPF.getTituloEleitorZona());
	}

	@Test
	public void testGetSetTituloEleitorSecao() {
		assertEquals("20", documentoPF.getTituloEleitorSecao());
		documentoPF.setTituloEleitorSecao("35");
		assertEquals("35", documentoPF.getTituloEleitorSecao());
	}

	@Test
	public void testGetSetCertificadoReservista() {
		assertEquals("3475679823", documentoPF.getCertificadoReservista());
		documentoPF.setCertificadoReservista("3787");
		assertEquals("3787", documentoPF.getCertificadoReservista());
	}

	@Test
	public void testGetSetPis() {
		assertEquals("90488639", documentoPF.getPis());
		documentoPF.setPis("123456789");
		assertEquals("123456789", documentoPF.getPis());
	}

	@Test
	public void testGetSetCarteiraTrabalho() {
		assertEquals("213409", documentoPF.getCarteiraTrabalho());
		documentoPF.setCarteiraTrabalho("3209485209");
		assertEquals("3209485209", documentoPF.getCarteiraTrabalho());
	}

	@Test
	public void testGetSetHabilitacao() {
		assertEquals("0938472", documentoPF.getHabilitacao());
		documentoPF.setHabilitacao("8322147");
		assertEquals("8322147", documentoPF.getHabilitacao());
	}

	@Test
	public void testGetSetHabilitacaoCategoria() {
		assertEquals(CategoriaHabilitacao.AB, documentoPF.getHabilitacaoCategoria());
		assertEquals("Motocicleta2, Ciclomotor, Motoneta ou Triciclo e Automóvel, caminhonete, camioneta, utilitário", documentoPF.getHabilitacaoCategoria().getDescricaoCategoria());
		documentoPF.setHabilitacaoCategoria(CategoriaHabilitacao.ACC);
		assertEquals(CategoriaHabilitacao.ACC, documentoPF.getHabilitacaoCategoria());
	}

	@Test
	public void testGetSetObservacao() {
		assertEquals("todos originais", documentoPF.getObservacaoDocumento());
		documentoPF.setObservacaoDocumento("todos falsos");
		assertEquals("todos falsos", documentoPF.getObservacaoDocumento());
	}
	
	@Test
	public void testHash() {
		assertNotEquals(34, documentoPF.hashCode());
	}

	@Test
	public void testEqualsObject() {
		assertEquals(documentoPF, documentoPF);
		assertNotEquals(new DocumentoPF(), documentoPF);
	}

	@Test
	public void testToString() {
		assertNotEquals(new DocumentoPF().toString(), documentoPF.toString());
	}

}
