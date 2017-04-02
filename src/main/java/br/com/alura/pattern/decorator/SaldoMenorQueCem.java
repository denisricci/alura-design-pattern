package br.com.alura.pattern.decorator;

import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.pattern.model.Conta;

public class SaldoMenorQueCem extends Filtro {

	public SaldoMenorQueCem(Filtro proximoFiltro) {
		super(proximoFiltro);
	}

	public SaldoMenorQueCem() {
		super();
	}

	@Override
	public List<Conta> filtrar(List<Conta> contas) {		
		List<Conta> filtrado = contas.stream().filter(c -> c.getSaldo() < 100d).collect(Collectors.toList());
		System.out.println("Quantidade menor que cem: " + filtrado.size());
		return outroFiltro(contas, filtrado);
	}

}
