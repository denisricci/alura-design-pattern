package br.com.alura.pattern.state.orcamento;

import br.com.alura.pattern.model.Orcamento;

public class EmAprovacao implements EstadoOrcamento {

	private boolean descontoAplicado = false;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (!descontoAplicado) {
			orcamento.setValor(orcamento.getValor() - orcamento.getValor() * 0.05);
			this.descontoAplicado = true;
		} else {
			throw new RuntimeException("Você não pode aplicar o desconto duas vezes");
		}
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.setEstado(new Aprovado(this.descontoAplicado));
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.setEstado(new Reprovado());
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException(
				"Um orçamento em aprovacao não pode ser finalizado, é necessário que ele esteja aprovado ou reprovado");
	}

}
