package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual e o seu sexo? (Entre F para feminino ou M para masculino)");
		String sexo = scan.next();
		
		if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Sexo feminino");
		} else if (sexo.equals("M") || sexo.equals("m")) {
			System.out.println("Sexo masculino");
		} else {
			System.out.println("Sexo invalido");
		}
		
		scan.close();

	}

}
