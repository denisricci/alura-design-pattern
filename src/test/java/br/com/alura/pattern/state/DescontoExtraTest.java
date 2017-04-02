package br.com.alura.pattern.state;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import br.com.alura.pattern.model.Orcamento;

public class DescontoExtraTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void descontoExtraEmAprovacao() {
		Orcamento orcamento = new Orcamento(1000);
		orcamento.aplicaDescontoExtra();

		assertEquals(950d, orcamento.getValor(), 0.001d);

		thrown.expect(RuntimeException.class);

		orcamento.finalizar();
	}

	@Test(expected = RuntimeException.class)
	public void descontoExtraAprovado() {
		Orcamento orcamento = new Orcamento(1000);
		orcamento.aprovar();
		orcamento.aplicaDescontoExtra();
		assertEquals(980d, orcamento.getValor(), 0.001d);

		orcamento.reprovar();
	}
	
	@Test(expected = RuntimeException.class)
	public void descontoExtraReprovado(){
		Orcamento orcamento = new Orcamento(1000);
		orcamento.reprovar();
		orcamento.aplicaDescontoExtra();
	}
		
	
	@Test(expected = RuntimeException.class)
	public void descontoExtraFinalizado(){
		Orcamento orcamento = new Orcamento(1000);
		orcamento.aprovar();
		orcamento.finalizar();
		orcamento.aplicaDescontoExtra();
	}
	
	@Test(expected = RuntimeException.class)
	public void descontoExtraDuplicado(){
		Orcamento orcamento = new Orcamento(1000);
		orcamento.aplicaDescontoExtra();
		orcamento.aprovar();
		orcamento.aplicaDescontoExtra();
	}
	
}
