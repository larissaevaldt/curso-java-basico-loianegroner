package com.loiane.cursojava.aula17;

public class Exer24 {

	public static void main(String[] args) {
		
		System.out.println("Preco do Pao: R$ 0.18");
		System.out.println("Panificadora Pao de Ontem - Tabela de Precos");
		
		for (int i=1; i<= 50; i++) {
			System.out.println(i + " - R$ " + (0.18 * i));
		}

	}

}
