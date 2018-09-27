package br.com.pimentel.model.pessoas.pessoafisica.clientes;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.pimentel.model.documentos.DocumentoPF;
import br.com.pimentel.model.enderecos.EnderecoImpl;
import br.com.pimentel.model.enums.EstadoCivil;
import br.com.pimentel.model.enums.GrauInstrucao;
import br.com.pimentel.model.pessoas.Cliente;
import br.com.pimentel.model.pessoas.pessoafisica.PessoaFisica;
import br.com.pimentel.util.GeradorCodigo;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Classe que abstrai um Cliente do tipo Cliente pessoa fisica
 */
@Entity
@Table(name="cliente_pessoa_fisica")
public class ClientePF extends PessoaFisica implements Cliente, Serializable {

	private static final long serialVersionUID = 639652096326359366L;

	private static final String RETIRAPONTOS = "[^0-9]";

	private String codigo;
	private Integer quantidadePermitidaLocacao;
	private Double valorDebito;
	private LocalDate dataCadastro;	
	
	public ClientePF() {
	}
	
	/**
	 * Cria um Cliente do tipo Pessoa Fisica
	 * 
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
	 * @param codigo Codigo do cliente
	 * @param quantidadePermitidaLocacao Quantidade maxima de veiculo que podem ser locados ao mesmo tempo
	 * @param valorDebito Debito existente do cliente
	 * @param dataCadastro Data de cadastro
	 */
	public ClientePF(String cpf, String nome, String naturalidade, String nacionalidade, LocalDate dataNascimento,
			EnderecoImpl endereco, DocumentoPF documento, String filiacaoPai, String filiacaoMae,
			EstadoCivil estadoCivil, GrauInstrucao grauDeInstrucao, Boolean sexo, String observacaoPessoa,
			Integer quantidadePermitidaLocacao, Double valorDebito, LocalDate dataCadastro) {
		super(cpf.replaceAll(RETIRAPONTOS, ""), nome, naturalidade, nacionalidade, dataNascimento, endereco, documento, filiacaoPai, filiacaoMae,
				estadoCivil, grauDeInstrucao, sexo, observacaoPessoa);
		this.quantidadePermitidaLocacao = quantidadePermitidaLocacao;
		this.valorDebito = valorDebito;
		this.dataCadastro = dataCadastro;
		this.codigo=GeradorCodigo.codigoClientePF(cpf, LocalDate.now());		
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.pessoas.Cliente#getCodigo()
	 */
	@Override
	public String getCodigo() {
		return codigo;
	}
	
	/* (non-Javadoc)
	 * @see br.com.pimentel.model.pessoas.Cliente#getQuantidadePermitidaLocacao()
	 */
	@Override
	public Integer getQuantidadePermitidaLocacao() {
		return quantidadePermitidaLocacao;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.pessoas.Cliente#setQuantidadePermitidaLocacao(java.lang.Integer)
	 */
	@Override
	public void setQuantidadePermitidaLocacao(Integer quantidadePermitida) {
		this.quantidadePermitidaLocacao = quantidadePermitida;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.pessoas.Cliente#getDebito()
	 */
	@Override
	public Double getDebito() {
		return valorDebito;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.pessoas.Cliente#setDebito(java.lang.Double)
	 */
	@Override
	public void setDebito(Double debito) {
		this.valorDebito = debito;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.pessoas.Cliente#getDataCadastro()
	 */
	@Override
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.pessoas.Cliente#setDataCadastro(java.time.LocalDate)
	 */
	@Override
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
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
		if (!(obj instanceof ClientePF)) {
			return false;
		}
		ClientePF other = (ClientePF) obj;
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		if (dataCadastro == null) {
			if (other.dataCadastro != null) {
				return false;
			}
		} else if (!dataCadastro.equals(other.dataCadastro)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClientePF [codigo=" + codigo + ", quantidadePermitidaLocacao=" + quantidadePermitidaLocacao
				+ ", valorDebito=" + valorDebito + ", dataCadastro=" + dataCadastro + ", toString()=" + super.toString()
				+ "]";
	}

}
