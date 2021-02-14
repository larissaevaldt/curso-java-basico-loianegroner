package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de CDs comprados: ");
		int qtd = scan.nextInt();
		
		double valor;
		double soma = 0;
		
		for(int i=1; i <= qtd; i++) {
		
			System.out.println("Entre com a quantidade o valor do CD " + i + ":");
			valor = scan.nextDouble();
			
			soma += valor;
		}
		
		double media = soma / qtd;
		
		System.out.println("O valor total investido: " + soma);
		System.out.println("Valor medio gasto em cada CD: " + media);
		
		scan.close();
	}
}
