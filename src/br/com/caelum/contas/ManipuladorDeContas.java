package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	
	Conta conta;
	
	public void criaConta(Evento evento) { 
		
		String tipo = evento.getSelecionadoNoRadio("tipo");
		
		if(tipo.equals("Conta Corrente")){
			this.conta = new ContaCorrente();
		}
		
		if(tipo.equals("Conta Poupança")){
			this.conta = new ContaPoupanca();
		}
		
		//this.conta.setTitular(evento.getString("titular"));

		//this.conta.setAgencia(evento.getString("agencia"));

		//this.conta.setNumero(evento.getInt("numero"));
		
        this.conta.setTitular("felipe");
		
		this.conta.setAgencia("213516");
		
		this.conta.setNumero(456);
	}
	
	public void deposita(Evento evento) {
		double valorDepositado = evento.getDouble("valorOperacao");
		this.conta.deposita(valorDepositado);		
	}
	
	public void saca(Evento evento) {
		
		double valorDepositado = evento.getDouble("valorOperacao");
		
		if(this.conta.getTipo().equals("Conta Corrente")){
			this.conta.saca(valorDepositado + 0.10);
		}
		
		if(this.conta.getTipo().equals("Conta Poupanca")){
			this.conta.saca(valorDepositado);
		}				
	}
	
	public void transfere(Evento evento){
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		conta.transfere(evento.getDouble("valorTransferencia"), destino);		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
