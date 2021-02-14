package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		char[][] jogo = new char[3][3];
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;
		while(!ganhou) {
			
			if(jogada % 2 == 1) {
				
				System.out.println("Vez do Jogador 1. Escolha linha e coluna (1-3)");
				sinal = 'X';
				
			} else {
				
				System.out.println("Vez do Jogador 2. Escolha linha e coluna (1-3)");
				sinal = 'O';
				
			}
			
			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("Entre com a linha (1, 2 ou 3)");
				linha = scan.nextInt();
				
				if(linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Linha Invalida. Tente novamente");
				}
			}
			
			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println("Entre com a coluna (1, 2 ou 3)");
				coluna = scan.nextInt();
				
				if(coluna>=1 && coluna<=3) {
					colunaValida = true;
				} else {
					System.out.println("Coluna Invalida. Tente Novamente");
				}
			}
			
			linha--;
			coluna--;
			
			if (jogo[linha][coluna] == 'X' || jogo[linha][coluna] == 'O') {
				System.out.println("Posicao ja usada. Tente Novamente");
			} else {
				jogo[linha][coluna] = sinal;
				jogada++;
			}
			
			//imprimir o tabuleiro
			for (int i=0; i<jogo.length; i++) { 
				for(int j=0; j<jogo[i].length; j++) {
					System.out.print(jogo[i][j] + " | ");
				}
				System.out.println();
			}
			
			//verifica se tem ganhador
			if((jogo[0][0] == 'X' && jogo[0][1] == 'X' && jogo[0][2] == 'X') || //LINHA1
				(jogo[1][0] == 'X' && jogo[1][1] == 'X' && jogo[1][2] == 'X')	|| //LINHA2
				(jogo[2][0] == 'X' && jogo[2][1] == 'X' && jogo[2][2] == 'X') || //LINHA3
				(jogo[0][0] == 'X' && jogo[1][0] == 'X' && jogo[2][0] == 'X') || //COLUNA1
				(jogo[0][1] == 'X' && jogo[1][1] == 'X' && jogo[2][1] == 'X') || //COLUNA2
				(jogo[0][2] == 'X' && jogo[1][2] == 'X' && jogo[2][2] == 'X') || //COLUNA3
				(jogo[0][0] == 'X' && jogo[1][1] == 'X' && jogo[2][2] == 'X') || //DIAGONAL
				(jogo[0][2] == 'X' && jogo[1][1] == 'X' && jogo[2][0] == 'X')) { //DIAGONAL INVERSA
				
				ganhou = true;
				System.out.println("Parabens, jogador 1 ganhou!");
			} else if((jogo[0][0] == 'O' && jogo[0][1] == 'O' && jogo[0][2] == 'O') || //LINHA1
					(jogo[1][0] == 'O' && jogo[1][1] == 'O' && jogo[1][2] == 'O')	|| //LINHA2
					(jogo[2][0] == 'O' && jogo[2][1] == 'O' && jogo[2][2] == 'O') || //LINHA3
					(jogo[0][0] == 'O' && jogo[1][0] == 'O' && jogo[2][0] == 'O') || //COLUNA1
					(jogo[0][1] == 'O' && jogo[1][1] == 'O' && jogo[2][1] == 'O') || //COLUNA2
					(jogo[0][2] == 'O' && jogo[1][2] == 'O' && jogo[2][2] == 'O') || //COLUNA3
					(jogo[0][0] == 'O' && jogo[1][1] == 'O' && jogo[2][2] == 'O') || //DIAGONAL
					(jogo[0][2] == 'O' && jogo[1][1] == 'O' && jogo[2][0] == 'O')) { //DIAGONAL INVERSA
		
				ganhou = true;
				System.out.println("Parabens, jogador 2 ganhou!");
			} else if(jogada > 9) {
				ganhou = true;
				System.out.println("Ninguem ganhou essa partida");
			}
		}
		
		scan.close();

	}

}
