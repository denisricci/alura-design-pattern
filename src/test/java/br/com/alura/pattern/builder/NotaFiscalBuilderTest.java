package br.com.alura.pattern.builder;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class NotaFiscalBuilderTest {

	
	@Test
	public void criaNotaFiscalTest(){
		NotaFiscal notaFiscal = new NotaFiscalBuilder().paraEmpresa("Denis Ricci ME").
		comCnpj("46341014000170").
		comObeservacao("Nota fiscal de teste").	
		naDataAtual().
		com(new ItemDaNota("PS4", 1000d)).
		com(new ItemDaNota("XBOX ONE", 1000d)).
		build();
		
		assertEquals("Denis Ricci ME", notaFiscal.getRazaoSocial());
		assertEquals("46341014000170", notaFiscal.getCnpj());
		assertEquals("Nota fiscal de teste", notaFiscal.getObservacao());
		assertEquals(2, notaFiscal.getItens().size());
		assertEquals(2000d, notaFiscal.getValorBruto(), 0.001d);
		assertEquals(100, notaFiscal.getImposto(), 0.001d);
	}
	
}
