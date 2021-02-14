package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre um numero (1-7) para saber o dia da semana correspondente: ");
		int numero = scan.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terca-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Voce entrou um numero invalido");
		}
		
		scan.close();

	}

}
