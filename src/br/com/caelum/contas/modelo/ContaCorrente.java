package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	public String getTipo(){
		return "Conta Corrente";
	}
	
	public double getValorImposto(){
		
		return this.getSaldo() * 0.01;
	}

}
