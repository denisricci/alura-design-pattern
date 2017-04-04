package br.com.alura.pattern.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.alura.pattern.observer.AcaoAposGerarNota;

public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double imposto;
	private Calendar dataEmissao;
	private List<ItemDaNota> todosOsItens = new ArrayList<>();
	private String observacao;
	
	private List<AcaoAposGerarNota> acoes;
	
	public NotaFiscalBuilder aposContruirExecutar(AcaoAposGerarNota acao){
		if(acoes==null) acoes=new ArrayList<>();
		this.acoes.add(acao);
		return this;
	}
	
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial){
		this.razaoSocial=razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj){
		this.cnpj=cnpj;
		return this;
	}
	
	public NotaFiscalBuilder com(ItemDaNota item){
		this.valorBruto+=item.getValor();
		this.imposto+=item.getValor() * 0.05d;
		this.todosOsItens.add(item);
		return this;
	}
	
	public NotaFiscalBuilder naDataAtual(){
		this.dataEmissao=Calendar.getInstance();
		return this;
	} 
	
	public NotaFiscalBuilder comObeservacao(String observacao){
		this.observacao=observacao;
		return this;		
	}
	
	public NotaFiscal build(){
		NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, valorBruto, imposto, dataEmissao, todosOsItens, observacao);
		acoes.stream().forEach(a->a.executa(notaFiscal));		
		return notaFiscal; 
	}				
}
