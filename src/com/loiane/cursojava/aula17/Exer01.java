package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		/*
		
		PRIMEIRO MODA (funciona)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a nota: (0 a 10)");
		double nota = scan.nextDouble();
		
		while (nota > 10) {
			System.out.println("Nota Invalida");
			System.out.println("Entre com a nota: (0 a 10)");
			nota = scan.nextDouble();
		}
		System.out.println("Voce digitou: " + nota);
		
		*/
		
		//SEGUNDO MODO (segundo o video)
		
		Scanner scan = new Scanner(System.in);
		
		boolean valid = false;
		
		do {
			System.out.println("Entre com a nota:");
			double nota = scan.nextDouble();
			
			if (nota > 0 && nota <= 10) {
				valid = true;
				System.out.println("Voce digitou: " + nota);
			} else {
				valid = false;
				System.out.println("Voce digitou uma nota invalida!");
			}
		} while (valid == false);
		
		scan.close();
	}

}
