package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o ano:");
		int ano = scan.nextInt();

		boolean bissexto = false;
		
		if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 !=0)) {
			bissexto = true;
			System.out.println("O ano e bissexto!");
		} else {
			bissexto = false;
			System.out.println("Nao e um ano bissexto!");
		}
		
		scan.close();

	}

}
