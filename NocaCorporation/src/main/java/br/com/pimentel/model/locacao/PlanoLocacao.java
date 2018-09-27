/**
 * 
 */
package br.com.pimentel.model.locacao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.pimentel.model.veiculos.Veiculo;

/**
 * @author Rodrigo Pimentel
 * @LocadoraNocaCorporation @2018
 *
 * Classe que abstrai um Plano de Locação
 */
@Entity
public class PlanoLocacao implements PlanoLocacaoIF, Serializable {

	private static final long serialVersionUID = -7143160134547461616L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO) private Integer idPlanoLocacao;
	private String nomePlano;
	@OneToMany(mappedBy="planoLocacao", cascade=CascadeType.MERGE) private List<Veiculo> veiculos;
	private Double preco;
	private String observacao;

	public PlanoLocacao() {
		super();
	}

	/**
	 * Controi um Plano de Locação
	 * 
	 * @param idPlanoLocacao ID do Plano de Locação
	 * @param nomePlano Nome do Plano de Locação
	 * @param veiculos Veiculos que estão no Plano de Locação
	 * @param preco Preço do Plano de Locação
	 * @param observacao Observação do Plano de Locação
	 */
	public PlanoLocacao(String nomePlano, List<Veiculo> veiculos, Double preco,
			String observacao) {
		super();
		this.nomePlano = nomePlano;
		this.veiculos = veiculos;
		this.preco = preco;
		this.observacao = observacao;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.locacao.PlanoLocacaoIF#getIdPlanoLocacao()
	 */
	@Override
	public Integer getIdPlanoLocacao() {
		return idPlanoLocacao;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.locacao.PlanoLocacaoIF#getNomePlano()
	 */
	@Override
	public String getNomePlano() {
		return nomePlano;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.locacao.PlanoLocacaoIF#setNomePlano(java.lang.String)
	 */
	@Override
	public void setNomePlano(String nomePlano) {
		this.nomePlano = nomePlano;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.locacao.PlanoLocacaoIF#getVeiculos()
	 */
	@Override
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.locacao.PlanoLocacaoIF#setVeiculos(java.util.List)
	 */
	@Override
	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.locacao.PlanoLocacaoIF#getPreco()
	 */
	@Override
	public Double getPreco() {
		return preco;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.locacao.PlanoLocacaoIF#setPreco(java.lang.Double)
	 */
	@Override
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.locacao.PlanoLocacaoIF#getObservacao()
	 */
	@Override
	public String getObservacao() {
		return observacao;
	}

	/* (non-Javadoc)
	 * @see br.com.pimentel.model.locacao.PlanoLocacaoIF#setObservacao(java.lang.String)
	 */
	@Override
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPlanoLocacao == null) ? 0 : idPlanoLocacao.hashCode());
		result = prime * result + ((nomePlano == null) ? 0 : nomePlano.hashCode());
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
		if (!(obj instanceof PlanoLocacao)) {
			return false;
		}
		PlanoLocacao other = (PlanoLocacao) obj;
		if (idPlanoLocacao == null) {
			if (other.idPlanoLocacao != null) {
				return false;
			}
		} else if (!idPlanoLocacao.equals(other.idPlanoLocacao)) {
			return false;
		}
		if (nomePlano == null) {
			if (other.nomePlano != null) {
				return false;
			}
		} else if (!nomePlano.equals(other.nomePlano)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PlanoLocacao [idPlanoLocacao=" + idPlanoLocacao + ", nomePlano=" + nomePlano + ", veiculos=" + veiculos
				+ ", preco=" + preco + ", observacao=" + observacao + "]";
	}

}
