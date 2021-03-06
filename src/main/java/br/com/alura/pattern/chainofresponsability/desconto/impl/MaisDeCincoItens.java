package br.com.alura.pattern.chainofresponsability.desconto.impl;

import br.com.alura.pattern.chainofresponsability.desconto.Desconto;
import br.com.alura.pattern.model.Orcamento;

public class MaisDeCincoItens extends Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		return proximo.desconta(orcamento);
	}

}
