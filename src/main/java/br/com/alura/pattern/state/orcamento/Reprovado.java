package br.com.alura.pattern.state.orcamento;

import br.com.alura.pattern.model.Orcamento;

public class Reprovado implements EstadoOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento reprovado não pode receber desconto extra");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Você não pode aprovar um orçamento que já está reprovado");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("O orçamento já está reprovado");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setEstado(orcamento.getEstado());
	}

}
