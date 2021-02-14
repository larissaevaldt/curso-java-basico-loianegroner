package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero:");
		double numero1 = scan.nextDouble();

		System.out.println("Entre com o segundo numero:");
		double numero2 = scan.nextDouble();

		System.out.println("Entre qual operacao voce gostaria de fazer: (1,2,3 ou 4)");
		System.out.println("1) SOMA");
		System.out.println("2) SUBTRACAO");
		System.out.println("3) MULTIPLICACAO");
		System.out.println("4) DIVISAO");

		int input = scan.nextInt();

		double resultado = 0;
		switch (input) {
		case 1:
			resultado = numero1 + numero2;
			break;
		case 2:
			resultado = numero1 - numero2;
			break;
		case 3:
			resultado = numero1 * numero2;
			break;
		case 4:
			resultado = numero1 / numero2;
			break;
		default:
			System.out.println("Voce entrou um numero invalido");
		}

		System.out.println("O resultado e: " + resultado);

		if (resultado % 2 == 0) {
			System.out.println("Numero par!");
		} else {
			System.out.println("Numero impar!");
		}

		if (resultado >= 0) {
			System.out.println("Numero positivo!");
		} else {
			System.out.println("Numero negativo!");
		}
		
		scan.close();
	}

}
