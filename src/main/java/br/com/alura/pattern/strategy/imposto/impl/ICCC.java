package br.com.alura.pattern.strategy.imposto.impl;

import br.com.alura.pattern.model.Orcamento;
import br.com.alura.pattern.strategy.imposto.Imposto;

public class ICCC extends Imposto {

	public ICCC(Imposto imposto) {
		super(imposto);
	}
	
	public ICCC() {	
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {
		double resultado;
		double valor = orcamento.getValor();
		if (valor < 1000d) {
			resultado = valor * 0.05d;
		} else {
			if (valor <= 3000d) {
				resultado = valor * 0.07d;
			} else
				resultado = (valor * 0.08d) + 30;
		}
		return resultado + calculaOutroImposto(orcamento);
	}

}
