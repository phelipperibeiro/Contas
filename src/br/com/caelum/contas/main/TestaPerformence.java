package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class TestaPerformence {

	public static void main(String[] args) {
		System.out.println("Iniciando....");
		//Collection<Integer> teste = new ArrayList<>();
		Collection<Integer> teste = new LinkedList<>();
		long inicio = System.currentTimeMillis();

		int total = 300000;

		for (int i = 0; i < total; i++) {
			teste.add(i);
		}

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}

		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("tempo gasto:" + tempo);

	}

}


//Iniciando....
//tempo gasto:133734 arraylist






