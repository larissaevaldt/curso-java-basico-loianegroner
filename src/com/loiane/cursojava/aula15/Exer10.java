package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exer10 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em que turno voce estuda?");
		System.out.println("Entre M-Matutino, V-Vespertino ou N-Noturno");
		String input = scan.next();
		
		/*
		 * OPCAO IF ELSE
		if (input.equalsIgnoreCase("M")) {
			System.out.println("Bom dia!");
		} else if (input.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde!");
		} else if (input.equalsIgnoreCase("n")) {
			System.out.println("Boa Noite!");
		} else {
			System.out.println("Valor Invalido!");
		}
		*/
		
		// mesma coisa so que com switch
		switch(input) {
		case "m":
		case "M": System.out.println("Bom dia!"); break;
		case "v":
		case "V": System.out.println("Boa tarde!"); break;
		case "n":
		case "N": System.out.println("Boa noite!"); break;
		default: System.out.println("Numero Invalido!");
		}
		
		scan.close();
	}
}
