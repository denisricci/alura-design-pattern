package br.com.alura.pattern.model;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.pattern.state.orcamento.EmAprovacao;
import br.com.alura.pattern.state.orcamento.EstadoOrcamento;

public class Orcamento {

	private double valor;
	private List<Item> itens;	
	
	/**
	 * O ideal é que o estado seja protected e não possua getters e setters, porém para isso
	 *é necessário que o EstadoOrcamento esteja no mesmo pacote, porém na organização atual do
	 *projeto isso não ocorreu, por isso foi necessário adicionar o getter e o setter, isso abre brecha
	 *para que alguém altere o estado do orçamento manualmente, o que deve ser evitado.
	 */
	private EstadoOrcamento estado = new EmAprovacao();

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
		if(itens == null){
			itens = new ArrayList<>();
		}
		return itens;
	}

	public EstadoOrcamento getEstado() {
		return estado;
	}

	public void setEstado(EstadoOrcamento estado) {
		this.estado = estado;
	}
	
	public void aprovar(){
		this.estado.aprovar(this);
	}
	
	public void reprovar(){
		this.estado.reprovar(this);
	}
	
	public void finalizar(){
		this.estado.finalizar(this);
	}
	
	public void aplicaDescontoExtra(){
		this.estado.aplicaDescontoExtra(this);
	}
}
