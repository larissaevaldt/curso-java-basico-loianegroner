package com.loiane.cursojava.aula33;

import java.util.Scanner;

public class TesteJogoVelha {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		JogoVelha jogoVelha = new JogoVelha();
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;
		
		while(!ganhou) {
			if(jogoVelha.vezJogador1()) {
				
				System.out.println("Vez do Jogador 1. Escolha linha e coluna (1-3)");
				sinal = 'X';
				
			} else {
				
				System.out.println("Vez do Jogador 2. Escolha linha e coluna (1-3)");
				sinal = 'O';
				
			}
			
			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);
			
			if (!jogoVelha.validarJogada(linha, coluna, sinal)) {
				System.out.println("Posicao ja usada. Tente Novamente");
			}
			
			jogoVelha.imprimirTabuleiro();
			
			if (jogoVelha.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Parabens, jogador 1 ganhou!");
			} else if (jogoVelha.verificarGanhador('O')) {
				ganhou = true;
				System.out.println("Parabens, jogador 2 ganhou!");
			} else if(jogoVelha.getJogada() > 9) {
				ganhou = true;
				System.out.println("Ninguem ganhou essa partida");
			}
		}

	}
	
	static int valor (String tipoValor, Scanner scan) {
		int valor = 0;
		boolean valorValido = false;
		
		while (!valorValido) {
			System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
			valor = scan.nextInt();
			
			if(valor >= 1 && valor <= 3) {
				valorValido = true;
			} else {
				System.out.println("Entrada Invalida. Tente novamente");
			}
		}
		valor--;
		return valor;
	}

}
