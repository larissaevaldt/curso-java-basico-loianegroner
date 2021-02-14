package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a sua nota do primeiro bimestre:");
		double nota = scan.nextDouble();
		
		System.out.println("Digite a nota do segundo bimestre");
		double nota2 = scan.nextDouble();
		
		System.out.println("Digite a nota do terceiro bimestre");
		double nota3 = scan.nextDouble();
		
		System.out.println("Digite a nota do quarto bimestre");
		double nota4 = scan.nextDouble();
		
		double media = (nota + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A sua media e: " + (media));
		
		scan.close();
	}

}
