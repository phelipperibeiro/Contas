package br.com.caelum.contas.modelo.exception;

public class SaldoInsulficienteException extends RuntimeException {

	public SaldoInsulficienteException(double valor) {
		super("Saldo insulficiente para sacar o valor de:" + valor);
	}
}
