package br.com.alura.pattern.templatemethod.imposto;

import br.com.alura.pattern.model.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional{

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
