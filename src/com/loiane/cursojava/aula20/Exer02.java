package com.loiane.cursojava.aula20;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {

		int[][] matriz = new int[10][10];
		Random gerador = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = gerador.nextInt(100);
			}
		}

		// imprimindo a matriz
		System.out.println("Output da matriz 10x10:");
		for (int i = 0; i < matriz.length; i++) {
			// System.out.print(notasAlunos[i] + " ");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " - ");
			}

			System.out.println();
		}

		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[5][j] > maior) {
					maior = matriz[5][j];
				}
				if (matriz[5][j] < menor) {
					menor = matriz[5][j];
				}
			}
		}
		System.out.println("Maior valor da linha 5 = " + maior);
		System.out.println("Menor valor da linha 5 = " + menor);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][7] > maior) {
					maior = matriz[i][7];
				}
				if (matriz[i][7] < menor) {
					menor = matriz[i][7];
				}
			}
		}
		System.out.println("Maior valor da coluna 7 = " + maior);
		System.out.println("Menor valor da coluna 7 = " + menor);
	}
}
