package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de pessoas na turma:");
		int qtd = scan.nextInt();
		
		int idade = 0;
		int contagem = 0;
		
		for (int i=0; i<qtd; i++) {
			System.out.println("Entre a idade do aluno " + (i+1));
			idade = scan.nextInt();
			contagem += idade;
		}

		double media = contagem / qtd;
		
		System.out.println("Media de idade: " + media);
		
		if(media >= 0 && media <= 25) {
			System.out.println("A turma e jovem!");
		}
		else if(media >= 26 && media <= 60) {
			System.out.println("A turma e adulta!");
		} else if(media > 60) {
			System.out.println("A turma e idosa!");
		}
		
		scan.close();
	}

}
