package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer37 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre um numero para a posicao " + i + ":");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			
			vetorB[i] = 1; //opcional 
			for(int j=1; j<vetorA[i]; j++) {
				vetorB[i] *= j;
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
