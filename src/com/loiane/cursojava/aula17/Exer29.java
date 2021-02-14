package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero para achar os numeros primos:");
		int num = scan.nextInt();
		
		System.out.println("Os numeros primos entre 1 e " + num + " sao:");
		
		boolean primo;
		
		for (int i=1; i<=num; i++){
			
			primo = true;
			
			for(int j=2; j<i; j++) {
			if(i % j == 0 ) {
				
				primo = false;
			
				}
			
			}
			
			if(primo) {
				System.out.print(i + " ");
				
			}
		}
		
		scan.close();
	}
}
