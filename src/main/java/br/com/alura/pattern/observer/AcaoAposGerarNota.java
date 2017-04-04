package br.com.alura.pattern.observer;

import br.com.alura.pattern.builder.NotaFiscal;

public interface AcaoAposGerarNota {
	
	public void executa(NotaFiscal notaFiscal);
	
}
