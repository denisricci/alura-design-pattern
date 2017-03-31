package br.com.alura.pattern.strategy.investimento;

public class RealizadorDeInvestimento {
	
	public ContaBancaria investir(ContaBancaria contaBancaria, Investimento investimento){
		double rendimento = investimento.render(contaBancaria);
		contaBancaria.depositar(rendimento * 0.75d);
		System.out.println("Saldo: " + contaBancaria.getSaldo());
		return contaBancaria;
	}
	
}
