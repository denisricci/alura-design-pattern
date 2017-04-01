package br.com.alura.pattern.chainofresponsability.formato.impl;

import br.com.alura.pattern.chainofresponsability.formato.Formato;
import br.com.alura.pattern.chainofresponsability.formato.Resposta;
import br.com.alura.pattern.model.Conta;

public class Porcento implements Resposta {

	private Resposta proximo;

	public Porcento(Resposta proximo) {
		super();
		this.proximo = proximo;
	}

	public Porcento() {
	}

	@Override
	public String serializar(Formato formato, Conta conta) {
		if (formato.equals(Formato.PORCENTO)) {
			StringBuilder csv = new StringBuilder();
			csv.append(conta.getTitular());
			csv.append("%");
			csv.append(conta.getSaldo());
			csv.append("%");
			return csv.toString();
		}
		if (proximo == null)
			throw new RuntimeException("Formato desejado não encontrado");
		return proximo.serializar(formato, conta);
	}

	@Override
	public void setProximo(Resposta proximo) {
		this.proximo = proximo;
	}

}
