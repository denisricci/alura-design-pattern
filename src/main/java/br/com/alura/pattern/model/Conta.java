package br.com.alura.pattern.model;

public class Conta {

	private String titular;
	private Double saldo;
	private Integer numero;
	private Integer agencia;

	public Conta(String titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

}
