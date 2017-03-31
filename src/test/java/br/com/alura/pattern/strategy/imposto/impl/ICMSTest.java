package br.com.alura.pattern.strategy.imposto.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.alura.pattern.model.Orcamento;
import br.com.alura.pattern.strategy.imposto.CalculadoraDeImposto;
import br.com.alura.pattern.strategy.imposto.Imposto;

public class ICMSTest {
	
	private CalculadoraDeImposto calculadoraDeImposto;
	
	@Before
	public void init(){
		calculadoraDeImposto = new CalculadoraDeImposto();
	}
	
	@Test
	public void deveCalcularCorretamenteValorDoICMS(){
		Orcamento orcamento = new Orcamento(1000d);
		Imposto ICMS = new ICMS();
		double valor = calculadoraDeImposto.calcular(orcamento, ICMS);
		Assert.assertEquals(100d, valor, 0.001d);
	}
}
