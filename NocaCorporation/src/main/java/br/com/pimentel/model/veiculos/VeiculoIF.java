package br.com.pimentel.model.veiculos;

import java.time.LocalDate;
import java.util.List;

import br.com.pimentel.model.enums.Acessorios;
import br.com.pimentel.model.enums.Combustivel;
import br.com.pimentel.model.enums.SituacaoOperacionalVeiculo;
import br.com.pimentel.model.locacao.PlanoLocacao;
import br.com.pimentel.model.pessoas.pessoajuridica.PessoaJuridica;


/**
 * @author Rodrigo Pimentel
 * @LocadoraNocaCorporation @2018
 *
 * Interface que abstrai um Veiculo Generico
 */
public interface VeiculoIF {
	
	/**
	 * @return Retorna o Registro Nacional de Veiculos Automotores do veiculo
	 */
	public String getRenavam();

	/**
	 * @param renavam Altera o numero do Registro Nacional de Veiculos Automotores do veiculo
	 */
	public void setRenavam(String renavam);

	/**
	 * @return Retorna o numero do Chassis do veiculo
	 */
	public String getChassis();

	/**
	 * @param chassis Altera o numero do Chassis do veiculo
	 */
	public void setChassis(String chassis);
	
	/**
	 * @return Retorna o numero do motor do veiculo
	 */
	public String getNumeroMotor();

	/**
	 * @param numeroMotor Altera o numero do motor do veiculo
	 */
	public void setNumeroMotor(String numeroMotor);

	/**
	 * @return Retorna o numero da placa do veiculo
	 */
	public String getPlaca();

	/**
	 * @param placa Altera a placa do veiculo
	 */
	public void setPlaca(String placa);

	/**
	 * @return Retorna a marca do veiculo
	 */
	public String getMarca();

	/**
	 * @param marca Altera a marca do veiculo
	 */
	public void setMarca(String marca);

	/**
	 * @return Retorna o modelo do veiculo
	 */
	public String getModelo();

	/**
	 * @param modelo Altera o modelo do veiculo
	 */
	public void setModelo(String modelo);

	/**
	 * @return Retorna a potencia(Cavalo) do veiculo
	 */
	public Integer getPotencia();

	/**
	 * @param potencia modifica a potencia(Cavalo) do veiculo
	 */
	public void setPotencia(Integer potencia);
	
	/**
	 * @return Retorna as cilindradas(Capacidade Cubica) do veiculo
	 */
	public Integer getCilindrada();

	/**
	 * @param cilindrada Modifica as cilindradas(Capacidade Cubica) do veiculo
	 */
	public void setCilindrada(Integer cilindrada);

	/**
	 * @return retorna a cor do veiculo
	 */
	public String getCor();

	/**
	 * @param cor modifica a cor do veiculo
	 */
	public void setCor(String cor);

	/**
	 * @return Retorna o tipo de combustivel utilizado pelo veiculo
	 */
	public Combustivel getTipoCombustivel();

	/**
	 * @param tipoCombustivel Altera o tipo de combustivel utilizado pelo veiculo
	 */
	public void setTipoCombustivel(Combustivel tipoCombustivel);

	/**
	 * @return Retorna o ano de fabricação do veiculo
	 */
	public LocalDate getAnoFabricacao();

	/**
	 * @param anoFabricacao Modifica o ano de fabricação do veiculo
	 */
	public void setAnoFabricacao(LocalDate anoFabricacao);

	/**
	 * @return Retorna o ano de modelo do veiculo
	 */
	public LocalDate getAnoModelo();

	/**
	 * @param anoModelo Modifica o ano de modelo do veiculo
	 */
	public void setAnoModelo(LocalDate anoModelo);

	/**
	 * @return Retorna a data de aquisição do veiculo pela empresa
	 */
	public LocalDate getDataAquisicao();

	/**
	 * @param dataAquisicao Modifica a data de aquisição do veiculo pela empresa
	 */
	public void setDataAquisicao(LocalDate dataAquisicao);

	/**
	 * @return Agencia em que o veiculo esta alocado
	 */
	public PessoaJuridica getLocadoraBase();

	/**
	 * @param agenciaBase Modifica a agencia no qual o veiculo esta alocado
	 */
	public void setLocadoraBase(PessoaJuridica locadoraBase);

	/**
	 * @return Retorna o nivel do tanque de combustivel do veiculo
	 */
	public Double getNivelTanque();

	/**
	 * @param nivelTanque Modifica o nivel do tanque de combustivel do veiculo
	 */
	public void setNivelTanque(Double nivelTanque);
	
	/**
	 * @return Retorna o tipo de freios utilizadas pelo veiculo
	 */
	public String getTipoFreios();

	/**
	 * @param tipoFreios Modifica o tipo de freio do veiculo
	 */
	public void setTipoFreios(String tipoFreios);

	/**
	 * @return Retorna a data da ultima revião feita pelo veiculo
	 */
	public LocalDate getUltimaRevisao();

	/**
	 * @param ultimaRevisao Altera a data da ultima revisao feita pelo veiculo
	 */
	public void setUltimaRevisao(LocalDate ultimaRevisao);
	
	/**
	 * @return Retorna uma lista de opcionais do veiculo
	 */
	public List<Acessorios> getAcessorios();

	/**
	 * @param acessorios Modifica a lista de opcionais do veiculo
	 */
	public void setAcessorios(List<Acessorios> acessorios);

	/**
	 * @return O status atual do veiculo {@link Status}
	 */
	public SituacaoOperacionalVeiculo getSituacaoOperacional();

	/**
	 * @param status Modifica o Status atual do veiculo
	 */
	public void setSituacaoOperacional(SituacaoOperacionalVeiculo situacaoOperacional);

	/**
	 * @return Observações
	 */
	public String getObservacoesVeiculo();

	/**
	 * @param observacoes Observações
	 */
	public void setObservacoesVeiculo(String observacoesVeiculo);
	
	/**
	 * Retorna o Plano de Locação ao qual pertence o veiculo
	 * @return Plano de Locação
	 */
	public PlanoLocacao planoLocacao();
	
	/**
	 * Altera o Plano de Locação ao qual pertence o veiculo
	 * @param planoLocacao Plano de Locação
	 */
	public void planoLocacao(PlanoLocacao planoLocacao);

}
