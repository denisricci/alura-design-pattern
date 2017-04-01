package br.com.alura.pattern.chainofresponsability;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.alura.pattern.chainofresponsability.formato.Formato;
import br.com.alura.pattern.chainofresponsability.formato.Serializador;
import br.com.alura.pattern.model.Conta;

public class SerializadorTest {

	private Serializador serializador;
	private Conta conta;
	
	@Before
	public void init(){
		this.serializador = new Serializador();
		this.conta = new Conta("Denis Ricci", 100d);
	}
	
	
	@Test
	public void serializarParaCsv(){				
		String real = serializador.serializar(Formato.CSV, conta);
		String esperado = "Denis Ricci;100.0;";		
		Assert.assertEquals(esperado, real);
	}
	
	@Test
	public void serializarParaPorcento(){		
		String real = serializador.serializar(Formato.PORCENTO, conta);
		String esperado = "Denis Ricci%100.0%";		
		Assert.assertEquals(esperado, real);
	}
	
	@Test
	public void serializarParaXml(){		
		String real = serializador.serializar(Formato.XML, conta);
		String esperado = "<conta><titular>Denis Ricci</titular><saldo>100.0</saldo></conta>";		
		Assert.assertEquals(esperado, real);
	}
	
}
