package br.com.alura.pattern.templatemethod;

import org.junit.Assert;
import org.junit.Test;

import br.com.alura.pattern.model.Item;
import br.com.alura.pattern.model.Orcamento;
import br.com.alura.pattern.strategy.imposto.Imposto;
import br.com.alura.pattern.templatemethod.imposto.ICPP;
import br.com.alura.pattern.templatemethod.imposto.IHIT;
import br.com.alura.pattern.templatemethod.imposto.IKCV;

public class TemplateDeImpostoCondicionalTest {
	
	@Test
	public void ICPPTest(){
		Orcamento maiorQueQuinhentos = new Orcamento(1000d);	
		Orcamento menorQueQuinhentos = new Orcamento(400);	
		Imposto icpp = new ICPP();		
		Assert.assertEquals(70d, icpp.calcula(maiorQueQuinhentos), 0.001d);
		Assert.assertEquals(20d, icpp.calcula(menorQueQuinhentos), 0.001d);				
	}
	
	@Test
	public void IKCVTest(){
		Orcamento orcamento = new Orcamento(1000d);			
		Imposto ikcv = new IKCV();		
		Assert.assertEquals(60d, ikcv.calcula(orcamento), 0.001d);
		
		orcamento.addItem(new Item("PS4"));
		orcamento.addItem(new Item("PS4PRO"));
		orcamento.addItem(new Item("XBOX360"));
		orcamento.addItem(new Item("XBOXONE"));
		
		Assert.assertEquals(100d, ikcv.calcula(orcamento), 0.001d);			
	}
	
	@Test
	public void IHITTest(){
		Imposto ihit = new IHIT();
		
		Orcamento semItemDuplicado = new Orcamento(1000d);	
		semItemDuplicado.addItem(new Item("PS4"));
		semItemDuplicado.addItem(new Item("PS4PRO"));
		semItemDuplicado.addItem(new Item("XBOX360"));
		semItemDuplicado.addItem(new Item("XBOXONE"));				
		
		Assert.assertEquals(40d, ihit.calcula(semItemDuplicado), 0.001d);	
		
		Orcamento comItemDuplicado = new Orcamento(1000d);	
		comItemDuplicado.addItem(new Item("PS4"));
		comItemDuplicado.addItem(new Item("PS4"));
		comItemDuplicado.addItem(new Item("XBOX360"));
		comItemDuplicado.addItem(new Item("XBOXONE"));		
		
		Assert.assertEquals(230d, ihit.calcula(comItemDuplicado), 0.001d);	
	}

}
