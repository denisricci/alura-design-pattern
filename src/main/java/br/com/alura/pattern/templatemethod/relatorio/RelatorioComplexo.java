package br.com.alura.pattern.templatemethod.relatorio;

import java.util.Calendar;
import java.util.List;

import br.com.alura.pattern.model.Conta;

public class RelatorioComplexo extends Relatorio {

	@Override
	void cabecalho() {
		System.out.println("Banco XYZ");
		System.out.println("Avenida Paulista, 1234");
		System.out.println("(11) 1234-5678");
	}

	@Override
	void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.getTitular() + " - " + conta.getNumero() + " - " + conta.getAgencia() + " - "
					+ conta.getSaldo());
		}
	}

	@Override
	void rodape() {
		System.out.println("banco@xyz.com.br");
        System.out.println(Calendar.getInstance().getTime());  
	}

}
