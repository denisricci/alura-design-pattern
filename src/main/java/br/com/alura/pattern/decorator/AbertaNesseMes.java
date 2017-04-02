package br.com.alura.pattern.decorator;

import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.pattern.model.Conta;

public class AbertaNesseMes extends Filtro{
	
	private Month mesAtual;
	private int anoAtual;
			
	public AbertaNesseMes(Month mesAtual, int anoAtual, Filtro proximoFiltro) {
		super(proximoFiltro);
		this.mesAtual=mesAtual;
		this.anoAtual=anoAtual;
	}
	
	public AbertaNesseMes(Month mesAtual, int anoAtual) {
		super();
		this.mesAtual=mesAtual;
		this.anoAtual=anoAtual;
	}	

	@Override
	public List<Conta> filtrar(List<Conta> contas) {
		List<Conta> filtrado = contas.stream().filter(c->{
			Month mes = c.getDataAbertura().getMonth();
			int ano = c.getDataAbertura().getYear();			
			return mes.equals(mesAtual) && ano==anoAtual;
		}).collect(Collectors.toList());		
		System.out.println("Quantidade abertas esse mes: " + filtrado.size());
		return outroFiltro(contas, filtrado);
	}

}
