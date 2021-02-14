package com.loiane.cursojava.aula12;

public class LoopWhile {
	
	public static void main(String[] args) {
		
		int i = 1; //count ou cont
		int max = 10;
		
		System.out.println("Contando ate " + max);
		
		while (i <= max) {
			System.out.println("O valor de i: " + i);
			i++;
		}
		
		System.out.println(i);
		
		do {
			i++;
			System.out.println("O valor de i: " + i);
			
		} while (i < 15);
		//Nesse caso mesmo a condicao sendo que i seja menor q 15, e nao menor ou igual, ainda sim 
		//imprimira "o valor de i : 15" pq o do while executa o codigo e dpois avalia a expressao
		// quando o i e 13 ele ve 13 e menor que 15? sim, entao adiciona 1, vira 14, imprime 14. 
		//14 e menor que 15? SIM. Entao adiciona 1, vira 15, imprime 15. 15 e menor que 15? NAO. Parou o loop!
		
		//A principal diferenca do while e do-while e que o while primeira avalia a expressao, 
		//depois executa o codigo e o do-while primeiro executa o codigo e depois avalia a expressao.
	}

}
