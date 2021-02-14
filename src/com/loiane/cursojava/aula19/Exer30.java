package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[20];
		int qtdPares = 0;
		int qtdImpar = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um numero para a posicao " + i + ":");
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 == 0) {
				qtdPares++;
			} else if(vetorA[i] % 2 != 0) {
				qtdImpar++;
			}
		}
		
		int[] vetorB = new int[qtdPares];
		int[] vetorC = new int[qtdImpar];
		int posB = 0;
		int posC = 0;
		//criamos um contador para a posicao da array b e c
		for (int i=0; i<vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			} else if(vetorA[i] % 2 != 0) {
				vetorC[posC] = vetorA[i];
				posC++;
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
		
		System.out.println();
		System.out.print("Vetor C = ");
		for(int i=0; i<vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		
		scan.close();
	}

}
