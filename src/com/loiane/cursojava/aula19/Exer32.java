package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int resultado = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um numero para a posicao " + i + ":");
			vetorA[i] = scan.nextInt();
		}
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Tabuada de " + vetorA[i] + ":");
			
			for(int j=0; j<10; j++) {
				resultado = vetorA[i] * (j+1);
				System.out.println(vetorA[i] + " * " + (j+1) + " = " + resultado);
				
			}	
		}
		
		scan.close();

	}

}
