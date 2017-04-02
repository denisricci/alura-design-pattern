package br.com.alura.pattern.state;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.com.alura.pattern.model.Conta;


public class ContaTest {
	
		
	@Test(expected = RuntimeException.class)
	public void sacarNegativo(){
		Conta conta = new Conta("Denis Ricci", -100d);
		conta.sacar(200);
	}
	
	@Test
	public void sacar(){
		Conta conta = new Conta("Denis Ricci", 1000d);
		conta.sacar(100);				
		assertEquals(900d, conta.getSaldo(), 0.001d);								
	}
	
	@Test
	public void depositar(){
		Conta conta = new Conta("Denis Ricci", -1000d);
		conta.depositar(100);				
		assertEquals(-905d, conta.getSaldo(), 0.001d);	
		conta.depositar(1000);
		assertEquals(45d, conta.getSaldo(), 0.001d);
		conta.depositar(100);
		assertEquals(143d, conta.getSaldo(), 0.001d);
	}
	
}
