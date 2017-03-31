package br.com.alura.pattern.model;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private double valor;
	private List<Item> itens;

	public Orcamento(double valor) {
		this.valor = valor;
	}	

	public void addItem(Item item) {
		if (this.itens == null)
			this.itens = new ArrayList<>();

		this.itens.add(item);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<Item> getItens() {
		return itens;
	}

}
