package br.com.pimentel.util;

import java.time.LocalDate;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Rodrigo Pimentel
 * @NocaCorp @2018
 *
 * Classe que gera um codigo 
 */
public class GeradorCodigo {
	
	private static Logger logger = LoggerFactory.getLogger(GeradorCodigo.class);
	
	private static final String PREFIXOFUNCIONARIO = "1";
	private static final String PREFIXOCLIENTEPF = "5";
	private static final String PREFIXOCLIENTEPJ = "6";
	
	private GeradorCodigo() {
		super();
	}

	/**
	 * Criar um codigo para o cliente do tipo pessoa fisica de forma unica
	 * @param cpf Recebe o CPF do cliente
	 * @param dataAtual Recebe a data de cadastro do cliente
	 * @return Retorna um codigo unico
	 */
	public static String codigoClientePF(String cpf, LocalDate dataAtual) {		
		logger.info("GERANDO CODIGO DE CLIENTE PESSOA FISICA");
		logger.info("====== Gerando codigo de cliente com ||CPF: {} e data: {}||", cpf, dataAtual);
		char[] indiceCpf = cpf.toCharArray();		
		int a = 100 + new Random().nextInt(899);
		logger.info("====== Gerado o numero aleatorio: {}", a);
		
		String codigo = PREFIXOCLIENTEPF+indiceCpf[0]+dataAtual.getYear()+indiceCpf[4]+a+indiceCpf[8];
		logger.info("====== Gerado o codigo de cliente: {}", codigo);
		return codigo;
	}
	
	/**
	 * Criar um codigo para o cliente do tipo pessoa juridica de forma unica
	 * @param cnpj Recebe o CNPJ do cliente
	 * @param dataAtual Recebe a data de cadastro do cliente
	 * @return Retorna um codigo unico
	 */
	public static String codigoClientePJ(String cnpj, LocalDate dataAtual) {		
		logger.info("GERANDO CODIGO DE CLIENTE PESSOA JURIDICA");
		logger.info("====== Gerando codigo de cliente com ||CNPJ: {} e data: {}||", cnpj, dataAtual);
		char[] indiceCnpj = cnpj.toCharArray();		
		int a = 100 + new Random().nextInt(899);
		logger.info("====== Gerado o numero aleatorio: {}", a);
		
		String codigo = PREFIXOCLIENTEPJ+indiceCnpj[0]+dataAtual.getYear()+indiceCnpj[3]+a+indiceCnpj[7];
		logger.info("====== Gerado o codigo de cliente: {}", codigo);
		return codigo;
	}
	
	/**
	 * Criar uma matricula de forma unica
	 * @param cpf Recebe o CPF do funcionario
	 * @param dataAtual Recebe a data de cadastro do funcionario
	 * @return Retorna uma matricula unica
	 */
	public static String matriculaFuncionario(String cpf, LocalDate dataAtual) {	
		logger.info("GERANDO MATRICULA DE FUNCIONARIO");
		logger.info("====== Gerando matricula de funcionario com ||CPF: {} e data: {}||", cpf, dataAtual);
		char[] indiceCpf = cpf.toCharArray();		
		int a = 100 + new Random().nextInt(899);
		logger.info("====== Gerado o numero aleatorio: {}", a);
		
		String matricula = PREFIXOFUNCIONARIO+indiceCpf[0]+dataAtual.getYear()+indiceCpf[4]+a+indiceCpf[8];
		logger.info("====== Gerado a matricula de funcionario: {}", matricula);
		return matricula;
	}
	
	
}