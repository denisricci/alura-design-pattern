package br.com.alura.pattern.strategy.imposto.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.alura.pattern.model.Orcamento;
import br.com.alura.pattern.strategy.imposto.CalculadoraDeImposto;
import br.com.alura.pattern.strategy.imposto.Imposto;

public class ICCCTest {
	
	private CalculadoraDeImposto calculadoraDeImposto;
	private Imposto ICCC;
	@Before
	public void init(){
		calculadoraDeImposto = new CalculadoraDeImposto();
		ICCC = new ICCC();
	}
	
	@Test
	public void ICCCMenorQueMill(){
		Orcamento orcamento = new Orcamento(500d);		
		double valor = calculadoraDeImposto.calcular(orcamento, ICCC);
		Assert.assertEquals(25d, valor, 0.001d);
	}
	
	@Test
	public void ICCCMaiorOuIgualQueMillEMenorQueTresMill(){
		Orcamento orcamento = new Orcamento(1000d);		
		double valor = calculadoraDeImposto.calcular(orcamento, ICCC);
		Assert.assertEquals(70d, valor, 0.001d);
	}
	
	@Test
	public void ICCCMaiorQueTresMill(){
		Orcamento orcamento = new Orcamento(4000d);		
		double valor = calculadoraDeImposto.calcular(orcamento, ICCC);
		Assert.assertEquals(350d, valor, 0.001d);
	}
}
