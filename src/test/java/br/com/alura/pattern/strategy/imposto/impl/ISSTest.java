package br.com.alura.pattern.strategy.imposto.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.alura.pattern.model.Orcamento;
import br.com.alura.pattern.strategy.imposto.CalculadoraDeImposto;
import br.com.alura.pattern.strategy.imposto.Imposto;

public class ISSTest {
	
	private CalculadoraDeImposto calculadoraDeImposto;
	
	@Before
	public void init(){
		calculadoraDeImposto = new CalculadoraDeImposto();
	}
	
	@Test
	public void deveCalcularCorretamenteValorDoIIS(){
		Orcamento orcamento = new Orcamento(1000d);
		Imposto ISS = new ISS();
		double valor = calculadoraDeImposto.calcular(orcamento, ISS);
		Assert.assertEquals(60d, valor, 0.001d);
	}
}
