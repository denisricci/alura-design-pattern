package br.com.alura.pattern.templatemethod.relatorio;

import java.util.List;

import br.com.alura.pattern.model.Conta;

public class RelatorioSimples extends Relatorio {

	@Override
	void cabecalho() {		
		System.out.println("Banco Santander");	
	}

	@Override
	void corpo(List<Conta> contas) {		
		for (Conta conta : contas) {				
			System.out.println(conta.getTitular() + " - " + conta.getSaldo());
		}		
	}

	@Override
	void rodape() {		
		System.out.println("(11) 1234-5678");		
	}

}
