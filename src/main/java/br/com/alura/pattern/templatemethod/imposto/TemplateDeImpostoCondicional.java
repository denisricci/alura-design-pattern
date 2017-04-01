package br.com.alura.pattern.templatemethod.imposto;

import br.com.alura.pattern.model.Orcamento;
import br.com.alura.pattern.strategy.imposto.Imposto;

public abstract class TemplateDeImpostoCondicional implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		if(deveUsarTaxacaoMaxima(orcamento)){
			return taxacaoMaxima(orcamento);
		}
				
		return taxacaoMinima(orcamento);
	}

	abstract double taxacaoMaxima(Orcamento orcamento);

	abstract double taxacaoMinima(Orcamento orcamento);

	abstract boolean deveUsarTaxacaoMaxima(Orcamento orcamento);			
	
}
