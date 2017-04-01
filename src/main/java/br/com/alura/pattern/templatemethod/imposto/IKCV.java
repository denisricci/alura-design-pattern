package br.com.alura.pattern.templatemethod.imposto;

import br.com.alura.pattern.model.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional{

	@Override
	double taxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.1d;
	}

	@Override
	double taxacaoMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.06d;
	}

	@Override
	boolean deveUsarTaxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() > 500 && orcamento.getItens().size() >= 3;
	}

}
