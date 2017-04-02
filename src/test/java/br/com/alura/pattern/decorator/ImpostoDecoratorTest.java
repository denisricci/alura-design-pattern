package br.com.alura.pattern.decorator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.alura.pattern.model.Item;
import br.com.alura.pattern.model.Orcamento;
import br.com.alura.pattern.strategy.imposto.Imposto;
import br.com.alura.pattern.strategy.imposto.impl.ICMS;
import br.com.alura.pattern.strategy.imposto.impl.ISS;
import br.com.alura.pattern.strategy.imposto.impl.ImpostoMuitoAlto;
import br.com.alura.pattern.templatemethod.imposto.ICPP;
import br.com.alura.pattern.templatemethod.imposto.IHIT;

public class ImpostoDecoratorTest {

	private Orcamento orcamento;

	@Before
	public void init() {
		this.orcamento = new Orcamento(1000);
	}

	@Test
	public void variosImpostosTest() {
		Imposto imposto = new ISS(new ICMS());
		Assert.assertEquals(160d, imposto.calcula(orcamento), 0.001d);
	}

	@Test
	public void impostoMuitoAlto() {
		Imposto imposto = new ImpostoMuitoAlto(new ISS());
		Assert.assertEquals(260d, imposto.calcula(orcamento), 0.001d);
	}

	@Test
	public void templateMathodDecorator(){
		Orcamento orcamentoComItem = new Orcamento(1000);
		orcamentoComItem.addItem(new Item("PS4"));
		Imposto imposto = new ICPP(new ISS(new IHIT()));
		Assert.assertEquals(140d, imposto.calcula(orcamentoComItem), 0.001d);		
	}

}
