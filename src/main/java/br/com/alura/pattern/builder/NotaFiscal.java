package br.com.alura.pattern.builder;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
		
	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double imposto;
	private Calendar dataEmissao;
	private List<ItemDaNota> itens;
	private String observacao;
	
	public NotaFiscal(String razaoSocial, String cnpj, double valorBruto, double imposto, Calendar dataEmissao,
			List<ItemDaNota> item, String observacao) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.valorBruto = valorBruto;
		this.imposto = imposto;
		this.dataEmissao = dataEmissao;
		this.itens = item;
		this.observacao = observacao;
	}
	
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public double getValorBruto() {
		return valorBruto;
	}
	public double getImposto() {
		return imposto;
	}
	public Calendar getDataEmissao() {
		return dataEmissao;
	}
	public List<ItemDaNota> getItens() {
		return itens;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public void setItens(List<ItemDaNota> item) {
		this.itens = item;
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}   
    