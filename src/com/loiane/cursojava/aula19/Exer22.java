package com.loiane.cursojava.aula19;

public class Exer22 {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		int qtdZeros = 0;
		int qtdOnes = 0;
		
		for(int i=0; i<numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * 1);
			 
			if (numeros[i] == 0) {
				 qtdZeros+= 1;
			 } else if (numeros[i] == 1) {
				 qtdOnes+= 1;
			 }
		}

		System.out.print("Vetor Numeros Aleatorios = ");
		for (int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		//  10     -  100
		//qtdZeros -   x
		// 10x = qtdZeros * 100
		// x= qtdZeros * 100 / 10
		
		double percZeros = (qtdZeros * 100) / numeros.length;
		double percOnes = (qtdOnes * 100) / numeros.length;
		
		System.out.println();
		System.out.println("Porcentagem de Zeros: " + percZeros + "%");
		System.out.println("Porcentagem de Uns: " + percOnes + "%");
	}

}
