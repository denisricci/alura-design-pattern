package br.com.alura.pattern.chainofresponsability;

import br.com.alura.pattern.model.Orcamento;

public class ValorMaiorQueQuinhentos extends Desconto{

	@Override
	public double desconta(Orcamento orcamento) {
		if(orcamento.getValor()> 500.0){
			return orcamento.getValor()*0.7;
		}		
		return proximo.desconta(orcamento);
	}

}
