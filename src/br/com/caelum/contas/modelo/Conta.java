package br.com.caelum.contas.modelo;

public abstract class Conta {

	double saldo;
	String titular;
	int numero;
	String agencia;

	public void saca(double valor) {

		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar valor negativo");
		}

		this.saldo -= valor;
	}

	public void deposita(double valor) {

		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar valor negativo");
		}

		this.saldo += valor;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public abstract String getTipo();

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

}
