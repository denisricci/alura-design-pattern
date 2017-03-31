package br.com.alura.pattern.strategy.imposto.impl;

import br.com.alura.pattern.model.Orcamento;
import br.com.alura.pattern.strategy.imposto.Imposto;

public class ICMS implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		return (orcamento.getValor() * 0.05d) + 50;
	}

}
