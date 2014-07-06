package br.com.estudo.estatico;

import org.junit.Assert;
import org.junit.Test;

public class ClasseATest {
	
	@Test
	public void deveIncrementarConta(){
		ClasseA objeto1 = new ClasseA();
		objeto1.conta();
		Assert.assertTrue(objeto1.getContador()==1);
		
		objeto1.conta();
		Assert.assertTrue(objeto1.getContador()==2);
		
		ClasseA objeto2 = new ClasseA();
		objeto2.conta();
		Assert.assertTrue(objeto2.getContador()==1);
		
	}
	
	@Test
	public void deveIncrementarContaEstatico(){
		ClasseA objeto1 = new ClasseA();
		ClasseA.contaEstatico();
		Assert.assertTrue(ClasseA.getContadorEstatico()==1);
		
		ClasseA objeto2 = new ClasseA();
		ClasseA.contaEstatico();
		Assert.assertTrue(ClasseA.getContadorEstatico()==2);
		
	}
	


}
