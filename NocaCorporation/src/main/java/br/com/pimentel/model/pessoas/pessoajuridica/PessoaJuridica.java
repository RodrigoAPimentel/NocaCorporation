package br.com.pimentel.model.pessoas.pessoajuridica;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import br.com.pimentel.model.documentos.DocumentoPJ;
import br.com.pimentel.model.enderecos.EnderecoImpl;
import br.com.pimentel.model.pessoas.pessoafisica.PessoaFisica;
/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Classe que implementa uma Pessoa do tipo Pessoa Juridica
 */
@Entity @Inheritance(strategy=InheritanceType.JOINED)
public abstract class PessoaJuridica implements Serializable {

	private static final long serialVersionUID = 5811151983484505555L;
	
	@Id @Column(length=15) private String cnpj;
	@Column(length=100) private String razaoSocial;
	@Column(length=100) private String nomeFantasia;
	@Embedded private EnderecoImpl endereco;
	@Embedded private DocumentoPJ documento;
	private LocalDate dataFundacao;
	@Column(length=6) private Integer numeroDeFuncionarios;
	@OneToOne(cascade=CascadeType.ALL) private PessoaFisica propietario;
	@OneToOne(cascade=CascadeType.ALL) private PessoaFisica pessoaDeContato;
	private Boolean matriz;
	private String observacao;

	public PessoaJuridica() {
		super();
	}

	/**
	 * Cria uma Pessoa Juridica
	 * 
	 * @param cnpj Numero do Cadastro Nacional de Pessoa Juridica (CNPJ)
	 * @param razaoSocial Razão social da empresa
	 * @param nomeFantasia Nome fantasia da empresa
	 * @param endereco Endereço da empresa
	 * @param documento Documentos da empresa
	 * @param dataFundacao Data de fundação da empresa
	 * @param numeroDeFuncionarios Numero de funcionarios da empresa
	 * @param propietario Proprietario da empresa
	 * @param pessoaDeContato Pessoa para pessoaDeContato da empresa
	 * @param matriz Se a empresa é a matriz ou filial (TRUE - Matiz | FALSE - Filial)
	 * @param observacao Observações
	 */
	public PessoaJuridica(String cnpj, String razaoSocial, String nomeFantasia, EnderecoImpl endereco,
			DocumentoPJ documento, LocalDate dataFundacao, Integer numeroDeFuncionarios, PessoaFisica propietario,
			PessoaFisica pessoaDeContato, Boolean matriz, String observacao) {
		super();
		this.cnpj = cnpj.replaceAll("[^0-9]", "");
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.endereco = endereco;
		this.documento = documento;
		this.dataFundacao = dataFundacao;
		this.numeroDeFuncionarios = numeroDeFuncionarios;
		this.propietario = propietario;
		this.pessoaDeContato = pessoaDeContato;
		this.matriz = matriz;
		this.observacao = observacao;
	}
	
	/**
	 * Retorna o Cadastro Nacional de Pessoa Juridica (CNPJ)
	 * @return Numero do Cadastro Nacional de Pessoa Juridica (CNPJ)
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * Altera o Cadastro Nacional de Pessoa Juridica (CNPJ)
	 * @param cnpj Numero do Cadastro Nacional de Pessoa Juridica (CNPJ)
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj.replaceAll("[^0-9]", "");
	}

	/**
	 * Retorna as informações de Endereço
	 * @return Objeto do tipo Endereço
	 */
	public EnderecoImpl getEndereco() {
		return endereco;
	}

	/**
	 * Altera as informações de Endereço
	 * @param endereco Objeto do tipo Endereço
	 */
	public void setEndereco(EnderecoImpl endereco) {
		this.endereco = endereco;
	}

	/**
	 * Retorna as informações de Documentos
	 * @return Objeto do tipo Documento
	 */
	public DocumentoPJ getDocumento() {
		return documento;
	}

	/**
	 * Altera as informações de Documentos
	 * @param documento Objeto do tipo Documento
	 */
	public void setDocumento(DocumentoPJ documento) {
		this.documento = documento;
	}

	/**
	 * Retorna a Razão Social
	 * @return Razão Social
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	 * Altera a Razão Social
	 * @param razaoSocial Razão Social
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	/**
	 * Retorna o Nome Fantasia
	 * @return Nome Fantasia
	 */
	public String getNomeFantasia() {
		return nomeFantasia;
	}

	/**
	 * Altera o Nome Fantasia
	 * @param nomeFantasia Nome Fantasia
	 */
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	/**
	 * Retorna a Data de Fundação
	 * @return Data de Fundação
	 */
	public LocalDate getDataFundacao() {
		return dataFundacao;
	}

	/**
	 * Altera a Data de Fundação
	 * @param dataFundacao Data de Fundação
	 */
	public void setDataFundacao(LocalDate dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	/**
	 * Retorna o Numero de Funcionarios
	 * @return Numero de Funcionarios
	 */
	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	/**
	 * Altera o Numero de Funcionarios
	 * @param numeroDeFuncionarios Numero de Funcionarios
	 */
	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	/**
	 * Retorna o(s) Propietario(s)
	 * @return Lista de Propietario(s)
	 */
	public PessoaFisica getPropietario() {
		return propietario;
	}

	/**
	 * Altera o(s) Propietario(s)
	 * @param propietario Lista de Propietario(s)
	 */
	public void setPropietario(PessoaFisica propietario) {
		this.propietario = propietario;
	}

	/**
	 * Retorna a(s) pessoa(s) de Contato
	 * @return Lista de pessoa(s) de Contato
	 */
	public PessoaFisica getPessoaDeContato() {
		return pessoaDeContato;
	}

	/**
	 * Altera a(s) pessoa(s) de Contato
	 * @param pessoaDeContato Lista de pessoa(s) de Contato
	 */
	public void setPessoaDeContato(PessoaFisica pessoaDeContato) {
		this.pessoaDeContato = pessoaDeContato;
	}

	/**
	 * Retorna se a Pessoa Juridica é uma Matriz ou Filial 
	 * @return TRUE - Matiz | FALSE - Filial
	 */
	public Boolean getMatriz() {
		return matriz;
	}

	/**
	 * Altera se a Pessoa Juridica é uma Matriz ou Filial 
	 * @param matriz TRUE - Matiz | FALSE - Filial
	 */
	public void setMatriz(Boolean matriz) {
		this.matriz = matriz;
	}

	/**
	 * Retorna as observações
	 * @return Observações
	 */
	public String getObservacaoPessoa() {
		return observacao;
	}

	/**
	 * Altera as observações
	 * @param observacao Observações
	 */
	public void setObservacaoPessoa(String observacao) {
		this.observacao = observacao;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial
				+ ", nomeFantasia=" + nomeFantasia + ", endereco=" + endereco + ", documento=" + documento
				+ ", dataFundacao=" + dataFundacao + ", numeroDeFuncionarios=" + numeroDeFuncionarios + ", propietario="
				+ propietario.toString() + ", pessoaDeContato=" + pessoaDeContato.toString() + ", matriz=" + matriz + ", observacao="
				+ observacao + "]";
	}

}
