package br.com.pimentel.model.pessoas.pessoajuridica;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.pimentel.model.documentos.DocumentoPJ;
import br.com.pimentel.model.enderecos.EnderecoImpl;
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
@Table(name="cliente_pessoa_juridica")
public class ClientePJ extends PessoaJuridica implements Cliente, Serializable {

	private static final long serialVersionUID = -7852757710287832279L;
	
	private static final String RETIRAPONTOS = "[^0-9]";
	
	private String codigo;
	private Integer quantidadePermitidaLocacao;
	private Double debito;
	private LocalDate dataCadastro;

	public ClientePJ() {
		super();
	}

	/**
	 * Cria um Cliente do tipo Pessoa Juridica
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
	 * @param codigo Codigo do cliente
	 * @param quantidadePermitidaLocacao Quantidade maxima de veiculo que podem ser locados ao mesmo tempo
	 * @param valorDebito Debito existente do cliente
	 * @param dataCadastro Data de cadastro
	 */
	public ClientePJ(String cnpj, String razaoSocial, String nomeFantasia, EnderecoImpl endereco, DocumentoPJ documento,
			LocalDate dataFundacao, Integer numeroDeFuncionarios, PessoaFisica propietario,	PessoaFisica pessoaDeContato,
			Boolean matriz, String observacao, Integer quantidadePermitidaLocacao, Double debito, LocalDate dataCadastro) {
		super(cnpj.replaceAll(RETIRAPONTOS, ""), razaoSocial, nomeFantasia, endereco, documento, dataFundacao, numeroDeFuncionarios, propietario,
				pessoaDeContato, matriz, observacao);
		this.codigo = GeradorCodigo.codigoClientePJ(cnpj, LocalDate.now());
		this.quantidadePermitidaLocacao = quantidadePermitidaLocacao;
		this.debito = debito;
		this.dataCadastro = dataCadastro;
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
		return debito;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.pessoas.Cliente#setDebito(java.lang.Double)
	 */
	@Override
	public void setDebito(Double debito) {
		this.debito = debito;
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
		if (!(obj instanceof ClientePJ)) {
			return false;
		}
		ClientePJ other = (ClientePJ) obj;
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
		return "ClientePJ [codigo=" + codigo + ", quantidadePermitidaLocacao=" + quantidadePermitidaLocacao
				+ ", debito=" + debito + ", dataCadastro=" + dataCadastro + "]";
	}

}
