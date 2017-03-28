package br.com.alura.pattern.strategy;

import br.com.alura.pattern.strategy.imposto.Imposto;
import br.com.alura.pattern.strategy.imposto.impl.ICCC;
import br.com.alura.pattern.strategy.imposto.impl.ICMS;
import br.com.alura.pattern.strategy.imposto.impl.ISS;

public class Main {
	
	public static void main(String[] args) {
		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
		
		Orcamento orcamento = new Orcamento(1000d);
		
		Imposto ICMS = new ICMS();
		Imposto ISS = new ISS();
		Imposto ICCC = new ICCC();
		
		calculadoraDeImposto.calcular(orcamento, ICMS);
		calculadoraDeImposto.calcular(orcamento, ISS);
		
		calculadoraDeImposto.calcular(orcamento, ICCC);
	}

}
