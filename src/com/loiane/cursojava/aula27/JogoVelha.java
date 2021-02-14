package com.loiane.cursojava.aula27;

public class JogoVelha {
	
	char[][] jogo = new char[3][3];
	int jogada = 1;
	
	boolean validarJogada(int linha, int coluna, char sinal) {
		
		if (jogo[linha][coluna] == sinal || jogo[linha][coluna] == 'O') {
			return false;
		} else {
			jogo[linha][coluna] = sinal;
			jogada++;
			return true;
		}
	}
	
	void imprimirTabuleiro() {
		// imprimir o tabuleiro
		for (int i = 0; i < jogo.length; i++) {
			for (int j = 0; j < jogo[i].length; j++) {
				System.out.print(jogo[i][j] + " | ");
			}
			System.out.println();
		}
	}
	
	boolean verificarGanhador(char sinal) {
		if((jogo[0][0] == sinal && jogo[0][1] == sinal && jogo[0][2] == sinal) || //LINHA1
				(jogo[1][0] == sinal && jogo[1][1] == sinal && jogo[1][2] == sinal)	|| //LINHA2
				(jogo[2][0] == sinal && jogo[2][1] == sinal && jogo[2][2] == sinal) || //LINHA3
				(jogo[0][0] == sinal && jogo[1][0] == sinal && jogo[2][0] == sinal) || //COLUNA1
				(jogo[0][1] == sinal && jogo[1][1] == sinal && jogo[2][1] == sinal) || //COLUNA2
				(jogo[0][2] == sinal && jogo[1][2] == sinal && jogo[2][2] == sinal) || //COLUNA3
				(jogo[0][0] == sinal && jogo[1][1] == sinal && jogo[2][2] == sinal) || //DIAGONAL
				(jogo[0][2] == sinal && jogo[1][1] == sinal && jogo[2][0] == sinal)) { //DIAGONAL INVERSA
				
				return true;
		}	
			return false;
		}
	
	boolean vezJogador1() {
		
		if(jogada % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}
}
