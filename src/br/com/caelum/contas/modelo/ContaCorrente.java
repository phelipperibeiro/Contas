package br.com.caelum.contas.modelo;

import br.com.caelum.contas.modelo.exception.*;

public class ContaCorrente extends Conta implements Tributavel {
	
	public String getTipo(){
		return "Conta Corrente";
	}
	
	public double getValorImposto(){
		
		return this.getSaldo() * 0.01;
	}
	
	public void saca(double valor) {

		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar valor negativo");
		}
		
		if (this.saldo < valor) {
			throw new SaldoInsulficienteException(valor);
		}

		this.saldo -= valor;
	}

}
