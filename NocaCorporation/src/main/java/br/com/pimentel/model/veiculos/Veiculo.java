/**
 * 
 */
package br.com.pimentel.model.veiculos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.pimentel.model.enums.Acessorios;
import br.com.pimentel.model.enums.Combustivel;
import br.com.pimentel.model.enums.SituacaoOperacionalVeiculo;
import br.com.pimentel.model.locacao.PlanoLocacao;
import br.com.pimentel.model.pessoas.pessoajuridica.PessoaJuridica;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Classe que abstrai um Veiculo de forma generica
 */
@Entity @Inheritance(strategy=InheritanceType.JOINED) @Table(name="veiculo")
public abstract class Veiculo implements VeiculoIF, Serializable {

	private static final long serialVersionUID = -483310058851308649L;
	
	private static final String RETIRAPONTOS = "[^0-9]";
	
	@Column(length=20) private String renavam;
	@Id @Column(length=20) private String chassis;
	@Column(length=20) private String numeroMotor;
	@Column(length=8) private String placa;
	@Column(length=20) private String marca;
	@Column(length=20) private String modelo;
	@Column(length=10) private Integer potencia;
	@Column(length=10) private Integer cilindrada;
	@Column(length=10) private String cor;
	@Enumerated(EnumType.STRING) private Combustivel tipoCombustivel;
	private LocalDate anoFabricacao;
	private LocalDate anoModelo;
	private LocalDate dataAquisicao;
	@OneToOne(cascade=CascadeType.MERGE) private PessoaJuridica locadoraBase;
	private Double nivelTanque;
	@Column(length=15) private String tipoFreios;
	private LocalDate ultimaDataRevisao;
	@Enumerated(EnumType.STRING) @ElementCollection private List<Acessorios> acessorios;
	@Enumerated(EnumType.STRING) private SituacaoOperacionalVeiculo situacaoOperacional;
	private String observacaoVeiculo;
	@ManyToOne @JoinColumn(name="idPlanoLocacao") private PlanoLocacao planoLocacao;

	public Veiculo() {
		super();
	}

	/**
	 * Cria um veiculo Generico
	 * 
	 * @param renavam Numero do Registro Nacional de Veiculos Automotores
	 * @param chassis Numero do Chassis do veiculo
	 * @param numeroMotor Numero do motor do veiculo
	 * @param placa Numero da Placa do veiculo
	 * @param marca Marca do Veiculo 
	 * @param modelo Modelo do Veiculo
	 * @param potencia Potencia (em cavalos) do veiculo
	 * @param cilindrada Dimensão cubica do cilindro do motor do veiculo
	 * @param cor Cor predominante do veiculo
	 * @param tipoCombustivel Tipo de combustivel utilizado pelo veiculo {@link Combustivel}
	 * @param anoFabricacao Ano de fabricação do veiculo
	 * @param anoModelo Ano de modelo do veiculo 
	 * @param dataAquisicao Data de aquisição do veiculo pela empresa
	 * @param locadoraBase Agencia em que esta localizado o veiculo
	 * @param nivelTanque Nivel de combustivel no tanque do veiculo
	 * @param tipoFreios Tipo de freio utilizado pelo veiculo
	 * @param ultimaDataRevisao Data da ultima revisão feita pelo veiculo
	 * @param acessorios Acessorios preentes no veiculo
	 * @param situacaoOperacional Status do veiculo, se esta locado ou não
	 * @param observacaoVeiculo Observações
	 * @param planoLocacao Plano de Locação ao qual pertence o Veiculos
	 */
	public Veiculo(String renavam, String chassis, String numeroMotor, String placa, String marca, String modelo,
			Integer potencia, Integer cilindrada, String cor, Combustivel tipoCombustivel, LocalDate anoFabricacao,
			LocalDate anoModelo, LocalDate dataAquisicao, PessoaJuridica locadoraBase, Double nivelTanque, String tipoFreios,
			LocalDate ultimaDataRevisao, List<Acessorios> acessorios, SituacaoOperacionalVeiculo situacaoOperacional,
			String observacaoVeiculo, PlanoLocacao planoLocacao) {
		super();
		this.renavam = renavam.replaceAll(RETIRAPONTOS, "");
		this.chassis = chassis.replaceAll(RETIRAPONTOS, "");
		this.numeroMotor = numeroMotor.replaceAll(RETIRAPONTOS, "");
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
		this.cor = cor;
		this.tipoCombustivel = tipoCombustivel;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.dataAquisicao = dataAquisicao;
		this.locadoraBase = locadoraBase;
		this.nivelTanque = nivelTanque;
		this.tipoFreios = tipoFreios;
		this.ultimaDataRevisao = ultimaDataRevisao;
		this.acessorios = acessorios;
		this.situacaoOperacional = situacaoOperacional;
		this.observacaoVeiculo = observacaoVeiculo;
		this.planoLocacao = planoLocacao;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getRenavam()
	 */
	@Override
	public String getRenavam() {
		return renavam;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setRenavam(java.lang.String)
	 */
	@Override
	public void setRenavam(String renavam) {
		this.renavam = renavam.replaceAll(RETIRAPONTOS, "");
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getChassis()
	 */
	@Override
	public String getChassis() {
		return chassis;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setChassis(java.lang.String)
	 */
	@Override
	public void setChassis(String chassis) {
		this.chassis = chassis.replaceAll(RETIRAPONTOS, "");
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getNumeroMotor()
	 */
	@Override
	public String getNumeroMotor() {
		return numeroMotor;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setNumeroMotor(java.lang.String)
	 */
	@Override
	public void setNumeroMotor(String numeroMotor) {
		this.numeroMotor = numeroMotor.replaceAll(RETIRAPONTOS, "");
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getPlaca()
	 */
	@Override
	public String getPlaca() {
		return placa;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setPlaca(java.lang.String)
	 */
	@Override
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getMarca()
	 */
	@Override
	public String getMarca() {
		return marca;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setMarca(java.lang.String)
	 */
	@Override
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getModelo()
	 */
	@Override
	public String getModelo() {
		return modelo;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setModelo(java.lang.String)
	 */
	@Override
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getPotencia()
	 */
	@Override
	public Integer getPotencia() {
		return potencia;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setPotencia(java.lang.Integer)
	 */
	@Override
	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getCilindrada()
	 */
	@Override
	public Integer getCilindrada() {
		return cilindrada;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setCilindrada(java.lang.Integer)
	 */
	@Override
	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getCor()
	 */
	@Override
	public String getCor() {
		return cor;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setCor(java.lang.String)
	 */
	@Override
	public void setCor(String cor) {
		this.cor = cor;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getTipoCombustivel()
	 */
	@Override
	public Combustivel getTipoCombustivel() {
		return tipoCombustivel;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setTipoCombustivel(br.com.pimentel.test.model.enums.Combustivel)
	 */
	@Override
	public void setTipoCombustivel(Combustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getAnoFabricacao()
	 */
	@Override
	public LocalDate getAnoFabricacao() {
		return anoFabricacao;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setAnoFabricacao(java.util.Date)
	 */
	@Override
	public void setAnoFabricacao(LocalDate anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getAnoModelo()
	 */
	@Override
	public LocalDate getAnoModelo() {
		return anoModelo;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setAnoModelo(java.util.Date)
	 */
	@Override
	public void setAnoModelo(LocalDate anoModelo) {
		this.anoModelo = anoModelo;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getDataAquisicao()
	 */
	@Override
	public LocalDate getDataAquisicao() {
		return dataAquisicao;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setDataAquisicao(java.util.Date)
	 */
	@Override
	public void setDataAquisicao(LocalDate dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getAgenciaBase()
	 */
	@Override
	public PessoaJuridica getLocadoraBase() {
		return locadoraBase;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setAgenciaBase(java.lang.String)
	 */
	@Override
	public void setLocadoraBase(PessoaJuridica locadoraBase) {
		this.locadoraBase = locadoraBase;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getNivelTanque()
	 */
	@Override
	public Double getNivelTanque() {
		return nivelTanque;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setNivelTanque(java.lang.Double)
	 */
	@Override
	public void setNivelTanque(Double nivelTanque) {
		this.nivelTanque = nivelTanque;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getTipoFreios()
	 */
	@Override
	public String getTipoFreios() {
		return tipoFreios;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setTipoFreios(java.lang.String)
	 */
	@Override
	public void setTipoFreios(String tipoFreios) {
		this.tipoFreios = tipoFreios;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getUltimaRevisao()
	 */
	@Override
	public LocalDate getUltimaRevisao() {
		return ultimaDataRevisao;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setUltimaRevisao(java.util.Date)
	 */
	@Override
	public void setUltimaRevisao(LocalDate ultimaRevisao) {
		this.ultimaDataRevisao = ultimaRevisao;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getAcessorios()
	 */
	@Override
	public List<Acessorios> getAcessorios() {
		return acessorios;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setAcessorios(java.util.List)
	 */
	@Override
	public void setAcessorios(List<Acessorios> acessorios) {
		this.acessorios = acessorios;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getStatus()
	 */
	@Override
	public SituacaoOperacionalVeiculo getSituacaoOperacional() {
		return situacaoOperacional;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setStatus(br.com.pimentel.test.model.enums.SituacaoOperacionalVeiculo)
	 */
	@Override
	public void setSituacaoOperacional(SituacaoOperacionalVeiculo situacaoOperacional) {
		this.situacaoOperacional = situacaoOperacional;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#getObservacoesVeiculo()
	 */
	@Override
	public String getObservacoesVeiculo() {
		return observacaoVeiculo;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.test.model.veiculos.Veiculo#setObservacoesVeiculo(java.lang.String)
	 */
	@Override
	public void setObservacoesVeiculo(String observacoesVeiculo) {
		this.observacaoVeiculo = observacoesVeiculo;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VeiculoImpl [renavam=" + renavam + ", chassis=" + chassis + ", numeroMotor=" + numeroMotor + ", placa="
				+ placa + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", cilindrada="
				+ cilindrada + ", cor=" + cor + ", tipoCombustivel=" + tipoCombustivel + ", anoFabricacao="
				+ anoFabricacao + ", anoModelo=" + anoModelo + ", dataAquisicao=" + dataAquisicao + ", locadoraBase="
				+ locadoraBase + ", nivelTanque=" + nivelTanque + ", tipoFreios=" + tipoFreios + ", ultimaDataRevisao="
				+ ultimaDataRevisao + ", acessorios=" + acessorios + ", situacaoOperacional=" + situacaoOperacional
				+ ", observacaoVeiculo=" + observacaoVeiculo + "]";
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.veiculos.VeiculoIF#planoLocacao()
	 */
	@Override
	public PlanoLocacao planoLocacao() {
		return planoLocacao;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.veiculos.VeiculoIF#planoLocacao(br.com.pimentel.model.locacao.PlanoLocacao)
	 */
	@Override
	public void planoLocacao(PlanoLocacao planoLocacao) {
		this.planoLocacao = planoLocacao;
	}

}
