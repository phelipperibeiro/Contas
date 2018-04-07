package br.com.caelum.contas.modelo;

public class Conta {

	double saldo;
	String titular;
	double numero;
	double agencia;

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getNumero() {
		return this.numero;
	}

	public void setNumeror(double numero) {
		this.numero = numero;
	}
	
	public double getAgencia() {
		return this.agencia;
	}

	public void setAgencia(double agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
}
