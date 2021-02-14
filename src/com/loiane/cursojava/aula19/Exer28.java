package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetor1 = new int[10];
		int[] vetor2 = new int[vetor1.length];
		
		for(int i = 0; i<vetor1.length; i++) {
			System.out.println("Entre com o numero da posicao " + i + " do vetor 1:");
			vetor1[i] = scan.nextInt();
		}
		
		for(int i = 0; i<vetor1.length; i++) {
			vetor2[i] = vetor1[vetor1.length - 1 - i];
			//o vetor 2 sera igual a posicao (10 - 1 = 9). Menos i pq senao sera
			//sempre 9. 
		}
		
		System.out.print("Vetor 1 = ");
		for(int i=0; i<vetor1.length; i++) {
			System.out.print(vetor1[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor 2 = ");
		for(int i=0; i<vetor2.length; i++) {
			System.out.print(vetor2[i] + " ");
		}
		
		scan.close();

	}

}
