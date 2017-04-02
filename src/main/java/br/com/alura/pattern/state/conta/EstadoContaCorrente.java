package br.com.alura.pattern.state.conta;

import br.com.alura.pattern.model.Conta;

public interface EstadoContaCorrente {
	
	public void sacar(double valor, Conta conta);
	public void depositar(double valor, Conta conta);
	
}
