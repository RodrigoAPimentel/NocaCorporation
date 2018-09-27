package br.com.pimentel.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.pimentel.model.documentos.DocumentoPF;
import br.com.pimentel.model.documentos.DocumentoPJ;
import br.com.pimentel.model.enderecos.EnderecoImpl;
import br.com.pimentel.model.enums.Acessorios;
import br.com.pimentel.model.enums.CategoriaHabilitacao;
import br.com.pimentel.model.enums.Combustivel;
import br.com.pimentel.model.enums.EstadoCivil;
import br.com.pimentel.model.enums.GrauInstrucao;
import br.com.pimentel.model.enums.SituacaoOperacionalVeiculo;
import br.com.pimentel.model.locacao.PlanoLocacao;
import br.com.pimentel.model.pessoas.pessoafisica.PessoaFisica;
import br.com.pimentel.model.pessoas.pessoafisica.clientes.ClientePF;
import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.AgenteLocacao;
import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.AssistenteAdministrativo;
import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.Gerente;
import br.com.pimentel.model.pessoas.pessoafisica.funcionarios.Mecanico;
import br.com.pimentel.model.pessoas.pessoajuridica.ClientePJ;
import br.com.pimentel.model.pessoas.pessoajuridica.empresas.LocadoraVeiculo;
import br.com.pimentel.model.veiculos.tipos.Carro;
import br.com.pimentel.model.veiculos.tipos.Motocicleta;
import br.com.pimentel.repositories.locacao.PlanoLocacaoRepository;
import br.com.pimentel.repositories.pessoas.pessoafisica.PessoaFisicaRepository;
import br.com.pimentel.repositories.pessoas.pessoafisica.clientes.ClientePFRepository;
import br.com.pimentel.repositories.pessoas.pessoafisica.funcionarios.AgenteLocacaoRepository;
import br.com.pimentel.repositories.pessoas.pessoafisica.funcionarios.AssistenteAdministrativoRepository;
import br.com.pimentel.repositories.pessoas.pessoafisica.funcionarios.GerenteRepository;
import br.com.pimentel.repositories.pessoas.pessoafisica.funcionarios.MecanicoRepository;
import br.com.pimentel.repositories.pessoas.pessoajuridica.PessoaJuridicaRepository;
import br.com.pimentel.repositories.pessoas.pessoajuridica.clientes.ClientePJRepository;
import br.com.pimentel.repositories.pessoas.pessoajuridica.empresas.LocadoraVeiculoRepository;
import br.com.pimentel.repositories.veiculos.VeiculoRepository;
import br.com.pimentel.repositories.veiculos.tipos.CarroRepository;
import br.com.pimentel.repositories.veiculos.tipos.MotocicletaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NocaCorporationApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(NocaCorporationApplicationTests.class);

	private static Gerente funcionarioGerente;
	@Autowired private GerenteRepository gerenteRepository;

	private static Mecanico funcionarioMecanico;
	@Autowired private MecanicoRepository mecanicoRepository;	

	private static AgenteLocacao funcionarioAgenteLocacao;
	@Autowired private AgenteLocacaoRepository agenteLocacaoRepository;

	private static AssistenteAdministrativo funcionarioAssistenteAdministrativo;
	@Autowired private AssistenteAdministrativoRepository assistenteAdministrativoRepository;

	private static PessoaFisica propietario, pessoaContato;	
	@Autowired private PessoaFisicaRepository pessoaFisicaRepository2;	

	private static DocumentoPF documentoPessoaFisica;
	private static DocumentoPJ documentoPessoaJuridica;
	private static EnderecoImpl endereco;

	private static LocadoraVeiculo locadoraVeiculo;
	@Autowired private LocadoraVeiculoRepository locadoraVeiculoRepository;
	@Autowired private PessoaJuridicaRepository pessoaJuridicaRepository2;

	private static Carro carro;
	@Autowired private CarroRepository carroRepository;

	private static Motocicleta moto;
	@Autowired private MotocicletaRepository motocicletaRepository;

	@Autowired private VeiculoRepository veiculoRepository2;

	private static ClientePF clientePF;
	@Autowired private ClientePFRepository clientePFRepository;

	private static ClientePJ clientePJ;
	@Autowired private ClientePJRepository clientePJRepository;

	private static PlanoLocacao planoLocacao;
	@Autowired private PlanoLocacaoRepository planoLocacaoRepository;

	@Test
	public void contextLoads() {
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		logger.info("@@EXECUTANDO O METODO ||setUpBeforeClass||");

		documentoPessoaFisica = new DocumentoPF("21323", "SSP/PB", false, "1234567890", "Campina Grande-PB",
				"10", "20", "3475679823", "90488639", "213409", "0938472", CategoriaHabilitacao.AB, "todos originais");	

		documentoPessoaJuridica = new DocumentoPJ("9832472", "349928", "Obs doc PJ");

		endereco = new EnderecoImpl("58000-000", "Rua da Laje", 10, "Caixa D'Agua", "Campina Grande", "Paraiba",
				"Bloco GH, Apt 567 ", "Brasil", "(83) 99999-0000", "(83) 99999-0000", "(83) 99999-0000", "asdasd@sdf.sdf", 
				"afdafa@afa", "987676", "sdfsdfsdf.com.br", "Endereço teste");

		funcionarioGerente = new Gerente("000.000.000-00", "Javali", "Campina Grande-PB", "Brasileiro", LocalDate.of(1986, Month.AUGUST, 16), 
				endereco, documentoPessoaFisica, "Sebastião Porto", "Lourdinha", EstadoCivil.CASADO, GrauInstrucao.DOUTORADOCOMPLETO, 
				true, "observacoes", 9000.0, LocalDate.of(2012, Month.MAY, 25), 5.0);		
		funcionarioMecanico = new Mecanico("111.111.111-11", "Zebra", "Campina Grande-PB", "Brasileiro", LocalDate.of(1986, Month.AUGUST, 16), 
				endereco, documentoPessoaFisica, "Sebastião Porto", "Lourdinha", EstadoCivil.CASADO, GrauInstrucao.DOUTORADOCOMPLETO, true, 
				"Observação", 900.0, LocalDate.of(1986, Month.AUGUST, 16)); 
		funcionarioAssistenteAdministrativo = new AssistenteAdministrativo("222.222.222-22", "Hipopotamo", "Campina Grande-PB", "Brasileiro", 
				LocalDate.of(1986, Month.AUGUST, 16), endereco, documentoPessoaFisica, "Sebastião Porto", "Lourdinha", EstadoCivil.CASADO, 
				GrauInstrucao.DOUTORADOCOMPLETO, true, "Observação", 900.0, LocalDate.of(1986, Month.AUGUST, 16));
		funcionarioAgenteLocacao = new AgenteLocacao("333.333.333-33", "Leão", "Campina Grande-PB", "Brasileiro", LocalDate.of(1986, Month.AUGUST, 16), 
				endereco, documentoPessoaFisica, "Sebastião Porto", "Lourdinha", EstadoCivil.CASADO, GrauInstrucao.DOUTORADOCOMPLETO, true, 
				"Observação", 900.0, LocalDate.of(1986, Month.AUGUST, 16), 5.0);

		propietario = new PessoaFisica("444.444.444-44", "Javali", "Campina Grande-PB", "Brasileiro", LocalDate.of(1986, Month.AUGUST, 16), 
				endereco, documentoPessoaFisica, "Sebastião Porto", "Lourdinha", EstadoCivil.CASADO, GrauInstrucao.DOUTORADOCOMPLETO, 
				true, "observacoes");
		pessoaContato = new PessoaFisica("555.555.555-55", "Javali", "Campina Grande-PB", "Brasileiro", LocalDate.of(1986, Month.AUGUST, 16), 
				endereco, documentoPessoaFisica, "Sebastião Porto", "Lourdinha", EstadoCivil.CASADO, GrauInstrucao.DOUTORADOCOMPLETO, 
				true, "observacoes");		
		locadoraVeiculo = new LocadoraVeiculo("11.111.111/1111-11", "Noca Corporation-ME", "Locadora Noca", endereco, documentoPessoaJuridica, 
				LocalDate.of(2000, Month.APRIL, 1), 30, propietario, pessoaContato, true, "Observacao PJ", 150);

		List<Acessorios> list = new ArrayList<>();
		list.add(Acessorios.ARCONDICIONADO);
		list.add(Acessorios.CAMERARE);
		carro = new Carro("12345", "02191", "9328475212", "ABC-1234", "Ford", "KA", 75, 1400, "Preto", Combustivel.ALCOOL, LocalDate.of(2000, Month.APRIL, 1), 
				LocalDate.of(2000, Month.APRIL, 1), LocalDate.of(2000, Month.APRIL, 1), locadoraVeiculo, 35.0, "ABS", LocalDate.of(2000, Month.APRIL, 1), list, 
				SituacaoOperacionalVeiculo.DISPONIVEL, "observacao veiculo", null, 4, 5);
		moto = new Motocicleta("67890", "09854", "9328475212", "ABC-1234", "Ford", "KA", 75, 1400, "Preto", Combustivel.ALCOOL, LocalDate.of(2000, Month.APRIL, 1), 
				LocalDate.of(2000, Month.APRIL, 1), LocalDate.of(2000, Month.APRIL, 1), locadoraVeiculo, 35.0, "ABS", LocalDate.of(2000, Month.APRIL, 1), list, 
				SituacaoOperacionalVeiculo.DISPONIVEL, "observacao veiculo", null);	

		clientePF = new ClientePF("666.666.666-66", "Mosca Morta", "Campina Grande-PB", "Brasileiro", LocalDate.of(1986, Month.AUGUST, 16), 
				endereco, documentoPessoaFisica, "Sebastião Porto", "Lourdinha", EstadoCivil.CASADO, GrauInstrucao.DOUTORADOCOMPLETO, 
				true, "observacoes", 3, 0.0, LocalDate.of(2018, Month.AUGUST, 2));

		clientePJ = new ClientePJ("22.222.222/2222-22", "Noquinha Corporation-ME", "Locadora Noca", null, null, LocalDate.of(2000, Month.APRIL, 1), 30, null, 
				null, true, "Observacao PJ", 10, 0.0, LocalDate.of(2018, Month.AUGUST, 2));

		planoLocacao = new PlanoLocacao("Plano de Locação A - Carro", Arrays.asList(carro), 120.0, "obs plano locacao");	
	}

	@Test // PARA USO COM BD MYSQL, NÃO HÁ NECESSIDADE DE UTILIZAR COM BD H2
	public void apagaDadosBD() {
		logger.info("@@EXECUTANDO O METODO ||apagaDadosBD||");

		carroRepository.deleteAll();
		motocicletaRepository.deleteAll();
		clientePFRepository.deleteAll();
		clientePJRepository.deleteAll();
		locadoraVeiculoRepository.deleteAll();
		gerenteRepository.deleteAll();
		mecanicoRepository.deleteAll();
		assistenteAdministrativoRepository.deleteAll();
		agenteLocacaoRepository.deleteAll();
	}

	@Test
	public void testAIncluirFuncionario() {	
		logger.info("@@EXECUTANDO O METODO ||testAIncluirFuncionario||");

		gerenteRepository.save(funcionarioGerente);
		mecanicoRepository.save(funcionarioMecanico);
		assistenteAdministrativoRepository.save(funcionarioAssistenteAdministrativo);
		agenteLocacaoRepository.save(funcionarioAgenteLocacao);
	}

	@Test
	public void testBPesquisaFuncionario() {
		logger.info("@@EXECUTANDO O METODO ||testBPesquisaFuncionario||");

		assertEquals(4, pessoaFisicaRepository2.findAll().size());

		assertEquals("Javali", pessoaFisicaRepository2.findById("00000000000").get().getNome());
		assertEquals("Zebra", pessoaFisicaRepository2.findById("11111111111").get().getNome());
		assertEquals("Hipopotamo", pessoaFisicaRepository2.findById("22222222222").get().getNome());
		assertEquals("Leão", pessoaFisicaRepository2.findById("33333333333").get().getNome());		
	}

	@Test
	public void testCRemoveFuncionario() {
		logger.info("@@EXECUTANDO O METODO ||testCRemoveFuncionario||");

		gerenteRepository.deleteById("00000000000");

		assertEquals(3, pessoaFisicaRepository2.findAll().size());
	}

	@Test
	public void testDAtualizaFuncionario() {
		logger.info("@@EXECUTANDO O METODO ||testDAtualizaFuncionario||");

		funcionarioAgenteLocacao.setNome("Leão Africano Feroz");
		agenteLocacaoRepository.save(funcionarioAgenteLocacao);

		assertEquals("Leão Africano Feroz", agenteLocacaoRepository.findById("33333333333").get().getNome());
	}

	@Test
	public void testEIncluirEmpresa() {	
		logger.info("@@EXECUTANDO O METODO ||testEIncluirEmpresa||");

		locadoraVeiculoRepository.save(locadoraVeiculo);
	}

	@Test
	public void testFPesquisaEmpresa() {
		logger.info("@@EXECUTANDO O METODO ||testFPesquisaEmpresa||");

		assertEquals(1, pessoaJuridicaRepository2.findAll().size());

		assertEquals("Locadora Noca", locadoraVeiculoRepository.findById("11111111111111").get().getNomeFantasia());
	}

	@Test
	public void testGRemoveEmpresa() {
		logger.info("@@EXECUTANDO O METODO ||testGRemoveEmpresa||");

		locadoraVeiculoRepository.deleteById("11111111111111");

		assertEquals(0, pessoaJuridicaRepository2.findAll().size());
	}

	@Test
	public void testHAtualizaEmpresa() {
		logger.info("@@EXECUTANDO O METODO ||testHAtualizaEmpresa||");

		locadoraVeiculo.setNomeFantasia("Jabuti Locadora de Veiculo Lentos");
		locadoraVeiculoRepository.save(locadoraVeiculo);

		assertEquals("Jabuti Locadora de Veiculo Lentos", locadoraVeiculoRepository.findById("11111111111111").get().getNomeFantasia());
	}

	@Test
	public void testIIncluiVeiculo() {
		logger.info("@@EXECUTANDO O METODO ||testIIncluiVeiculo||");

		carroRepository.save(carro);
		motocicletaRepository.save(moto);
	}

	@Test
	public void testJPesquisaVeiculo() {
		logger.info("@@EXECUTANDO O METODO ||testJPesquisaVeiculo||");

		assertEquals(2, veiculoRepository2.findAll().size());

		assertEquals("02191", carroRepository.findById("02191").get().getChassis());
	}

	@Test
	public void testLRemoveVeiculo() {
		logger.info("@@EXECUTANDO O METODO ||testLRemoveVeiculo||");

		motocicletaRepository.delete(moto);

		//Garantir que não deletou a locadora
		assertEquals("Jabuti Locadora de Veiculo Lentos", pessoaJuridicaRepository2.findById("11111111111111").get().getNomeFantasia());

		assertEquals(1, veiculoRepository2.findAll().size());
	}

	@Test
	public void testMAtualizaVeiculo() {
		logger.info("@@EXECUTANDO O METODO ||testMAtualizaVeiculo||");

		carro.setCilindrada(2000);;
		carroRepository.save(carro);

		assertEquals(2000, carroRepository.findById("02191").get().getCilindrada(),0.0);
	}

	@Test
	public void testNIncluiClientePF() {
		logger.info("@@EXECUTANDO O METODO ||testNIncluiClientePF||");

		clientePFRepository.save(clientePF);
	}

	@Test
	public void testOPesquisaClientePF() {
		logger.info("@@EXECUTANDO O METODO ||testOPesquisaClientePF||");

		assertEquals("Mosca Morta", clientePFRepository.findById("66666666666").get().getNome());
	}

	@Test
	public void testPAtualizaClientePF() {
		logger.info("@@EXECUTANDO O METODO ||testPAtualizaClientePF||");

		clientePF.setDebito(9000.0);

		clientePFRepository.save(clientePF);

		assertEquals(9000.0, clientePFRepository.findById("66666666666").get().getDebito(),0.0);
	}

	@Test
	public void testQRemoveClientePF() {
		logger.info("@@EXECUTANDO O METODO ||testQRemoveClientePF||");

		clientePFRepository.delete(clientePF);

		assertEquals(0, clientePFRepository.findAll().size());
	}

	@Test
	public void testRIncluiClientePJ() {
		logger.info("@@EXECUTANDO O METODO ||testRIncluiClientePJ||");

		clientePJRepository.save(clientePJ);
	}

	@Test
	public void testSPesquisaClientePJ() {
		logger.info("@@EXECUTANDO O METODO ||testSPesquisaClientePJ||");

		assertEquals("Noquinha Corporation-ME", clientePJRepository.findById("22222222222222").get().getRazaoSocial());
	}

	@Test
	public void testTAtualizaClientePJ() {
		logger.info("@@EXECUTANDO O METODO ||testTAtualizaClientePJ||");

		clientePJ.setDebito(9000.0);

		clientePJRepository.save(clientePJ);

		assertEquals(9000.0, clientePJRepository.findById("22222222222222").get().getDebito(),0.0);
	}

	@Test
	public void testURemoveClientePJ() {
		logger.info("@@EXECUTANDO O METODO ||testURemoveClientePJ||");

		clientePJRepository.delete(clientePJ);

		assertEquals(0, clientePJRepository.findAll().size());
	}

	@Test
	public void testVIncluiPlanoLocacao() {
		logger.info("@@EXECUTANDO O METODO ||testVIncluiPlanoLocacao||");

		planoLocacaoRepository.save(planoLocacao);
	}

	@Test
	public void testXPesquisaPlanoLocacao() {
		logger.info("@@EXECUTANDO O METODO ||testXPesquisaPlanoLocacao||");

		assertEquals("Plano de Locação A - Carro", planoLocacaoRepository.findByNomePlano("Plano de Locação A - Carro").getNomePlano());
	}

	@Test
	public void testYAtualizaPlanoLocacao() {
		logger.info("@@EXECUTANDO O METODO ||testYAtualizaPlanoLocacao||");

		planoLocacao.setPreco(190.0);

		planoLocacaoRepository.save(planoLocacao);

		assertEquals(190.0, planoLocacaoRepository.findByNomePlano("Plano de Locação A - Carro").getPreco(),0.0);
	}

	@Test
	public void testZRemovePlanoLocacao() {
		logger.info("@@EXECUTANDO O METODO ||testZRemovePlanoLocacao||");

		planoLocacaoRepository.delete(planoLocacao);		

		//Garantir que não deletou nenhum dos veiculos que estavam no plano
		assertEquals("12345", veiculoRepository2.findById("02191").get().getRenavam());

		assertEquals(0, planoLocacaoRepository.findAll().size());
	}

}
