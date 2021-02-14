package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um numero:");
		double numero = scan.nextDouble();

		if (numero % 2 == 0) {
			System.out.println("O numero e par!");
		} else {
			System.out.println("O numero e impar!");
		}
		
		scan.close();
	}

}
