package com.loiane.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Entre o valor do dolar:");
		cotacao = scan.nextDouble();
		
		for(int i=0; i<vetorA.length; i++) {
			vetorA[i] = cotacao * (i+1);
		}
		//* (i+1) pq comeca no zero e termina no 19 e nos queremos
		//fazer de 1 a 20
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.println("Vetor A:");
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Valor " + (i+1) + " dolar = " + df.format(vetorA[i]));
		}
		
		scan.close();
	}

}
