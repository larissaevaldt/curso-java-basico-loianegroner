package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		int num2 = scan.nextInt();
		
		System.out.println("Esses sao todos os numeros inteiros existentes entre os numeros entrados: ");
		for(int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
		
		scan.close();

	}

}
