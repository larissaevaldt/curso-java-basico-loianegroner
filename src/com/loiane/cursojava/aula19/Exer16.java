package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int menores15 = 0, iguais15 = 0, somaMaior15 = 0, qtdMaior15 = 0; 
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o numero da posicao " + i);
			vetorA[i] = scan.nextInt();
			 
			if(vetorA[i] < 15) {
				menores15 += vetorA[i];
			}
			
			else if (vetorA[i] == 15) {
				iguais15 += 1;
			}
			
			else if (vetorA[i] > 15) {
				qtdMaior15++;
				somaMaior15 += vetorA[i];
			}

		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		double media = somaMaior15 / qtdMaior15;
		System.out.println();
		System.out.println("Soma dos elementos menores que 15: " + menores15);
		System.out.println("Quantidade de elementos iguais a 15: " + iguais15);
		System.out.println("Media dos numeros maiores que 15: " + media);
		
		scan.close();

	}
}