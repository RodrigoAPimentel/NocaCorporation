package br.com.pimentel.model.pessoas.pessoafisica.funcionarios;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.pimentel.model.documentos.DocumentoPF;
import br.com.pimentel.model.enderecos.EnderecoImpl;
import br.com.pimentel.model.enums.Cargo;
import br.com.pimentel.model.enums.EstadoCivil;
import br.com.pimentel.model.enums.GrauInstrucao;
import br.com.pimentel.model.pessoas.pessoafisica.PessoaFisica;
import br.com.pimentel.util.GeradorCodigo;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Classe que abstrai um Funcionario do tipo AgenteLocacao
 */
@Entity
public class AgenteLocacao extends PessoaFisica implements Funcionario, Serializable {

	private static final long serialVersionUID = 7911285932052369044L;
	
	private static final String RETIRAPONTOS = "[^0-9]";
	
	@Column(length=20) private String matricula;
	@Enumerated(EnumType.STRING) private Cargo cargo;
	private Double salario;
	private LocalDate dataAdmissao;
	private Double porcentagemDeComissao;	
	
	public AgenteLocacao() {
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
	 * @param matricula Numero de matricula
	 * @param cargo Cargo exercido
	 * @param salario Salario recebido
	 * @param dataAdmissao Data de admisão na empresa
	 * @param porcentagemDeComissao Porcentagem para calculo de comissão
	 */
	public AgenteLocacao(String cpf, String nome, String naturalidade, String nacionalidade, LocalDate dataNascimento, EnderecoImpl endereco,
			DocumentoPF documento, String filiacaoPai, String filiacaoMae, EstadoCivil estadoCivil, GrauInstrucao grauDeInstrucao, 
			Boolean sexo, String observacao, Double salario, LocalDate dataAdmissao, Double porcentagemDeComissao) {
		super(cpf.replaceAll(RETIRAPONTOS, ""), nome, naturalidade, nacionalidade, dataNascimento, endereco, documento, filiacaoPai, filiacaoMae,
				estadoCivil, grauDeInstrucao, sexo, observacao);
		this.matricula = GeradorCodigo.matriculaFuncionario(cpf, LocalDate.now());
		this.cargo = Cargo.AGENTELOCACAO;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.porcentagemDeComissao = porcentagemDeComissao;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.Funcionario#getMatricula()
	 */
	@Override
	public String getMatricula() {
		return matricula;
	}
	
	/* (non-Javadoc)
	 * @see br.com.pimentel.model.pessoas.pessoafisica.funcionarios.Funcionario#setMatricula(java.lang.String)
	 */
	@Override
	public void setMatricula(String matricula) {
		this.matricula = matricula;		
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.Funcionario#getCargo()
	 */
	@Override
	public Cargo getCargo() {
		return cargo;
	}
	
	/**
	 * @param cargo Cargo do Funcionario
	 */
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	 
	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.Funcionario#getSalario()
	 */
	@Override
	public Double getSalario() {
		return salario;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.Funcionario#setSalario(java.lang.Double)
	 */
	@Override
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.Funcionario#getDataAdmissao()
	 */
	@Override
	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.Funcionario#setDataAdmisao(java.util.Date)
	 */
	@Override
	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	/**
	 * Retorna a porcentagem que deve ser aplicado para calcular a comissão
	 * @return Porcentagem de comissão
	 */
	public Double getPorcentagemDeComissao() {
		return porcentagemDeComissao;
	}

	/**
	 * Altera a porcentagem que deve ser aplicado para calcular a comissão
	 * @param porcentagemDeComissao Porcentagem de comissão
	 */
	public void setPorcentagemDeComissao(Double porcentagemDeComissao) {
		this.porcentagemDeComissao = porcentagemDeComissao;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgenteLocacao other = (AgenteLocacao) obj;
		if (cargo != other.cargo)
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Gerente [" + super.toString() + " matricula=" + matricula + ", cargo=" + cargo + ", salario=" + salario + ", dataAdmissao="
				+ dataAdmissao + ", porcentagemDeComissao=" + porcentagemDeComissao + "]";
	}

}
