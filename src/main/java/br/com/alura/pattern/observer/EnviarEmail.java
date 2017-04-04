package br.com.alura.pattern.observer;

import br.com.alura.pattern.builder.NotaFiscal;

public class EnviarEmail implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("enviou email");
	}

}
