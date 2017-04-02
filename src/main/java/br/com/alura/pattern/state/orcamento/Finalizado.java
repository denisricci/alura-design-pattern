package br.com.alura.pattern.state.orcamento;

import br.com.alura.pattern.model.Orcamento;

public class Finalizado implements EstadoOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento finalizado não pode receber desconto extra");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("O orçamento já foi finalizado");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("O orçamento já foi finalizado");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("O orçamento já foi finalizado");
	}

}
