package br.com.alura.pattern.templatemethod.imposto;

import br.com.alura.pattern.model.Orcamento;
import br.com.alura.pattern.strategy.imposto.Imposto;

public class IKCV extends TemplateDeImpostoCondicional {

	public IKCV(Imposto imposto) {
		super(imposto);
	}

	public IKCV() {
		super();
	}

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
