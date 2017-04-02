package br.com.alura.pattern.decorator;

import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.pattern.model.Conta;

public class SaldoMaiorQueQuinhentosMill extends Filtro {

	public SaldoMaiorQueQuinhentosMill(Filtro proximoFiltro) {
		super(proximoFiltro);
	}

	public SaldoMaiorQueQuinhentosMill() {
	}

	@Override
	public List<Conta> filtrar(List<Conta> contas) {
		List<Conta> filtrado = contas.stream().filter(c -> c.getSaldo() > 500000d).collect(Collectors.toList());
		System.out.println("Quantidade maior que quinhentos mill: " + filtrado.size());
		return outroFiltro(contas, filtrado);
	}

}
