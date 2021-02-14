package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		char[] vetorB = new char[vetorA.length];
		//Curiosidade: se deixarmos vetorB como array de int
		//o java nao imprime as letras, ele vai pegar e imprimir o valor
		//correspondente daquela letra da tabela ascii
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o numero da posicao " + i + ":");
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] < 7) {
				vetorB[i] = 'a';
			} else if(vetorA[i] == 7) {
				vetorB[i] = 'b';
			} else if(vetorA[i] > 7 && vetorA[i] < 10 ) {
				vetorB[i] = 'c';
			} else if(vetorA[i] == 10 ) {
				vetorB[i] = 'd';
			} else if(vetorA[i] > 10 ) {
				vetorB[i] = 'e';
			}
			
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor B = ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		scan.close();
	}

}
