package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exer14 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota parcial:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a segunda nota parcial:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		String conceito = "";
		if (media >= 9 && media <=10) {
			conceito = "A";
		} else if (media >= 7.5 && media < 9) {
			conceito = "B";
		} else if (media >= 6 && media < 7.5) {
			conceito = "C";
		} else if (media >= 4 && media < 6) {
			conceito = "D";
		} else if (media >= 0 && media < 4) {
			conceito = "E";
		} else {
			System.out.println("Nota invalida");
		}
		
		String resultado = "";
		if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
			resultado = "APROVADO";
		} else if (conceito.equals("D") || conceito.equals("E")) {
			resultado = "REPROVADO";
		}
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Media: " + media);
		System.out.println("Conceito: " + conceito);
		System.out.println("Resultado Final: " + resultado);
		
		scan.close();
	}		
}