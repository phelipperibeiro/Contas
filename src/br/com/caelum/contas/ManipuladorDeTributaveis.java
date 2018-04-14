package br.com.caelum.contas;

import br.com.caelum.javafx.api.util.*;
import br.com.caelum.contas.modelo.Tributavel;

public class ManipuladorDeTributaveis {
	
	private double total;

	public void calculaImpostos(Evento evento){
		
		this.total = 0;
		
		int tamanho = evento.getTamanhoDaLista("listaTributaveis");
		
		for (int i = 0; i < tamanho; i++){
			Tributavel t = evento.getTributavel("listaTributaveis", i);
			this.total += t.getValorImposto();
			
		}
	}
	
	public double getTotal(){
		return this.total;
	}
	
}
