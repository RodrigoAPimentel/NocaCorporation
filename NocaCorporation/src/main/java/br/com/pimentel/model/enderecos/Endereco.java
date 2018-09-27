/**
 * 
 */
package br.com.pimentel.model.enderecos;

/**
 * @author Rodrigo Pimentel
 * @NocaCorporation @2018
 *
 * Interface Endereço
 */
public interface Endereco {

	/**
	 * Retorna o numero do CEP
	 * @return Numero do CEP
	 */
	public String getCep();

	/**
	 * Altera o numero do CEP
	 * @param cep Numero do CEP
	 */
	public void setCep(String cep);

	/** 
	 * Retorna o nome da Rua
	 * @return Nome da Rua
	 */
	public String getRua();

	/**
	 * Altera o nome da Rua
	 * @param rua Nome da Rua
	 */
	public void setRua(String rua);

	/**
	 * Retorna o numero do Imovel
	 * @return Numero do Imovel
	 */
	public Integer getNumero();

	/**
	 * Altera o numero do Imovel
	 * @param numero Numero do Imovel
	 */
	public void setNumero(Integer numero);

	/**
	 * Retorna o Bairro
	 * @return Bairro
	 */
	public String getBairro();

	/**
	 * Altera o Bairro
	 * @param bairro Bairro
	 */
	public void setBairro(String bairro);

	/**
	 * Retorna a Cidade
	 * @return Cidade
	 */
	public String getCidade();

	/**
	 * Altera a Cidade
	 * @param cidade Cidade
	 */
	public void setCidade(String cidade);

	/**
	 * Retorna o Estado da Federação
	 * @return Estado da Federação
	 */
	public String getEstado();

	/**
	 * Altera o Estado da Federação
	 * @param estado Estado da Federação
	 */
	public void setEstado(String estado);

	/**
	 * Retorna o Complemento ao Endereço
	 * @return Complemento ao Endereço
	 */
	public String getComplemento();

	/**
	 * Altera o Complemento ao Endereço
	 * @param complemento Complemento ao Endereço
	 */
	public void setComplemento(String complemento);

	/**
	 * Retorna o Pais
	 * @return Pais
	 */
	public String getPais();

	/**
	 * Altera o Pais
	 * @param pais Pais
	 */
	public void setPais(String pais);

	/**
	 * Retorna o 1º numero de telefone
	 * @return 1º numero de telefone
	 */
	public String getTelefone1();

	/**
	 * Altera o 1º numero de telefone
	 * @param telefone1 1º numero de telefone
	 */
	public void setTelefone1(String telefone1);

	/**
	 * Retorna o 2º numero de telefone
	 * @return 2º numero de telefone
	 */
	public String getTelefone2();

	/**
	 * Altera o 2º numero de telefone
	 * @param telefone2 2º numero de telefone
	 */
	public void setTelefone2(String telefone2);

	/**
	 * Retorna o 3º numero de telefone
	 * @return 3º numero de telefone
	 */
	public String getTelefone3();

	/**
	 * Altera o 3º numero de telefone
	 * @param telefone3 3º numero de telefone
	 */
	public void setTelefone3(String telefone3);

	/**
	 * Retorna o 1º endereço de E-Mail
	 * @return 1º endereço de E-Mail
	 */
	public String getEmail1();

	/**
	 * Altera o 1º endereço de E-Mail
	 * @param email1 1º endereço de E-Mail
	 */
	public void setEmail1(String email1);

	/**
	 * Retorna o 2º endereço de E-Mail
	 * @return 2º endereço de E-Mail
	 */
	public String getEmail2();

	/**
	 * Altera o 2º endereço de E-Mail
	 * @param email2 2º endereço de E-Mail
	 */
	public void setEmail2(String email2);

	/**
	 * Retorna o endereço da Caixa Postal
	 * @return Endereço da Caixa Postal
	 */
	public String getCaixaPostal();

	/**
	 * Altera o Endereço da Caixa Postal
	 * @param caixaPostal Endereço da Caixa Postal
	 */
	public void setCaixaPostal(String caixaPostal);

	/**
	 * Retorna o endereço WEB(URL)
	 * @return Endereço WEB(URL)
	 */
	public String getEnderecoWeb();

	/**
	 * Altera o endereço WEB(URL)
	 * @param enderecoWeb Endereço WEB(URL)
	 */
	public void setEnderecoWeb(String enderecoWeb);
	
	/**
	 * Retorna as observações
	 * @return Observações
	 */
	public String getObservacaoEndereco();
	
	/**
	 * Altera as observações
	 * @param observacao Observações
	 */
	public void setObservacaoEndereco(String observacaoEndereco);

}
