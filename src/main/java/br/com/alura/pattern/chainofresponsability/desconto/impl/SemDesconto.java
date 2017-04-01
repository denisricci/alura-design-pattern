package br.com.alura.pattern.chainofresponsability.desconto.impl;

import br.com.alura.pattern.chainofresponsability.desconto.Desconto;
import br.com.alura.pattern.model.Orcamento;

public class SemDesconto extends Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

}
