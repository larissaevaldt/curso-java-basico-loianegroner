package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma = 0;
		int soma2 = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o numero da posicao " + i);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 5 == 0) {
				soma++;
				soma2 += vetorA[i];
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Quantidade de multiplos de 5: " + soma);
		System.out.println("Soma dos multiplos de 5: " + soma2);
		
		scan.close();

	}

}
