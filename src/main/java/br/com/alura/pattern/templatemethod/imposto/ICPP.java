package br.com.alura.pattern.templatemethod.imposto;

import br.com.alura.pattern.model.Orcamento;
import br.com.alura.pattern.strategy.imposto.Imposto;

public class ICPP extends TemplateDeImpostoCondicional{
	
	public ICPP(Imposto imposto) {	
		super(imposto);
	}
	
	public ICPP() {
		super();
	}

	@Override
	protected double taxacaoMaxima(Orcamento orcamento) {
 		return orcamento.getValor() * 0.07d;
	}

	@Override
	protected double taxacaoMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.05d;
	}

	@Override
	protected boolean deveUsarTaxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() >= 500d;
	}
	
}
