package br.com.alura.pattern.chainofresponsability.desconto.impl;

import java.util.List;

import br.com.alura.pattern.chainofresponsability.desconto.Desconto;
import br.com.alura.pattern.model.Item;
import br.com.alura.pattern.model.Orcamento;

public class DescontoPorVendaCasada extends Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		boolean lapis = existe("LAPIS", orcamento.getItens());
		boolean caneta = existe("CANETA", orcamento.getItens());
		if (lapis && caneta) {
			return orcamento.getValor() * 0.05d;
		}
		return proximo.desconta(orcamento);
	}

	private boolean existe(String nomeItem, List<Item> itens) {
		return itens.stream().anyMatch(i -> i.getNome().equals(nomeItem));
	}

}
