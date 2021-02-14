package com.loiane.cursojava.aula20;

import java.util.Random;

public class Exer01 {

	public static void main(String[] args) {

		int[][] matriz = new int[4][4];
		Random gerador = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = gerador.nextInt(10);
			}
		}

		// imprimindo a matriz
		System.out.println("Output da matriz 4x4:");
		for (int i = 0; i < matriz.length; i++) {
			// System.out.print(notasAlunos[i] + " ");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " - ");
			}

			System.out.println();
		}
		
		int maior = Integer.MIN_VALUE;
		int linha = 0;
		int col = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] > maior) {
					maior = matriz[i][j];
					linha = i;
					col = j;
				}
			}
		}
		
		System.out.println("Maior valor = " + maior);
		System.out.println("Linha = " + linha);
		System.out.println("Coluna = " + col);
		
	}

}
