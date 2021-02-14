package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Enter a number for position " + i + ":");
			vetorA[i] = scan.nextInt();
		}
		
		boolean primo;
		String msg = "";
		
		for(int i=0; i<vetorA.length; i++) {
			primo = true;
			for(int j=2; j<vetorA[i]; j++) {
				if ((vetorA[i] == 1) || (vetorA[i] % j == 0)) {
					primo = false;
					break;
				}
				
			}
		
			if (primo) {
				msg = "Primo";
			} else {
				msg = "Nao e primo";
			}
			
			System.out.println("Posicao " + i + " = " + vetorA[i] + " - " + msg);
			

		}
		scan.close();
	}
}
