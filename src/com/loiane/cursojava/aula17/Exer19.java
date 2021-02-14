package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre a quantidade de notas: ");
		int qtd = scan.nextInt();
		
		double nota = 0;
		double contagem = 0; 
		
		for(int i=qtd; i>0; i--) {
			System.out.println("Entre com a nota: ");
			nota = scan.nextDouble();
			contagem += nota;
		}
		
		double media = contagem / qtd;
		
		System.out.println("Soma das notas: " + contagem);
		System.out.println("Media aritmetica das notas entradas: " + media);
		
		scan.close();
	}

}
