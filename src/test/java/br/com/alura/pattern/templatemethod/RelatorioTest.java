package br.com.alura.pattern.templatemethod;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.alura.pattern.model.Conta;
import br.com.alura.pattern.templatemethod.relatorio.Relatorio;
import br.com.alura.pattern.templatemethod.relatorio.RelatorioComplexo;
import br.com.alura.pattern.templatemethod.relatorio.RelatorioSimples;

public class RelatorioTest {
	
	
	private List<Conta> contas;
	
	@Before
	public void init(){
		contas = new ArrayList<>();
		
		Conta conta1 = new Conta("Denis Ricci", 1000d);
		conta1.setAgencia(1234);
		conta1.setNumero(323232);
		
		Conta conta2 = new Conta("Debora Ricci", 2000d);
		conta2.setAgencia(543543);
		conta2.setNumero(323233);
		
		contas.add(conta1);
		contas.add(conta2);
	}

	
	@Test
	public void relatorioSimples(){				
		System.out.println("Relatório Simples");
		Relatorio relatorio = new RelatorioSimples();
		relatorio.imprime(contas);
	}
	
	@Test
	public void relatorioComplexo(){	
		System.out.println(" ");
		System.out.println("Relatório Complexo");		
		Relatorio relatorio = new RelatorioComplexo();
		relatorio.imprime(contas);
	}
	
	
}
