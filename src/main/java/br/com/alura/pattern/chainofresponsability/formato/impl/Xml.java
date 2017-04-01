package br.com.alura.pattern.chainofresponsability.formato.impl;

import br.com.alura.pattern.chainofresponsability.formato.Formato;
import br.com.alura.pattern.chainofresponsability.formato.Resposta;
import br.com.alura.pattern.model.Conta;

public class Xml implements Resposta {

	private Resposta proximo;

	public Xml(Resposta proximo) {
		super();
		this.proximo = proximo;
	}

	@Override
	public String serializar(Formato formato, Conta conta) {
		if (formato.equals(Formato.XML)) {
			StringBuilder csv = new StringBuilder();
			csv.append("<conta>");
			csv.append("<titular>");
			csv.append(conta.getTitular());
			csv.append("</titular>");
			csv.append("<saldo>");
			csv.append(conta.getSaldo());
			csv.append("</saldo>");
			csv.append("</conta>");
			return csv.toString();
		}

		return proximo.serializar(formato, conta);
	}

	@Override
	public void setProximo(Resposta proximo) {
		this.proximo = proximo;
	}

}
