package br.com.alura.pattern.strategy.imposto;

import br.com.alura.pattern.strategy.Orcamento;

public interface Imposto {
	
	public double calcula(Orcamento orcamento);
	
}
