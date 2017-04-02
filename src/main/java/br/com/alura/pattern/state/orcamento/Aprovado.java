package br.com.alura.pattern.state.orcamento;

import br.com.alura.pattern.model.Orcamento;

public class Aprovado implements EstadoOrcamento {

	private boolean descontoAplicado;
	
	public Aprovado(boolean deuDesconto) {
		this.descontoAplicado=deuDesconto;
	}

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (!descontoAplicado) {
			orcamento.setValor(orcamento.getValor() - orcamento.getValor() * 0.02);
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Você não pode aplicar o desconto duas vezes");
		}
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("O orçamento já está aprovado");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Você não pode reprovar um orçamento que já está aprovado");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setEstado(new Finalizado());
	}

}
