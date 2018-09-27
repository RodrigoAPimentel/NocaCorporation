package br.com.pimentel.model.pessoas.pessoafisica.funcionarios;

import java.time.LocalDate;

import br.com.pimentel.model.enums.Cargo;

/**
 * @author Rodrigo Pimentel
 * @LocadoraNocaCorporation @2018
 *
 * Interface para abstratir as funções de um Funcionario
 */
public interface Funcionario {
	
	/**
	 * @return Retorna a matricula do funcionario
	 */
	public String getMatricula();

	/**
	 * @return Retorna o cargo do funcionario
	 */
	public Cargo getCargo();

	/**
	 * @return Retorna o salario do funcionario
	 */
	public Double getSalario();

	/**
	 * @param salario Altera o salario do funcionario
	 */
	public void setSalario(Double salario);

	/**
	 * @return Retorna a data de admissão do funcionario
	 */
	public LocalDate getDataAdmissao();

	/**
	 * @param dataAdmisao Altera a data de admissão do funcionario
	 */
	public void setDataAdmisao(LocalDate dataAdmisao);

}
