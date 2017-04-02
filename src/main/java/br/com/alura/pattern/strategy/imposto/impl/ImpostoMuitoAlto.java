package br.com.alura.pattern.strategy.imposto.impl;

import br.com.alura.pattern.model.Orcamento;
import br.com.alura.pattern.strategy.imposto.Imposto;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto() {
		super();
	}

	public ImpostoMuitoAlto(Imposto imposto) {
		super(imposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2d + calculaOutroImposto(orcamento);
	}

}
