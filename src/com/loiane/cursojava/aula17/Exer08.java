package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		double media;
		int sum = 0;
		
		for (int i=0; i < 5; i++) {
			System.out.println("Entre com um numero: ");
			num = scan.nextInt();
			
			//adicionar na soma o valor de numero
			sum += num;
			}
		
		media = sum / 5;
		
		System.out.println("A soma dos numeros entrados e: " + sum);
		System.out.println("A media dos numeros entrados e: " + media);
		
		scan.close();
	}

}
