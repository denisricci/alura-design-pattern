package br.com.alura.pattern.chainofresponsability;

import br.com.alura.pattern.model.Orcamento;

public class CalculadoraDeDesconto {
	
	public double calcular(Orcamento orcamento){
		Desconto d1 = new MaisDeCincoItens();
		Desconto d2 = new ValorMaiorQueQuinhentos();
		Desconto d3 = new SemDesconto();
		
		d1.setProximo(d2).setProximo(d3);				
		
		return d1.desconta(orcamento);		
	}
	
}
