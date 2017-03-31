package br.com.alura.pattern.strategy.investimento.impl;

import br.com.alura.pattern.strategy.investimento.ContaBancaria;
import br.com.alura.pattern.strategy.investimento.Investimento;

public class Arrojado implements Investimento {

	@Override
	public double render(ContaBancaria contaBancaria) {
		double chance = new java.util.Random().nextDouble();

		if (chance <= 0.20) {
			System.out.println("Porcentagem 20% rendimento de 5%");
			return contaBancaria.getSaldo() * 0.05d;
		}

		if (chance <= 0.50) {
			System.out.println("Porcentagem 30% rendimento de 3%" );
			return contaBancaria.getSaldo() * 0.03d;
		}

		System.out.println("Porcentagem 50% rendimento de 0.6%");
		return contaBancaria.getSaldo() * 0.006d;
	}

}
