package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um numero inteiro:");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for (int i=2; i<num; i++){
			if(num % i == 0) {
				System.out.println("Nao e primo - divisivel por: " + i);
				primo = false;
			}
		}
		
		if(primo) {
			System.out.println("E numero primo");
		}

		scan.close();
	}

}
