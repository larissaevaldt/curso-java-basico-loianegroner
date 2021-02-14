package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma = 0;
		int soma1 = 0;
		double media = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o numero da posicao " + i);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 2 != 0) {
				soma1++;
				soma += vetorA[i];
			}
		}
		
		media = soma / soma1;
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Quantidade de elementos impares: " + soma1);
		System.out.println("Media aritmetica: " + media);
		
		scan.close();
	}

}
