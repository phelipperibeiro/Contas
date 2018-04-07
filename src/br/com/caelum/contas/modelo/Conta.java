package br.com.caelum.contas.modelo;

public class Conta {

	double saldo;
	double titular;
	double numero;
	double agencia;

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getTitular() {
		return this.titular;
	}

	public void setTitular(double titular) {
		this.titular = titular;
	}

}
