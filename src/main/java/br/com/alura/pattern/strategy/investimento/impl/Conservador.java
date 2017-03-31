package br.com.alura.pattern.strategy.investimento.impl;

import br.com.alura.pattern.strategy.investimento.ContaBancaria;
import br.com.alura.pattern.strategy.investimento.Investimento;

public class Conservador implements Investimento {

	@Override
	public double render(ContaBancaria contaBancaria) {
		return contaBancaria.getSaldo() * 0.008d;
	}

}
