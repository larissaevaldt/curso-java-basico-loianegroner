package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
		System.out.println("Enter com o numero " + (i+1));
		vetorA[i] = scan.nextInt();
		vetorB[i] = vetorA[i];
		}
		
		//para imprimir todos os valores da array podemos usar um loop for:
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
		    System.out.print(vetorA[i] + " ");
				
				}		
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i<vetorB.length; i++) {
		    System.out.print(vetorB[i] + " ");
				
		}
		
		scan.close();

	}

}
