package br.com.alura.pattern.chainofresponsability;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.alura.pattern.model.Item;
import br.com.alura.pattern.model.Orcamento;

public class CalculadoraDeDescontoTest {
	
	private CalculadoraDeDesconto calculadoraDeDesconto;
	
	@Before
	public void init(){
		calculadoraDeDesconto = new CalculadoraDeDesconto();
	}
	
	@Test
	public void maisDeCincoItens(){
		Orcamento orcamento= new Orcamento(1000);		
		
		orcamento.addItem(new Item("PS3", 1200.0));
		orcamento.addItem(new Item("XBOX 360", 1200.0));
		orcamento.addItem(new Item("PS4", 1200.0));
		orcamento.addItem(new Item("XBOX ONE", 1200.0));
		orcamento.addItem(new Item("PS4 PRO", 1200.0));
		orcamento.addItem(new Item("XBOX ONE S", 1200.0));
		
		Assert.assertEquals(100.0d, calculadoraDeDesconto.calcular(orcamento),0.001);
		
	}
	
}
