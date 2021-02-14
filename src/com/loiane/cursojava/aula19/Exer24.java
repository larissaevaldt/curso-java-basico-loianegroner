package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] palindromos = new int[10];
		
		for(int i=0; i<palindromos.length; i++) {
			System.out.println("Entre com um numero para a posicao " + i + ":");
			palindromos[i] = scan.nextInt();
			
		}
		
		boolean palindromo = true;
		
		for(int i=0; i<(palindromos.length / 2); i++) {
			if(palindromos[i] != palindromos[palindromos.length - 1 - i]) {
				palindromo = false;
				break;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i<palindromos.length; i++) {
			System.out.print(palindromos[i] + " ");
		}
		
		System.out.println();
		if(palindromo) {
			System.out.println("Palindromo");
		} else {
			System.out.println("Nao e palindromo");
		}
		
		scan.close();
	}

}
