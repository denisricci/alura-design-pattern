package br.com.alura.pattern.strategy.investimento;

public class ContaBancaria {
		
	private double saldo;

	public ContaBancaria(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
}
