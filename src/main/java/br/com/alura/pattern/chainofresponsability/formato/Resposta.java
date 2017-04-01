package br.com.alura.pattern.chainofresponsability.formato;

import br.com.alura.pattern.model.Conta;

public interface Resposta {

	public String serializar(Formato formato, Conta conta);
	public void setProximo(Resposta proximo);
}
