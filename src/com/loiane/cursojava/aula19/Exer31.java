package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int qtdPares = 0; //contar quantos pares para usar como posicao de inicio dos impares
		int posB = 0;
		//Loop para pedir os numeros e contar quantos pares
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um numero para a posicao " + i + ":");
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 == 0) {
				qtdPares++;
			}
		}
		//loop verifica se e par e
		for (int i=0; i<vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
				//posB comeca com zero, cada vez que o loop roda acrescenta um
				//ou seja, proxima vez que rodar posB sera um, e na proxima dois
				//que e o que nos queremos, que b comece com todos os numeros pares de a
			} else if (vetorA[i] % 2 != 0) {
				vetorB[qtdPares] = vetorA[i];
				qtdPares++;
				//aqui a posicao comeca com a quantidade de pares pq suponhamos
				//que tenha 10 pares, os pares estarao de 0 a 9, e a posicao 10 ja 
				//deve ser impar
			}
			
		}
		//imprimindo as arrays na tela
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
