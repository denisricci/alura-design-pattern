package br.com.alura.pattern.chainofresponsability;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.alura.pattern.chainofresponsability.desconto.CalculadoraDeDesconto;
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
		Orcamento orcamento= new Orcamento(400);		
		
		orcamento.addItem(new Item("PS3"));
		orcamento.addItem(new Item("XBOX 360"));
		orcamento.addItem(new Item("PS4"));
		orcamento.addItem(new Item("XBOX ONE"));
		orcamento.addItem(new Item("PS4 PRO"));
		orcamento.addItem(new Item("XBOX ONE S"));
		
		Assert.assertEquals(40.0d, calculadoraDeDesconto.calcular(orcamento),0.001);
		
	}
	
	@Test
	public void valorMaiorQueQuinhentos(){
		Orcamento orcamento= new Orcamento(1000);		
		orcamento.addItem(new Item("PS3"));		
		Assert.assertEquals(70.0d, calculadoraDeDesconto.calcular(orcamento),0.001);
	}
	
	@Test
	public void vendaCasadaLapisCaneta(){
		Orcamento orcamento = new Orcamento(30);
		orcamento.addItem(new Item("LAPIS"));
		orcamento.addItem(new Item("CANETA"));
		Assert.assertEquals(1.5d, calculadoraDeDesconto.calcular(orcamento),0.001);
	}
	
}
