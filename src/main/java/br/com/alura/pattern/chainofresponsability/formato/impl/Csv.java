package br.com.alura.pattern.chainofresponsability.formato.impl;

import br.com.alura.pattern.chainofresponsability.formato.Formato;
import br.com.alura.pattern.chainofresponsability.formato.Resposta;
import br.com.alura.pattern.model.Conta;

public class Csv implements Resposta {

	private Resposta proximo;

	public Csv(Resposta proximo) {
		super();
		this.proximo = proximo;
	}

	@Override
	public String serializar(Formato formato, Conta conta) {
		if (formato.equals(Formato.CSV)) {
			StringBuilder csv = new StringBuilder();
			csv.append(conta.getTitular());
			csv.append(";");
			csv.append(conta.getSaldo());
			csv.append(";");
			return csv.toString();
		}
		
		return proximo.serializar(formato, conta);
	}

	@Override
	public void setProximo(Resposta proximo) {
		this.proximo = proximo;
	}

}
