package br.com.alura.pattern.chainofresponsability;

import br.com.alura.pattern.model.Orcamento;

public class SemDesconto extends Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

}
