package br.com.pimentel.model.pessoas.pessoafisica;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.pimentel.model.documentos.DocumentoPF;
import br.com.pimentel.model.enderecos.EnderecoImpl;
import br.com.pimentel.model.enums.EstadoCivil;
import br.com.pimentel.model.enums.GrauInstrucao;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Classe que implementa uma Pessoa do tipo Pessoa Fisica
 */
@Entity @Inheritance(strategy=InheritanceType.JOINED)
public class PessoaFisica implements Serializable {

	private static final long serialVersionUID = 7354324095282610499L;
	
	@Id @Column(length=11) private String cpf;
	@Column(length=100) private String nome;
	@Column(length=100) private String naturalidade;
	@Column(length=100) private String nacionalidade;
	@DateTimeFormat(pattern = "yyyy-MM-dd") private LocalDate dataNascimento;
	@Embedded private EnderecoImpl endereco;
	@Embedded private DocumentoPF documento;
	@Column(length=100) private String filiacaoPai;
	@Column(length=100) private String filiacaoMae;
	@Enumerated(EnumType.STRING) private EstadoCivil estadoCivil;
	@Enumerated(EnumType.STRING) private GrauInstrucao grauDeInstrucao;
	private Boolean sexo;
	private String observacaoPessoa;	

	public PessoaFisica() {
		super();
	}

	/**
	 * @param cpf Numero do Cadastro de Pessoa Fisica (CPF)
	 * @param nome Nome completo
	 * @param naturalidade Cidade e Estado de nascimento
	 * @param nacionalidade Pais de nascimento
	 * @param dataNascimento Data de Nascimento
	 * @param endereco Endereço(s)
	 * @param documento Documento(s)
	 * @param filiacaoPai Nome do Pai
	 * @param filiacaoMae Nome da Mãe
	 * @param estadoCivil Estado Civil
	 * @param conjugue Conjugue
	 * @param grauDeInstrucao Grau de instrução
	 * @param sexo Sexo (TRUE - Masculino | FALSE - Feminino)
	 * @param observacao Observações
	 */
	public PessoaFisica(String cpf, String nome, String naturalidade, String nacionalidade, LocalDate dataNascimento, EnderecoImpl endereco,
			DocumentoPF documento, String filiacaoPai, String filiacaoMae, EstadoCivil estadoCivil, 
			GrauInstrucao grauDeInstrucao, Boolean sexo, String observacaoPessoa) {
		super();
		this.cpf = cpf.replaceAll("[^0-9]", "");
		this.nome = nome;
		this.naturalidade = naturalidade;
		this.nacionalidade = nacionalidade;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.documento = documento;
		this.filiacaoPai = filiacaoPai;
		this.filiacaoMae = filiacaoMae;
		this.estadoCivil = estadoCivil;
		this.grauDeInstrucao = grauDeInstrucao;
		this.sexo = sexo;
		this.observacaoPessoa = observacaoPessoa;
	}
	
	/**
	 * Retorna o Cadastro de Pessoa Fisica (CPF)
	 * @return Numero do Cadastro de Pessoa Fisica (CPF)
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Altera o Cadastro de Pessoa Fisica (CPF)
	 * @param cpf Numero do Cadastro de Pessoa Fisica (CPF)
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf.replaceAll("[^0-9]", "");
	}

	/**
	 * Retorna o nome completo
	 * @return Nome completo
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Altera o nome completo
	 * @param nome Nome completo
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna a cidade e estado de nascimento
	 * @return Cidade e estado de nascimento
	 */
	public String getNaturalidade() {
		return naturalidade;
	}

	/**
	 * Altera a cidade e estado de nascimento
	 * @param naturalidade Cidade e estado de nascimento
	 */
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	/**
	 * Retorna o Pais de nascimento
	 * @return Pais de nascimento
	 */
	public String getNacionalidade() {
		return nacionalidade;
	}

	/**
	 * Altera o Pais de nascimento
	 * @param nacionalidade Pais de nascimento
	 */
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	/**
	 * Retorna a data de nascimento
	 * @return Data de nascimento
	 */
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * Altera a data de nascimento
	 * @param dataNascimento Data de nascimento
	 */
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * Retorna o nome completo do Pai
	 * @return Nome completo do Pai
	 */
	public String getFiliacaoPai() {
		return filiacaoPai;
	}

	/**
	 * Altera o nome completo do Pai
	 * @param filiacaoPai Nome completo do Pai
	 */
	public void setFiliacaoPai(String filiacaoPai) {
		this.filiacaoPai = filiacaoPai;
	}

	/**
	 * Retorna o nome completo da Mãe
	 * @return Nome completo da Mãe
	 */
	public String getFiliacaoMae() {
		return filiacaoMae;
	}

	/**
	 * Altera o nome completo da Mãe
	 * @param filiacaoMae Nome completo da Mãe
	 */
	public void setFiliacaoMae(String filiacaoMae) {
		this.filiacaoMae = filiacaoMae;
	}

	/**
	 * Retorna o estado civil
	 * @return Estado civil
	 */
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	/**
	 * Altera o estado civil
	 * @param estadoCivil Estado civil
	 */
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	/**
	 * Retorna o grau de instrução
	 * @return Grau de instrução
	 */
	public GrauInstrucao getGrauDeInstrucao() {
		return grauDeInstrucao;
	}

	/**
	 * Altera o grau de instrução
	 * @param grauDeInstrucao Grau de instrução
	 */
	public void setGrauDeInstrucao(GrauInstrucao grauDeInstrucao) {
		this.grauDeInstrucao = grauDeInstrucao;
	}

	/**
	 * Retorna o sexo (TRUE - Masculino | FALSE - Feminino)
	 * @return TRUE - Masculino | FALSE - Feminino
	 */
	public Boolean getSexo() {
		return sexo;
	}

	/**
	 * Altera o sexo (TRUE - Masculino | FALSE - Feminino)
	 * @param sexo TRUE - Masculino | FALSE - Feminino
	 */
	public void setSexo(Boolean sexo) {
		this.sexo = sexo;
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
	public DocumentoPF getDocumento() {
		return documento;
	}

	/**
	 * Altera as informações de Documentos
	 * @param documento Objeto do tipo Documento
	 */
	public void setDocumento(DocumentoPF documento) {
		this.documento = documento;
	}

	/**
	 * Retorna as observações
	 * @return Observações
	 */
	public String getObservacaoPessoa() {
		return observacaoPessoa;
	}

	/**
	 * Altera as observações
	 * @param observacao Observações
	 */
	public void setObservacaoPessoa(String observacaoPessoa) {
		this.observacaoPessoa = observacaoPessoa;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", nome=" + nome + ", naturalidade=" + naturalidade
				+ ", nacionalidade=" + nacionalidade + ", dataNascimento=" + dataNascimento + ", endereco=" + endereco
				+ ", documento=" + documento + ", filiacaoPai=" + filiacaoPai + ", filiacaoMae=" + filiacaoMae
				+ ", estadoCivil=" + estadoCivil + ", grauDeInstrucao=" + grauDeInstrucao + ", sexo=" + sexo
				+ ", observacaoPessoa=" + observacaoPessoa + "]";
	}

}
