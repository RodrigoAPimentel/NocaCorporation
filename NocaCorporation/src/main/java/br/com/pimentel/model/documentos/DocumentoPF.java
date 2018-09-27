/**
 * 
 */
package br.com.pimentel.model.documentos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.pimentel.model.enums.CategoriaHabilitacao;

/**
 * @author Rodrigo Pimentel
 * @NocaCorporation @2018
 *
 * Classe que implementa Documento do tipo Documento de Pessoa Fisica
 */
@Embeddable
public class DocumentoPF implements Serializable {

	private static final long serialVersionUID = 1982347450649668804L;
	
	private static final String RETIRAPONTOS = "[^0-9]";
	
	@Column(length=15) private String identidade;
	@Column(length=15) private String identidadeOrgaoEmissor;
	private Boolean identidade2Via;
	@Column(length=20) private String tituloEleitor;
	@Column(length=20) private String tituloEleitorLocalidade;
	@Column(length=5) private String tituloEleitorZona;
	@Column(length=5) private String tituloEleitorSecao;
	@Column(length=15) private String certificadoReservista;
	@Column(length=15) private String pis;
	@Column(length=15) private String carteiraTrabalho;
	@Column(length=15) private String habilitacao;
	@Enumerated(EnumType.STRING) private CategoriaHabilitacao habilitacaoCategoria;
	private String observacaoDocumento;	
	
	public DocumentoPF() {
		super();
	}

	/**
	 * Cria um objeto Documento Pessoa Fisica
	 * 
	 * @param cpf Numero do Cadastro de Pessoa Fisica (CPF)
	 * @param identidade Numero do Documento de Identidade
	 * @param identidadeOrgaoEmissor Orgão Emissor do Documento de Identidade
	 * @param identidade2Via TRUE - Segunda Via | FALSE - Primeira Via
	 * @param tituloEleitor Numero do Titulo de Eleitor
	 * @param tituloEleitorLocalidade Domicilio Eleitoral
	 * @param tituloEleitorZona Zona Eleitoral
	 * @param tituloEleitorSecao Seção Eleitoral
	 * @param certificadoReservista Numero do Certificado de Reservista ou do Certificado de Dispensa
	 * @param pis Numero do Programa de Integração Social (PIS)
	 * @param carteiraTrabalho Numero da Carteira de Trabalho
	 * @param habilitacao Numero da Carteira Nacional de Habilitação (CNH)
	 * @param habilitacaoCategoria Categoria da Carteira Nacional de Habilitação (CNH)
	 * @param observacao Observações
	 */
	public DocumentoPF(String identidade, String identidadeOrgaoEmissor, Boolean identidade2Via,
			String tituloEleitor, String tituloEleitorLocalidade, String tituloEleitorZona, String tituloEleitorSecao,
			String certificadoReservista, String pis, String carteiraTrabalho, String habilitacao,
			CategoriaHabilitacao habilitacaoCategoria, String observacaoDocumento) {
		this.identidade = identidade.replaceAll(RETIRAPONTOS, "");
		this.identidadeOrgaoEmissor = identidadeOrgaoEmissor;
		this.identidade2Via = identidade2Via;
		this.tituloEleitor = tituloEleitor.replaceAll(RETIRAPONTOS, "");
		this.tituloEleitorLocalidade = tituloEleitorLocalidade;
		this.tituloEleitorZona = tituloEleitorZona.replaceAll(RETIRAPONTOS, "");
		this.tituloEleitorSecao = tituloEleitorSecao.replaceAll(RETIRAPONTOS, "");
		this.certificadoReservista = certificadoReservista.replaceAll(RETIRAPONTOS, "");
		this.pis = pis.replaceAll(RETIRAPONTOS, "");
		this.carteiraTrabalho = carteiraTrabalho.replaceAll(RETIRAPONTOS, "");
		this.habilitacao = habilitacao.replaceAll(RETIRAPONTOS, "");
		this.habilitacaoCategoria = habilitacaoCategoria;
		this.observacaoDocumento = observacaoDocumento;
	}

	/**
	 * Retorna o numero do Documento de Identidade
	 * @return Numero do Documento de Identidade
	 */
	public String getIdentidade() {
		return identidade;
	}

	/**
	 * Altera o numero do Documento de Identidade
	 * @param identidade Numero do Documento de Identidade
	 */
	public void setIdentidade(String identidade) {
		this.identidade = identidade.replaceAll(RETIRAPONTOS, "");
	}

	/**
	 * Retorna o orgão emissor do Documento de Identidade
	 * @return Orgão emissor do Documento de Identidade
	 */
	public String getIdentidadeOrgaoEmissor() {
		return identidadeOrgaoEmissor;
	}

	/**
	 * Altera o orgão emissor do Documento de Identidade
	 * @param identidadeOrgaoEmissor Orgão emissor do Documento de Identidade
	 */
	public void setIdentidadeOrgaoEmissor(String identidadeOrgaoEmissor) {
		this.identidadeOrgaoEmissor = identidadeOrgaoEmissor;
	}

	/**
	 * Retorna se o Documento de Identidade é primeira ou segunda via
	 * @return TRUE - Segunda Via | FALSE - Primeira Via
	 */
	public Boolean getIdentidade2Via() {
		return identidade2Via;
	}

	/**
	 * Altera se o Documento de Identidade é primeira ou segunda via
	 * @param identidade2Via TRUE - Segunda Via | FALSE - Primeira Via
	 */
	public void setIdentidade2Via(Boolean identidade2Via) {
		this.identidade2Via = identidade2Via;
	}

	/**
	 * Retorna o Numero do Titulo de Eleitor
	 * @return Numero do Titulo de Eleitor
	 */
	public String getTituloEleitor() {
		return tituloEleitor;
	}

	/**
	 * Altera o Numero do Titulo de Eleitor
	 * @param tituloEleitor Numero do Titulo de Eleitor
	 */
	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor.replaceAll(RETIRAPONTOS, "");
	}

	/**
	 * Retorna o Domicilio Eleitoral (Cidade e Estado)
	 * @return Cidade e Estado
	 */
	public String getTituloEleitorLocalidade() {
		return tituloEleitorLocalidade;
	}

	/**
	 * Altera o Domicilio Eleitoral (Cidade e Estado)
	 * @param tituloEleitorLocalidade Cidade e Estado
	 */
	public void setTituloEleitorLocalidade(String tituloEleitorLocalidade) {
		this.tituloEleitorLocalidade = tituloEleitorLocalidade;
	}

	/**
	 * Retorna a Zona Eleitoral de votação
	 * @return Zona Eleitoral
	 */
	public String getTituloEleitorZona() {
		return tituloEleitorZona;
	}

	/**
	 * Altera a Zona Eleitoral de votação
	 * @param tituloEleitorZona Zona Eleitoral
	 */
	public void setTituloEleitorZona(String tituloEleitorZona) {
		this.tituloEleitorZona = tituloEleitorZona.replaceAll(RETIRAPONTOS, "");
	}

	/**
	 * Retorna a Seção Eleitoral de votação
	 * @return Seção Eleitoral
	 */
	public String getTituloEleitorSecao() {
		return tituloEleitorSecao;
	}

	/**
	 * Altera a Seção Eleitoral de votação
	 * @param tituloEleitorSecao Seção Eleitoral
	 */
	public void setTituloEleitorSecao(String tituloEleitorSecao) {
		this.tituloEleitorSecao = tituloEleitorSecao.replaceAll(RETIRAPONTOS, "");
	}

	/**
	 * Retorna o numero do Certificado de Reservista ou Certificado de Dispensa
	 * @return Certificado de Reservista ou Certificado de Dispensa
	 */
	public String getCertificadoReservista() {
		return certificadoReservista;
	}

	/**
	 * Altera o numero do Certificado de Reservista ou Certificado de Dispensa
	 * @param certificadoReservista Certificado de Reservista ou Certificado de Dispensa
	 */
	public void setCertificadoReservista(String certificadoReservista) {
		this.certificadoReservista = certificadoReservista.replaceAll(RETIRAPONTOS, "");
	}

	/**
	 * Retorna o Numero do Programa de Integração Social (PIS)
	 * @return Numero do Programa de Integração Social (PIS)
	 */
	public String getPis() {
		return pis;
	}

	/**
	 * Altera o Numero do Programa de Integração Social (PIS)
	 * @param pis Numero do Programa de Integração Social (PIS)
	 */
	public void setPis(String pis) {
		this.pis = pis.replaceAll(RETIRAPONTOS, "");
	}

	/**
	 *  Retorna o Numero da Carteira de Trabalho
	 * @return Numero da Carteira de Trabalho
	 */
	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	/**
	 *  Altera o Numero da Carteira de Trabalho
	 * @param carteiraTrabalho Numero da Carteira de Trabalho
	 */
	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho.replaceAll(RETIRAPONTOS, "");
	}

	/**
	 * Retorna o numero da Carteira Nacional de Habilitação (CNH)
	 * @return Numero da Carteira Nacional de Habilitação (CNH)
	 */
	public String getHabilitacao() {
		return habilitacao;
	}

	/**
	 * Altera o numero da Carteira Nacional de Habilitação (CNH)
	 * @param habilitacao Numero da Carteira Nacional de Habilitação (CNH)
	 */
	public void setHabilitacao(String habilitacao) {
		this.habilitacao = habilitacao.replaceAll(RETIRAPONTOS, "");
	}

	/**
	 * Retorna a Categoria da Carteira Nacional de Habilitação (CNH)
	 * @return Categoria da Carteira Nacional de Habilitação (CNH)
	 */
	public CategoriaHabilitacao getHabilitacaoCategoria() {
		return habilitacaoCategoria;
	}

	/**
	 * Altera a Categoria da Carteira Nacional de Habilitação (CNH)
	 * @param habilitacaoCategoria Categoria da Carteira Nacional de Habilitação (CNH)
	 */
	public void setHabilitacaoCategoria(CategoriaHabilitacao habilitacaoCategoria) {
		this.habilitacaoCategoria = habilitacaoCategoria;
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
		result = prime * result + ((identidade == null) ? 0 : identidade.hashCode());
		result = prime * result + ((tituloEleitor == null) ? 0 : tituloEleitor.hashCode());
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
		if (!(obj instanceof DocumentoPF)) {
			return false;
		}
		DocumentoPF other = (DocumentoPF) obj;
		if (identidade == null) {
			if (other.identidade != null) {
				return false;
			}
		} else if (!identidade.equals(other.identidade)) {
			return false;
		}
		if (tituloEleitor == null) {
			if (other.tituloEleitor != null) {
				return false;
			}
		} else if (!tituloEleitor.equals(other.tituloEleitor)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DocumentoPF [identidade=" + identidade + ", identidadeOrgaoEmissor=" + identidadeOrgaoEmissor
				+ ", identidade2Via=" + identidade2Via + ", tituloEleitor=" + tituloEleitor
				+ ", tituloEleitorLocalidade=" + tituloEleitorLocalidade + ", tituloEleitorZona=" + tituloEleitorZona
				+ ", tituloEleitorSecao=" + tituloEleitorSecao + ", certificadoReservista=" + certificadoReservista
				+ ", pis=" + pis + ", carteiraTrabalho=" + carteiraTrabalho + ", habilitacao=" + habilitacao
				+ ", habilitacaoCategoria=" + habilitacaoCategoria + ", observacaoDocumento=" + observacaoDocumento
				+ "]";
	}	
	
}
