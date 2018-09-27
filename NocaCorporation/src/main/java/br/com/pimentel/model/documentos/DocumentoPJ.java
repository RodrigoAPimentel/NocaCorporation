/**
 * 
 */
package br.com.pimentel.model.documentos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Rodrigo Pimentel
 * @NocaCorporation @2018
 *
 * Classe que implementa Documento do tipo Documento de Pessoa Juridica
 */
@Embeddable
public class DocumentoPJ implements Serializable {
	
	private static final long serialVersionUID = -6541206279734296120L;	
	
	private static final String RETIRAPONTOS = "[^0-9]";
	
	@Column(length=15) private String inscricaoEstadual;
	@Column(length=15) private String inscricaoMunicipal;
	private String observacaoDocumento;
	
	public DocumentoPJ() {
		super();
	}

	/**
	 * Cria um objeto Documento Pessoa Juridica
	 * 
	 * @param inscricaoEstadual Numero da Inscrição Estadual
	 * @param inscricaoMunicipal Numero da Inscrição Municipal 
	 * @param observacao Observações
	 */
	public DocumentoPJ(String inscricaoEstadual, String inscricaoMunicipal, String observacaoDocumento) {
		this.inscricaoEstadual = inscricaoEstadual.replaceAll(RETIRAPONTOS, "");
		this.inscricaoMunicipal = inscricaoMunicipal.replaceAll(RETIRAPONTOS, "");
		this.observacaoDocumento = observacaoDocumento;
	}
	
	/**
	 * Retorna a Inscrição Estadual
	 * @return Numero da Inscrição Estadual
	 */
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	/**
	 * Altera a Inscrição Estadual
	 * @param inscricaoEstadual Numero da Inscrição Estadual
	 */
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual.replaceAll(RETIRAPONTOS, "");
	}

	/**
	 * Retorna a Inscrição Municipal
	 * @return Numero da Inscrição Municipal
	 */
	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	/**
	 * Altera a Inscrição Municipal
	 * @param inscricaoMunicipal Numero da Inscrição Municipal
	 */
	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal.replaceAll(RETIRAPONTOS, "");
	}
	/**
	 * Retorna as observações
	 * @return Observações
	 */
	public String getObservacaoDocumento() {
		return observacaoDocumento;
	}

	/**
	 * Altera as observações
	 * @param observacao Observações
	 */
	public void setObservacaoDocumento(String observacaoDocumento) {
		this.observacaoDocumento = observacaoDocumento; 
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((inscricaoEstadual == null) ? 0 : inscricaoEstadual.hashCode());
		result = prime * result + ((inscricaoMunicipal == null) ? 0 : inscricaoMunicipal.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof DocumentoPJ)) {
			return false;
		}
		DocumentoPJ other = (DocumentoPJ) obj;
		if (inscricaoEstadual == null) {
			if (other.inscricaoEstadual != null) {
				return false;
			}
		} else if (!inscricaoEstadual.equals(other.inscricaoEstadual)) {
			return false;
		}
		if (inscricaoMunicipal == null) {
			if (other.inscricaoMunicipal != null) {
				return false;
			}
		} else if (!inscricaoMunicipal.equals(other.inscricaoMunicipal)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DocumentoPJ [inscricaoEstadual=" + inscricaoEstadual + ", inscricaoMunicipal=" + inscricaoMunicipal
				+ ", observacaoDocumento=" + observacaoDocumento + "]";
	}
	
}
