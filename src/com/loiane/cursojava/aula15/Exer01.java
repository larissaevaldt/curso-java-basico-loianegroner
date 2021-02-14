package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero:");
		double primeiroNumero = scan.nextDouble();
		
		System.out.println("Entre com outro numero:");
		double segundoNumero = scan.nextDouble();
		
		if (primeiroNumero > segundoNumero) {
			System.out.println("O numero maior e o primeiro: " + primeiroNumero);
		} else if (primeiroNumero < segundoNumero) {
			System.out.println("O numero maior e o segundo: " + segundoNumero);
		}
		scan.close();
	
	}

}
