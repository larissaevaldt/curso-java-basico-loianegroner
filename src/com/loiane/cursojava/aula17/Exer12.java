package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ente com um numero para gerar a tabuada:");
		int num = scan.nextInt();
		
		
		//if (num > 0 && num <= 10) {
			System.out.println("Tabuada de " + num + ":");
			for (int i=1; i<=10; i++) {
				System.out.println(num + " x " + i + " = " + (num * i));
				
			}
			
		//} else {
		//	System.out.println("Numero Invalido.");
		//}
			
		scan.close();

	}

}
