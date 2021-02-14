package com.loiane.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 0;
		int max = 10;
		
		System.out.println("Contando ate " + max);
		
		while (i <= max) {
			System.out.println("Valor de i: " + i);
			i++; // i = i + 1; ou i += 1;
		}
		// O while e simplesmente isso, enquanto a expressao dentro do parenteses for
		// verdadeira, executamos o codigo dentro dos brackets, se for falsa nao 
		// executa e passa para o resto do programa.
		
		System.out.println(i); //i igual a 11
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
			
		} while (i < 11);

		System.out.println(i);
		
		//Diferenca crucial entre o while e "do while" e, o while avalia a expressao primeiro. 
		//Se a expressao for verdadeira o codigo e executado. O do while primeiro executa
		// e depois avalia a expressao
	}

}
