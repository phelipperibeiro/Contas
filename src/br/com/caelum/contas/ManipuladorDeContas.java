package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	
	Conta conta;
	
	public void criaConta(Evento evento) { 
		this.conta = new Conta();
		this.conta.setTitular("Felipe Ribeiro");
		this.conta.setAgencia(2345678);
		this.conta.setNumeror(987654321);
	}
	
	public void deposita(Evento evento) {
		double valorDepositado = evento.getDouble("valor");
		this.conta.deposita(valorDepositado);		
	}
	
	public void saca(Evento evento) {
		double valorDepositado = evento.getDouble("valor");
		this.conta.saca(valorDepositado);		
	}

}
