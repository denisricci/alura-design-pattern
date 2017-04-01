package br.com.alura.pattern.chainofresponsability.desconto.impl;

import br.com.alura.pattern.chainofresponsability.desconto.Desconto;
import br.com.alura.pattern.model.Orcamento;

public class ValorMaiorQueQuinhentos extends Desconto{

	@Override
	public double desconta(Orcamento orcamento) {
		if(orcamento.getValor()> 500.0){
			return orcamento.getValor()*0.07;
		}		
		return proximo.desconta(orcamento);
	}

}
