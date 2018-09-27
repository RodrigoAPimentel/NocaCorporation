/**
 * 
 */
package br.com.pimentel.model.enderecos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Rodrigo Pimentel
 * @NocaCorporation @2018
 *
 * Classe que implementa Endereço
 */
@Embeddable
public class EnderecoImpl implements Endereco, Serializable {

	private static final long serialVersionUID = -9151474872475626285L;
	
	private static final String RETIRAPONTOS = "[^0-9]";
	
	@Column(length=8) private String cep;
	@Column(length=50) private String rua;
	@Column(length=6) private Integer numero;
	@Column(length=20) private String bairro;
	@Column(length=20) private String cidade;
	@Column(length=20) private String estado;
	@Column(length=30) private String complemento;
	@Column(length=20) private String pais;
	@Column(length=15) private String telefone1;
	@Column(length=15) private String telefone2;
	@Column(length=15) private String telefone3;
	@Column(length=25) private String email1;
	@Column(length=25) private String email2;
	@Column(length=15) private String caixaPostal;
	@Column(length=30) private String enderecoWeb;
	private String observacaoEndereco;

	public EnderecoImpl() {
		super();
	}

	/**
	 * Cria um objeto Endereço
	 * 
	 * @param cep Numero do CEP
	 * @param rua Nome da Rua
	 * @param numero Numero do domicilio
	 * @param bairro Bairro
	 * @param cidade Cidade
	 * @param estado Estado
	 * @param complemento Complemento ao endereço
	 * @param pais Pais
	 * @param telefone1 Primeiro numero de telefone
	 * @param telefone2 Segundo numero de telefone
	 * @param telefone3 Terceiro numero de telefone
	 * @param email1 Primeiro Email
	 * @param email2Segundo Emal
	 * @param caixaPostal Caixa Postal
	 * @param enderecoWeb URL do site 
	 * @param observacaoEndereco observações
	 */
	public EnderecoImpl(String cep, String rua, Integer numero, String bairro, String cidade, String estado,
			String complemento, String pais, String telefone1, String telefone2, String telefone3, String email1,
			String email2, String caixaPostal, String enderecoWeb, String observacaoEndereco) {
		super();
		this.cep = cep.replaceAll(RETIRAPONTOS, "");
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.complemento = complemento;
		this.pais = pais;
		this.telefone1 = telefone1.replaceAll(RETIRAPONTOS, "");
		this.telefone2 = telefone2.replaceAll(RETIRAPONTOS, "");
		this.telefone3 = telefone3.replaceAll(RETIRAPONTOS, "");
		this.email1 = email1;
		this.email2 = email2;
		this.caixaPostal = caixaPostal.replaceAll(RETIRAPONTOS, "");
		this.enderecoWeb = enderecoWeb;
		this.observacaoEndereco = observacaoEndereco;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#getCep()
	 */
	@Override
	public String getCep() {
		return cep;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#setCep(java.lang.String)
	 */
	@Override
	public void setCep(String cep) {
		this.cep = cep.replaceAll(RETIRAPONTOS, "");
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#getRua()
	 */
	@Override
	public String getRua() {
		return rua;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#setRua(java.lang.String)
	 */
	@Override
	public void setRua(String rua) {
		this.rua = rua;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#getNumero()
	 */
	@Override
	public Integer getNumero() {
		return numero;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#setNumero(java.lang.Integer)
	 */
	@Override
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#getBairro()
	 */
	@Override
	public String getBairro() {
		return bairro;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#setBairro(java.lang.String)
	 */
	@Override
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#getCidade()
	 */
	@Override
	public String getCidade() {
		return cidade;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#setCidade(java.lang.String)
	 */
	@Override
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#getEstado()
	 */
	@Override
	public String getEstado() {
		return estado;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#setEstado(java.lang.String)
	 */
	@Override
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#getComplemento()
	 */
	@Override
	public String getComplemento() {
		return complemento;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#setComplemento(java.lang.String)
	 */
	@Override
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#getPais()
	 */
	@Override
	public String getPais() {
		return pais;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#setPais(java.lang.String)
	 */
	@Override
	public void setPais(String pais) {
		this.pais = pais;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#getTelefone1()
	 */
	@Override
	public String getTelefone1() {
		return telefone1;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#setTelefone1(java.lang.String)
	 */
	@Override
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1.replaceAll(RETIRAPONTOS, "");
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#getTelefone2()
	 */
	@Override
	public String getTelefone2() {
		return telefone2;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#setTelefone2(java.lang.String)
	 */
	@Override
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2.replaceAll(RETIRAPONTOS, "");
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#getTelefone3()
	 */
	@Override
	public String getTelefone3() {
		return telefone3;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#setTelefone3(java.lang.String)
	 */
	@Override
	public void setTelefone3(String telefone3) {
		this.telefone3 = telefone3.replaceAll(RETIRAPONTOS, "");
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#getEmail1()
	 */
	@Override
	public String getEmail1() {
		return email1;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#setEmail1(java.lang.String)
	 */
	@Override
	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#getEmail2()
	 */
	@Override
	public String getEmail2() {
		return email2;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#setEmail2(java.lang.String)
	 */
	@Override
	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#getCaixaPostal()
	 */
	@Override
	public String getCaixaPostal() {
		return caixaPostal;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#setCaixaPostal(java.lang.String)
	 */
	@Override
	public void setCaixaPostal(String caixaPostal) {
		this.caixaPostal = caixaPostal.replaceAll(RETIRAPONTOS, "");
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#getEnderecoWeb()
	 */
	@Override
	public String getEnderecoWeb() {
		return enderecoWeb;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#setEnderecoWeb(java.lang.String)
	 */
	@Override
	public void setEnderecoWeb(String enderecoWeb) {
		this.enderecoWeb = enderecoWeb;
	}
	
	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#getObservacao()
	 */
	@Override
	public String getObservacaoEndereco() {
		return observacaoEndereco;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.aNovo.Endereco#setObservacao(java.lang.String)
	 */
	@Override
	public void setObservacaoEndereco(String observacaoEndereco) {
		this.observacaoEndereco = observacaoEndereco;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
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
		if (!(obj instanceof EnderecoImpl)) {
			return false;
		}
		EnderecoImpl other = (EnderecoImpl) obj;
		if (bairro == null) {
			if (other.bairro != null) {
				return false;
			}
		} else if (!bairro.equals(other.bairro)) {
			return false;
		}
		if (cidade == null) {
			if (other.cidade != null) {
				return false;
			}
		} else if (!cidade.equals(other.cidade)) {
			return false;
		}
		if (estado == null) {
			if (other.estado != null) {
				return false;
			}
		} else if (!estado.equals(other.estado)) {
			return false;
		}
		if (numero == null) {
			if (other.numero != null) {
				return false;
			}
		} else if (!numero.equals(other.numero)) {
			return false;
		}
		if (rua == null) {
			if (other.rua != null) {
				return false;
			}
		} else if (!rua.equals(other.rua)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EnderecoImpl [cep=" + cep + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cidade="
				+ cidade + ", estado=" + estado + ", complemento=" + complemento + ", pais=" + pais + ", telefone1="
				+ telefone1 + ", telefone2=" + telefone2 + ", telefone3=" + telefone3 + ", email1=" + email1
				+ ", email2=" + email2 + ", caixaPostal=" + caixaPostal + ", enderecoWeb=" + enderecoWeb
				+ ", observacaoEndereco=" + observacaoEndereco + "]";
	}

}
