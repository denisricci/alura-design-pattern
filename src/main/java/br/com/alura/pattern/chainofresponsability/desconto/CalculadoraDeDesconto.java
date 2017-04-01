package br.com.alura.pattern.chainofresponsability.desconto;

import br.com.alura.pattern.chainofresponsability.desconto.impl.DescontoPorVendaCasada;
import br.com.alura.pattern.chainofresponsability.desconto.impl.MaisDeCincoItens;
import br.com.alura.pattern.chainofresponsability.desconto.impl.SemDesconto;
import br.com.alura.pattern.chainofresponsability.desconto.impl.ValorMaiorQueQuinhentos;
import br.com.alura.pattern.model.Orcamento;

public class CalculadoraDeDesconto {
	
	public double calcular(Orcamento orcamento){
		Desconto d1 = new MaisDeCincoItens();
		Desconto d2 = new ValorMaiorQueQuinhentos();		
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();
		d1.setProximo(d2).setProximo(d3).setProximo(d4);						
		return d1.desconta(orcamento);		
	}
	
}
