package br.com.alura.pattern.decorator;

import java.util.List;

import br.com.alura.pattern.model.Conta;

public abstract class Filtro {

	private final Filtro proximoFiltro;

	public Filtro() {
		proximoFiltro = null;
	}

	public Filtro(Filtro proximoFiltro) {
		this.proximoFiltro = proximoFiltro;
	}

	public abstract List<Conta> filtrar(List<Conta> contas);

	protected List<Conta> outroFiltro(List<Conta> contas, List<Conta> filtrado) {
		if (proximoFiltro == null)
			return filtrado;		
		filtrado.addAll(proximoFiltro.filtrar(contas));		
		return filtrado;
	}

}
