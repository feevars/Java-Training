package br.ce.wcaquino.servicos;


import static br.ce.wcaquino.utils.DataUtils.isMesmaData;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTest {
	
	//podemos verificar uma assertiva por teste para identificar melhor o erro ou podemos usar o 
	//error collerctor, que exibe todas as mensagens de erro
	
	@Rule
	public ErrorCollector error = new ErrorCollector();
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testeLocacaoFilme()  throws Exception {
		//cenário
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("User 1");
		Filme filme = new Filme("Gato Miu", 1, 5.0);
		
		//ação
		Locacao locacao = service.alugarFilme(usuario, filme);
		
		//verificação
		//System.out.println(locacao.getValor()== 5.0);
					//Assert.assertEquals(4.0, locacao.getValor(), 0.01);
					//assertThat(locacao.getValor(), is(equalTo(5.0)));
		error.checkThat(locacao.getValor(), is(equalTo(5.0)));
		//System.out.println(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
					//assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
					//assertThat(isMesmaData(locacao.getDataLocacao(), new Date()), is(true));
		error.checkThat(isMesmaData(locacao.getDataLocacao(), new Date()), is(true));
		//System.out.println(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(2)));
					//assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
					//assertThat(isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)), is(true));
		error.checkThat(isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)), is(true));
	}
	
	@Test(expected=Exception.class)
	public void testLocacao_filmesSemEstoque() throws Exception {
		//cenário
				LocacaoService service = new LocacaoService();
				Usuario usuario = new Usuario("User 1");
				Filme filme = new Filme("Gato Miu", 0, 5.0);
				
		//ação
				Locacao locacao = service.alugarFilme(usuario, filme);
	}
	
	@Test
	public void testLocacao_filmesSemEstoque2() {
		//cenário
				LocacaoService service = new LocacaoService();
				Usuario usuario = new Usuario("User 1");
				Filme filme = new Filme("Gato Miu", 1, 5.0);
				
		//ação
				try {
					service.alugarFilme(usuario, filme);
					Assert.fail("Deveria ter lançado uma exceção");
				} catch (Exception e) {
					assertThat(e.getMessage(), is("Filme sem estoque"));
				}
	}
	
	@Test
	public void testLocacao_filmesSemEstoque3() throws Exception {
		//cenário
				LocacaoService service = new LocacaoService();
				Usuario usuario = new Usuario("User 1");
				Filme filme = new Filme("Gato Miu", 0, 5.0);
				
				exception.expect(Exception.class);
				exception.expectMessage("Filme sem estoque");
				
		//ação
				service.alugarFilme(usuario, filme);
	}
	
	
}
