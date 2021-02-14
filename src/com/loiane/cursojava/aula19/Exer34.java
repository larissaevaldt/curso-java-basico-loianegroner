package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre um numero para a posicao " + i + ":");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println("Analizando o numero " + vetorA[i]);
			
			for(int j=2; j<vetorA[i]; j++) {
				if(j % 2 == 0) {
					System.out.println(j + " e par");
				}
			}
			
			System.out.println();
		}
		
		scan.close();
	}

}
