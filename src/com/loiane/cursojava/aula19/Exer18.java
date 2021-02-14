package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		
		for(int i=0; i<idades.length; i++) {
			System.out.println("Entre com a idade da " + (i+1) + "º pessoa:");
			idades[i] = scan.nextInt();
			}
		
		int maior = idades[0];
		int indexMaior = 0;
		int menor = idades[0];
		int indexMenor = 0;
		
		for(int i=1; i<idades.length; i++) {
			if (idades[i] > maior) {
				indexMaior = i;
				maior = idades[i];
			} else if (idades[i] < menor) {
				indexMenor = i;
				menor = idades[i];
			}
			
		}
		
		System.out.print("Vetor de Idades = ");
		for (int i=0; i<idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		
		System.out.println();
		System.out.println("A maior idade e: " + maior);
		System.out.println("Index da maior idade: " + indexMaior);
		System.out.println("A menor idade e: " + menor);
		System.out.println("Index da menor idade: " + indexMenor);
		
		scan.close();
	}
}
