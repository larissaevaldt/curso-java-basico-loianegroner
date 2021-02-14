package com.loiane.cursojava.aula17;

public class Exer23 {

	public static void main(String[] args) {
		
		System.out.println("Lojas Quase Dois - Tabela de Precos");
		
		/*
		  PRIMEIRO MODO
		 
		float valor = 1.99f;
		
		for (int i=1; i<= 50; i++) {
			
			System.out.printf(i + " - R$ %.2f \n", valor );
			
			valor += 1.99;
		}
		
		*/
		
		//Ou, de forma mais, simples como mostrado na correcao:
		for (int i=1; i<= 50; i++) {
			System.out.println(i + " - R$ " + (1.99 * i));
		}
	}

}
