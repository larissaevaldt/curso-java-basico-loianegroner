package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i);
		    vetorA[i] = scan.nextInt();
		    soma += vetorA[i];
		}
		
		//imprimindo os valores
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Soma dos elementos: " + soma);
		
		scan.close();
	}

}


