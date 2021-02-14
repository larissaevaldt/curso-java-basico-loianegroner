package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota:");
		double primeiraNota = scan.nextDouble();
		
		System.out.println("Entre com a segunda nota");
		double segundaNota = scan.nextDouble();
		
		double media = (primeiraNota + segundaNota) / 2;
		System.out.println(media);
		
		if (media >= 7 && media < 10) {
			System.out.println("Aprovado!");
		} else if (media < 7) {
			System.out.println("Reprovado!");
		} else if (media == 10) {
			System.out.println("Aprovado com distincao!");
		}
		
		scan.close();

	}

}
