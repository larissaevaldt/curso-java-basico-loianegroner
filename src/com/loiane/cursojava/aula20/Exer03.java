package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrizM = new int[3][3];

		for (int i = 0; i < matrizM.length; i++) {
			// outro for para poder iterar as colunas
			for (int j = 0; j < matrizM[i].length; j++) {
				System.out.println("Entre com um valor para a posicao [" + i + ", " + j + "]");
				matrizM[i][j] = scan.nextInt();
			}
		}

		int qtdPares = 0;
		int qtdImpares = 0;

		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				if (matrizM[i][j] % 2 == 0) {
					qtdPares++;
				} else {
					qtdImpares++;
				}
			}
		}

		// imprimindo a matriz para vermos se funcionou
		System.out.println("Output Matriz 3x3:");
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				// imprimi na mesma linha, o espaco p nao ficar todos grudados
				System.out.print(matrizM[i][j] + " ");
			}
			System.out.println();
			// p depois que imprimir todos os valores da linha 1, pular de linha
			// sem isso ficaria tudo numa linha so.
		}

		System.out.println("Quantidade de Pares: " + qtdPares);
		System.out.println("Quantidade de Impares: " + qtdImpares);
		
		scan.close();
	}

}
