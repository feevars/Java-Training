package br.ce.wcaquino.servicos;


import static br.ce.wcaquino.builders.FilmeBuilder.umFilme;
import static br.ce.wcaquino.builders.FilmeBuilder.umFilmeSemEstoque;
import static br.ce.wcaquino.builders.UsuarioBuilder.umUsuario;
import static br.ce.wcaquino.matchers.MatchersProprios.caiEm;
import static br.ce.wcaquino.matchers.MatchersProprios.caiNumaSegunda;
import static br.ce.wcaquino.matchers.MatchersProprios.ehHoje;
import static br.ce.wcaquino.matchers.MatchersProprios.ehHojeComDiferencaDias;
import static br.ce.wcaquino.utils.DataUtils.isMesmaData;
import static br.ce.wcaquino.utils.DataUtils.obterDataComDiferencaDias;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import br.ce.wcaquino.builders.FilmeBuilder;
import br.ce.wcaquino.builders.UsuarioBuilder;
import br.ce.wcaquino.daos.LocacaoDAO;
import br.ce.wcaquino.daos.LocacaoDAOFake;
import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.exceptions.FilmeSemEstoqueException;
import br.ce.wcaquino.exceptions.LocadoraException;
import br.ce.wcaquino.matchers.DiaSemanaMatcher;
import br.ce.wcaquino.matchers.MatchersProprios;
import br.ce.wcaquino.utils.DataUtils;
import buildermaster.BuilderMaster;

@RunWith(PowerMockRunner.class)
@PrepareForTest(LocacaoService.class)
public class LocacaoServiceTest {
	
	private LocacaoService service;
	
	//podemos verificar uma assertiva por teste para identificar melhor o erro ou podemos usar o 
	//error collector, que exibe todas as mensagens de erro
	
	@Rule
	public ErrorCollector error = new ErrorCollector();
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Before
	public void setup() {
		service = new LocacaoService();
		LocacaoDAO dao = new LocacaoDAOFake();
		service.setLocacaoDAO(dao);
		
	}
	
//	@After
//	public void tearDown() {
//	} 
	
//	@BeforeClass
//	public static void BefClassSetup() {
//		System.out.println("Before class");
//	}
//	
//	@AfterClass
//	public static void AftClassSetup() {
//		System.out.println("After class");
//	}
// vari�vel est�tica mant�m testes dependentes dos anteriores
	
	
	@Test
	public void deveAlugarFilme()  throws Exception {
		Assume.assumeFalse(DataUtils.verificarDiaSemana(new Date(), Calendar.SATURDAY));
		
		//cen�rio
		Usuario usuario = umUsuario().agora();
		List<Filme> filmes = Arrays.asList(umFilme().comValor(5.0).agora());
		
		//a��o
		Locacao locacao = service.alugarFilme(usuario, filmes);
		
		//verifica��o
		//System.out.println(locacao.getValor()== 5.0);
					//Assert.assertEquals(4.0, locacao.getValor(), 0.01);
					//assertThat(locacao.getValor(), is(equalTo(5.0)));
		error.checkThat(locacao.getValor(), is(equalTo(5.0)));
		//System.out.println(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
					//assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
					//assertThat(isMesmaData(locacao.getDataLocacao(), new Date()), is(true));
		error.checkThat(isMesmaData(locacao.getDataLocacao(), new Date()), is(true));
		
		error.checkThat(locacao.getDataLocacao(), ehHoje());
		//System.out.println(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(2)));
					//assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
					//assertThat(isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)), is(true));
		error.checkThat(isMesmaData(locacao.getDataRetorno(), obterDataComDiferencaDias(1)), is(true));
		error.checkThat(locacao.getDataRetorno(), ehHojeComDiferencaDias(1));
	}
	
	
	
	//forma elegante - exce��o � lan�ada apenas por esse motivo
	@Test(expected=FilmeSemEstoqueException.class)
	public void naoDeveAlugarFilmesSemEstoque() throws Exception {
		//cen�rio
				Usuario usuario = new Usuario("User 1");
				List<Filme> filmes = Arrays.asList(umFilmeSemEstoque().agora());
				
		//a��o
				service.alugarFilme(usuario, filmes);
	}
	
	
	//forma robusta - mais poder sobre a execu��o, segura a exce��o e o fluxo continua - melhor entre as 3
	@Test
	public void naoDeveAlugarFilmesSemUsuario() throws FilmeSemEstoqueException {
		//cenario
		List<Filme> filmes = Arrays.asList(umFilme().agora());
		
		//acao
			try {
				service.alugarFilme(null, filmes);
				Assert.fail();
			} catch (LocadoraException e) {
				Assert.assertThat(e.getMessage(), is("Empty user"));
			}
	}
	
	
	
	//forma nova - nao faz nada depois da exce��o
	@Test
	public void naoDeveAlugarFilmesSemFilme() throws FilmeSemEstoqueException, LocadoraException {
		//cen�rio
		Usuario usuario = new Usuario("User 1");
		
		
		exception.expect(LocadoraException.class);
		exception.expectMessage("Empty film");
		
		//acao
		service.alugarFilme(usuario, null);

		
	}
	
//	@Test
//	public void testLocacao_filmesSemEstoque2() {
//		//cen�rio
//				LocacaoService service = new LocacaoService();
//				Usuario usuario = new Usuario("User 1");
//				Filme filme = new Filme("Gato Miu", 0, 5.0);
//				
//		//a��o
//				try {
//					service.alugarFilme(usuario, filme);
//					//Assert.fail("Deveria ter lan�ado uma exce��o");
//				} catch (Exception e) {
//					assertThat(e.getMessage(), is("Filme sem estoque"));
//				}
//	}
	
//	@Test
//	public void testLocacao_filmesSemEstoque3() throws Exception {
//		//cen�rio
//				LocacaoService service = new LocacaoService();
//				Usuario usuario = new Usuario("User 1");
//				Filme filme = new Filme("Gato Miu", 0, 5.0);
//				
//				exception.expect(FilmeSemEstoqueException.class);
//				
//		//a��o
//				service.alugarFilme(usuario, filme);
//	}
	
	@Test
	public void deveDevolverNaSegundaAoAlugarNoSabado() throws Exception {
//		Assume.assumeTrue(DataUtils.verificarDiaSemana(new Date(), Calendar.SATURDAY));
		
		
		//cenario
		Usuario usuario = new Usuario("User1");
		List<Filme> filmes = Arrays.asList(umFilme().agora());
		
		PowerMockito.whenNew(Date.class).withNoArguments().thenReturn(DataUtils.obterData(07, 06, 2020));	
		//acao
		Locacao retorno = service.alugarFilme(usuario, filmes);
		
		//verificacao
				//boolean ehSegunda = DataUtils.verificarDiaSemana(retorno.getDataRetorno(), Calendar.MONDAY);
				//Assert.assertTrue(ehSegunda);
			//assertThat(retorno.getDataRetorno(), new DiaSemanaMatcher(Calendar.MONDAY));
		assertThat(retorno.getDataRetorno(), caiEm(Calendar.MONDAY));
		assertThat(retorno.getDataRetorno(), caiNumaSegunda());
	}
	
	public static void main(String[] args) {
		new BuilderMaster().gerarCodigoClasse(Locacao.class);
	}
}
