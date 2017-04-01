package br.com.alura.pattern.chainofresponsability.formato;

import br.com.alura.pattern.chainofresponsability.formato.impl.Csv;
import br.com.alura.pattern.chainofresponsability.formato.impl.Porcento;
import br.com.alura.pattern.chainofresponsability.formato.impl.Xml;
import br.com.alura.pattern.model.Conta;

public class Serializador {

	public String serializar(Formato formato, Conta conta) {
		Resposta r3 = new Porcento();
		Resposta r2 = new Xml(r3);
		Resposta r1 = new Csv(r2);				

		return r1.serializar(formato, conta);
	}

}
