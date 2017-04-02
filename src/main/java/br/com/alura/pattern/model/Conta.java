package br.com.alura.pattern.model;

import java.time.LocalDate;

import br.com.alura.pattern.state.conta.EstadoContaCorrente;

/**
 * @author dricci
 *
 */
public class Conta {

	private String titular;
	private Double saldo;
	private Integer numero;
	private Integer agencia;
	private LocalDate dataAbertura;
	
	/**
	 * O ideal é que o estado seja protected e não possua getters e setters, porém para isso
	 *é necessário que o EstadoContaCorrente esteja no mesmo pacote, porém na organização atual do
	 *projeto isso não ocorreu, por isso foi necessário adicionar o getter e o setter, isso abre brecha
	 *para que alguém altere o estado da conta manualmente, o que deve ser evitado.
	 */
	private EstadoContaCorrente estado;

	public Conta(String titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
		if(saldo > 0){			
		}else{
			
		}
	}
	
	public void sacar(double valor){
		this.estado.sacar(valor, this);
	}
	
	public void depositar(double valor){
		this.estado.depositar(valor,this);
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

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + ((dataAbertura == null) ? 0 : dataAbertura.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((saldo == null) ? 0 : saldo.hashCode());
		result = prime * result + ((titular == null) ? 0 : titular.hashCode());
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
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (dataAbertura == null) {
			if (other.dataAbertura != null)
				return false;
		} else if (!dataAbertura.equals(other.dataAbertura))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (saldo == null) {
			if (other.saldo != null)
				return false;
		} else if (!saldo.equals(other.saldo))
			return false;
		if (titular == null) {
			if (other.titular != null)
				return false;
		} else if (!titular.equals(other.titular))
			return false;
		return true;
	}

	public EstadoContaCorrente getEstado() {
		return estado;
	}

	public void setEstado(EstadoContaCorrente estado) {
		this.estado = estado;
	}

}
