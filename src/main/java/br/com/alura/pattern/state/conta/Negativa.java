package br.com.alura.pattern.state.conta;

import br.com.alura.pattern.model.Conta;

public class Negativa implements EstadoContaCorrente {

	@Override
	public void sacar(double valor, Conta conta) {
		throw new RuntimeException("Você não pode efetuar um saque em uma conta com saldo negativo");
	}

	@Override
	public void depositar(double valor, Conta conta) {
		conta.setSaldo(conta.getSaldo() + valor * 0.95);
		defineEstado(conta);
	}
		
	public void defineEstado(Conta conta) {
		if (conta.getSaldo() < 0) {
			conta.setEstado(new Negativa());
		} else {
			conta.setEstado(new Positiva());
		}
	}

}
