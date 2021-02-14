package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer11 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		int sum = 0;
		
		System.out.println("Entre com o primeiro numero: ");
		num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		num2 = scan.nextInt();
		
		System.out.println("Esses sao todos os numeros inteiros existentes entre os numeros entrados: ");
		for(int i = num1; i <= num2; i++) {
			System.out.println(i);
			sum += i;
		}
		
		//sum = num1 + num2;
		//System.out.println("A soma dos dois numeros entrados e: " + sum);
		
		System.out.println("A soma de todos os numeros e: " + sum);
		
		scan.close();
	}


}
