package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o numero da posicao " + i);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 2 == 0) {
				soma += 1;
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Quantidade de elementos pares: " + soma);
		
		scan.close();
	}
}
