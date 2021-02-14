package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a quantidade de pessoas entrevistadas:");
		int qtdEntrevistados = scan.nextInt();
		
		String nomesFilhos[][] = new String[qtdEntrevistados][];
		
		for(int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Ente a quantidade de filhos da pessoa " + (i+1) + ":");
			int qtdFilhos = scan.nextInt();
			nomesFilhos[i] = new String[qtdFilhos];
			//aqui estamos criando as colunas da array
			//cada linha tera a quantidade de colunas igual a qtd de filhos
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println("Entre o nome do filho " + (j+1) + ":");
				nomesFilhos[i][j] = scan.next();
			}
		}
		
		for(int i=0; i<nomesFilhos.length; i++) {
			
			System.out.println("Pessoa " + (i+1) + " tem " + nomesFilhos[i].length + " filhos." );
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}
		//imprimindo a matriz para ver como ficou
		System.out.println();
		System.out.println("Output da matriz de nome dos filhos:");
		for (int i=0; i<nomesFilhos.length; i++){
			//System.out.print(notasAlunos[i] + " ");
			for (int j=0; j<nomesFilhos[i].length; j++){
				System.out.print(nomesFilhos[i][j] + " - ");
			}
			System.out.println();
		}
		
		scan.close();

	}

}
