package br.com.alura.pattern.templatemethod.relatorio;

import java.util.List;

import br.com.alura.pattern.model.Conta;

public abstract class Relatorio {

	public void imprime(List<Conta> contas) {
		cabecalho();
		corpo(contas);
		rodape();
	}

	abstract void cabecalho();

	abstract void corpo(List<Conta> contas);

	abstract void rodape();

}
