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




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((dataEmissao == null) ? 0 : dataEmissao.hashCode());
		long temp;
		temp = Double.doubleToLongBits(imposto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((itens == null) ? 0 : itens.hashCode());
		result = prime * result + ((observacao == null) ? 0 : observacao.hashCode());
		result = prime * result + ((razaoSocial == null) ? 0 : razaoSocial.hashCode());
		temp = Double.doubleToLongBits(valorBruto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotaFiscal other = (NotaFiscal) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (dataEmissao == null) {
			if (other.dataEmissao != null)
				return false;
		} else if (!dataEmissao.equals(other.dataEmissao))
			return false;
		if (Double.doubleToLongBits(imposto) != Double.doubleToLongBits(other.imposto))
			return false;
		if (itens == null) {
			if (other.itens != null)
				return false;
		} else if (!itens.equals(other.itens))
			return false;
		if (observacao == null) {
			if (other.observacao != null)
				return false;
		} else if (!observacao.equals(other.observacao))
			return false;
		if (razaoSocial == null) {
			if (other.razaoSocial != null)
				return false;
		} else if (!razaoSocial.equals(other.razaoSocial))
			return false;
		if (Double.doubleToLongBits(valorBruto) != Double.doubleToLongBits(other.valorBruto))
			return false;
		return true;
	}
	
}   
    