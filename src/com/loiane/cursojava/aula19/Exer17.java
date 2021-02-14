package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] idades = new int[10];
		int soma = 0;
		
		for(int i=0; i<idades.length; i++) {
			System.out.println("Entre com a idade da pessoa " + (i+1) + ":");
			idades[i] = scan.nextInt();
			
			if(idades[i] > 35) {
				soma++;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i<idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		System.out.println();
		System.out.println("Quantidade de pessoas com idade superior a 35 anos: " + soma);
		
		scan.close();

	}

}
