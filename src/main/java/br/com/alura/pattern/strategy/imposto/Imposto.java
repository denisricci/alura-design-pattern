package br.com.alura.pattern.strategy.imposto;

import br.com.alura.pattern.model.Orcamento;

public interface Imposto {
	
	public double calcula(Orcamento orcamento);
	
}
