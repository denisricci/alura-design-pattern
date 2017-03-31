package br.com.alura.pattern.strategy.investimento.impl;

import java.util.Random;

import br.com.alura.pattern.strategy.investimento.ContaBancaria;
import br.com.alura.pattern.strategy.investimento.Investimento;

public class Moderado implements Investimento {

	@Override
	public double render(ContaBancaria contaBancaria) {
		boolean isOverThan50Percent = new Random().nextDouble() > 0.50;

		if (isOverThan50Percent) {
			System.out.println("Rendimento de 2.5%");
			return contaBancaria.getSaldo() * 0.025d;
		}
		System.out.println("Rendimento de 0.7%");
		return contaBancaria.getSaldo() * 0.007d;
	}

}
