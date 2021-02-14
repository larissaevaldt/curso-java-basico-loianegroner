package com.loiane.cursojava.aula20;

import java.util.Random;

public class Exer02again {

	public static void main(String[] args) {
		
		int[][] numerosAleatorios = new int[10][10];
		Random gerador = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = gerador.nextInt(100);
			}
		}

		// imprimindo a matriz
		System.out.println("Output da matriz 10x10:");
		for (int i = 0; i < numerosAleatorios.length; i++) {
			// System.out.print(notasAlunos[i] + " ");
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " - ");
			}

			System.out.println();
		}
		
		int maiorL5 =0;
		int menorL5 = 101; //valor max e 100, 1º nº sera menor que 101 com certeza 
		//so para ficar mais bonito
		int linha5 = 5;
		//numerosAleatorios[5].length pra pegar todos os valores da linha 5
		for (int i = 0; i < numerosAleatorios[linha5].length; i++) {
			if(numerosAleatorios[linha5][i] > maiorL5) {
				maiorL5 = numerosAleatorios[linha5][i];
			}
			if(numerosAleatorios[linha5][i] < menorL5) {
				menorL5 = numerosAleatorios[linha5][i];
			}
		}
		
		System.out.println("Maior valor da linha 5: " + maiorL5);
		System.out.println("Menor valor da linha 5: " + menorL5);
		
		//como estamos trabalhando com uma matriz regular, ou seja,
		//mesma quantidade de linhas e colunas nao da erro
		//o problema comeca quando e uma matriz irregular
		
		int maiorC7 =0;
		int menorC7 = 101; //pq sabemos que o valor max e 100
		int col7 = 7;
		
		for(int i=0; i<numerosAleatorios.length; i++) {
		//aqui agora nos estamos passendo pelas linhas entao o i vai ser
		//no primeiro colchete, e o segundo colchete e que tem o valor fixo!
			if(numerosAleatorios[i][col7] > maiorC7) {
				maiorC7 = numerosAleatorios[i][col7];
			}
			if(numerosAleatorios[i][col7] < menorC7) {
				menorC7 = numerosAleatorios[i][col7];
			}
		}
		
		System.out.println("Maior valor da coluna 7: " + maiorC7);
		System.out.println("Menor valor da coluna 7: " + menorC7);
		
		
		

	}

}
