package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;


public class AssertTest {

	@Test
	public void test() {
		
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		
		Assert.assertEquals("Erro de compara��o", 1, 1);
		
		//margem de erro de compara��o
		Assert.assertEquals(0.51512, 0.51, 0.01); 
		
		Assert.assertEquals(Math.PI, 3.14, 0.01);
		
		int i = 5;
		Integer i2 = 5;
		
		Assert.assertEquals(Integer.valueOf(i), i2);
		Assert.assertEquals(i, i2.intValue());
		
		Assert.assertEquals("bola", "bola");
		Assert.assertNotEquals("bola", "casa");
		Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
		Assert.assertTrue("bola".startsWith("bo"));
		
		Usuario u1 = new Usuario("User1");
		Usuario u2 = new Usuario("User1");
		Usuario u3 = u2;
		Usuario u4 = null;
		
		Assert.assertEquals(u1, u2);
		Assert.assertSame(u2, u3);
		
		Assert.assertNull(u4);
		Assert.assertNotNull(u3);
		
	}
	
}
