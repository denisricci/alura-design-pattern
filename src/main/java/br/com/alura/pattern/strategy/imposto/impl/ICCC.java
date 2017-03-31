package br.com.alura.pattern.strategy.imposto.impl;

import br.com.alura.pattern.model.Orcamento;
import br.com.alura.pattern.strategy.imposto.Imposto;

public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		double valor = orcamento.getValor();
		if (valor < 1000d) {
			return valor * 0.05d;
		}

		if (valor <= 3000d) {
			return valor * 0.07d;
		}

		return (valor * 0.08d) + 30;
	}

}
