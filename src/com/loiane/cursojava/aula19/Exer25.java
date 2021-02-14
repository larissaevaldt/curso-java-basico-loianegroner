package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o numero da posicao " + i + ":");
			vetorA[i] = scan.nextInt();
			/*esse e um modo de fazer com if - else
			
			if(vetorA[i] % 2 == 0) {
				vetorB[i] = 1;
			} else {
				vetorB[i] = 0;
			}
			*/
			
			//Ou podemos usar operador ternario que e como se fosse um if
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
			//Estamos checando se vetorA[i] e par, se a expressao entre parenteses e verdadeira
			//vetorB[i] recebe um, se nao recebe 0.
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor B = ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		
		scan.close();
	}

}
