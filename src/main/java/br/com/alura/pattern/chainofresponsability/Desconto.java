package br.com.alura.pattern.chainofresponsability;

import br.com.alura.pattern.model.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public abstract double desconta(Orcamento orcamento);

	public Desconto setProximo(Desconto proximo) {
		this.proximo = proximo;
		return this.proximo;
	}
}
