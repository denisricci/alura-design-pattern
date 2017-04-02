package br.com.alura.pattern.templatemethod.imposto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.pattern.model.Item;
import br.com.alura.pattern.model.Orcamento;
import br.com.alura.pattern.strategy.imposto.Imposto;

public class IHIT extends TemplateDeImpostoCondicional {

	public IHIT(Imposto imposto) {
		super(imposto);
	}

	public IHIT() {
		super();
	}

	@Override
	protected double taxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.13d + 100;
	}

	@Override
	protected double taxacaoMinima(Orcamento orcamento) {
		return (new Double(orcamento.getItens().size()) / 100d) * orcamento.getValor();
	}

	@Override
	protected boolean deveUsarTaxacaoMaxima(Orcamento orcamento) {
		return existeDoisItensComMesmoNome(orcamento.getItens());
	}

	private boolean existeDoisItensComMesmoNome(List<Item> itens) {
		List<Item> distincted = itens.stream().distinct().collect(Collectors.toList());

		if (distincted.size() < itens.size()) {
			return true;
		}

		return false;
	}

}
