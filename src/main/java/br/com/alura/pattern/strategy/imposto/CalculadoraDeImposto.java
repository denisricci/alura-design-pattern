package br.com.alura.pattern.strategy.imposto;

import br.com.alura.pattern.model.Orcamento;

public class CalculadoraDeImposto {

	public double calcular(Orcamento orcamento, Imposto imposto){
		double valorImposto = imposto.calcula(orcamento);
		System.out.println("Valor do imposto: " + valorImposto);
		return valorImposto;
	}
	
}
