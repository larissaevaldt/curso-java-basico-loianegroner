package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		/*    BREAK
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite:");
		int max = scan.nextInt();
		
		//Aqui nos queremos descobrir qual o primeiro multiplo de 7 entre os numeros 
		//entrados pelo usuario. O break e utilizados pq queremos saber so o primeiro
		//para parar o loop quando acharmos o valor procurado. 
		for (int i=num; i<=max; i++) {
			System.out.println(i);
			if (i % 7 == 0) {
				System.out.println("O valor de i e: " + i);
				break;
			}
		}
		*/
		//    CONTINUE
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite:");
		int max = scan.nextInt();
		
		//nesse caso e o oposto, sempre que for multiplo de 7 ele pulara para o 
		//proximo numero sem imprimir, ou seja imprimiremos somente os nao multiplos
		//de 7 entre os numeros entrados pelo usuario
		for (int i=num; i<=max; i++) {
			if (i % 7 == 0) {
				continue;
			}
			
			System.out.println("O valor de i e: " + i);
		}
		
		scan.close();
			
	}

}
