package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero:");
		double primeiroNumero = scan.nextDouble();
		
		System.out.println("Entre com outro numero:");
		double segundoNumero = scan.nextDouble();
		
		System.out.println("Entre com mais um numero:");
		double terceiroNumero = scan.nextDouble();
		
		if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero ) {
			System.out.println("O numero maior e o primeiro: " + primeiroNumero);
		} else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
			System.out.println("O numero maior e o segundo: " + segundoNumero);
		} else if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
			System.out.println("O numero maior e o terceiro: " + terceiroNumero);
		}
		
		scan.close();
	
	}
}
