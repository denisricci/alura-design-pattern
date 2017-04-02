package br.com.alura.pattern.state.conta;

import br.com.alura.pattern.model.Conta;

public class Positiva implements EstadoContaCorrente {

	@Override
	public void sacar(double valor, Conta conta) {
		conta.setSaldo(conta.getSaldo() - valor);
		defineEstado(conta);
	}

	@Override
	public void depositar(double valor, Conta conta) {
		conta.setSaldo(conta.getSaldo() + valor * 0.98);
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
