package br.com.pimentel.test.model.documentos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.pimentel.model.documentos.DocumentoPJ;

public class DocumentoPJTest {
	
	private static DocumentoPJ documentoPJ;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		documentoPJ = new DocumentoPJ("874829092", "42363273", "Teste de PJ");
	}
	
	@Test
	public void testGetSetInscricaoEstadual() {
		assertEquals("874829092", documentoPJ.getInscricaoEstadual());
		documentoPJ.setInscricaoEstadual("23456564564");
		assertEquals("23456564564", documentoPJ.getInscricaoEstadual());
	}

	@Test
	public void testGetSetInscricaoMunicipal() {
		assertEquals("42363273", documentoPJ.getInscricaoMunicipal());
		documentoPJ.setInscricaoMunicipal("2174876571");
		assertEquals("2174876571", documentoPJ.getInscricaoMunicipal());
	}

	@Test
	public void testGetSetObservacao() {
		assertEquals("Teste de PJ", documentoPJ.getObservacaoDocumento());
		documentoPJ.setObservacaoDocumento("Qualquer coisa");
		assertEquals("Qualquer coisa", documentoPJ.getObservacaoDocumento());
	}

	@Test
	public void testHash() {
		assertNotEquals(34, documentoPJ.hashCode());
	}
	
	@Test
	public void testEqualsObject() {
		assertEquals(documentoPJ, documentoPJ);
		assertNotEquals(new DocumentoPJ(), documentoPJ);
	}

	@Test
	public void testToString() {
		assertNotEquals(new DocumentoPJ().toString(), documentoPJ.toString());
	}

}
