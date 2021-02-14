package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numeros[] = new int[10];
		boolean par = true;
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Entre com um numero para a posicao " + i + ":");
			numeros[i] = scan.nextInt();
			
		}
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println(i);
			if (numeros[i] % 2 == 0) {
				par = true;
			} else {
				par = false;
				System.out.println("Nao e tudo par.");
				break;
			}
			
		}
		
		scan.close();

	}

}
