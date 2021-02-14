package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma1 = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o numero da posicao " + i);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 2 == 0) {
				soma1++;
			}
		}
		//vetorA.length     100%
		//qtdimpares         x
		//vetorA.length*x = qtdimpares * 100
		//x= (qtdimpares * 100) / vetorA.length
		
		int pares = (soma1 * 100) / vetorA.length;
		int impares = 100 - pares;
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Porcentagem de pares: " + pares);
		System.out.println("Porcentagem de impares: " + impares);
		
		scan.close();

	}

}
