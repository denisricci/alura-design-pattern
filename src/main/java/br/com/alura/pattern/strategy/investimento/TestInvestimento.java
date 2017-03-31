package br.com.alura.pattern.strategy.investimento;

import br.com.alura.pattern.strategy.investimento.impl.Arrojado;
import br.com.alura.pattern.strategy.investimento.impl.Conservador;
import br.com.alura.pattern.strategy.investimento.impl.Moderado;

public class TestInvestimento {
		
	public static void main(String[] args) {
		ContaBancaria contaBancaria = new ContaBancaria(1000d);
		
		Investimento conservador = new Conservador();
		Investimento moderado = new Moderado();
		Investimento arrojado = new Arrojado();		
					
		RealizadorDeInvestimento realizadorDeInvestimento = new RealizadorDeInvestimento();
		realizadorDeInvestimento.investir(contaBancaria, conservador);
		realizadorDeInvestimento.investir(contaBancaria, moderado);
		realizadorDeInvestimento.investir(contaBancaria, arrojado);
	}
}
