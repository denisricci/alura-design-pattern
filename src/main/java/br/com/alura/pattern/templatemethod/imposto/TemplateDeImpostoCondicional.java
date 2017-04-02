package br.com.alura.pattern.templatemethod.imposto;

import br.com.alura.pattern.model.Orcamento;
import br.com.alura.pattern.strategy.imposto.Imposto;

public abstract class TemplateDeImpostoCondicional extends Imposto{
	
	public TemplateDeImpostoCondicional(Imposto imposto) {
		super(imposto);
	}
	
	public TemplateDeImpostoCondicional() {
		super();
	}

	@Override
	public final double calcula(Orcamento orcamento) {
		if(deveUsarTaxacaoMaxima(orcamento)){
			return taxacaoMaxima(orcamento) + calculaOutroImposto(orcamento);
		}
				
		return taxacaoMinima(orcamento) + calculaOutroImposto(orcamento);
	}

	abstract double taxacaoMaxima(Orcamento orcamento);

	abstract double taxacaoMinima(Orcamento orcamento);

	abstract boolean deveUsarTaxacaoMaxima(Orcamento orcamento);			
	
}
