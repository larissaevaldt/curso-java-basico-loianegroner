package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] nota1 = new double[10];
		double[] nota2 = new double[nota1.length];
		double[] result = new double[nota1.length];
		
		for (int i=0; i<nota1.length; i++) {
			System.out.println("Entre com a primeira nota do aluno " + (i+1));
			nota1[i] = scan.nextDouble();
			
			System.out.println("Entre com a segunda nota do aluno " + (i+1));
			nota2[i] = scan.nextDouble();
			
			result[i] = (nota1[i] + nota2[i]) / 2;
		}
		
		System.out.println("----------------------------------------------------------");
		System.out.print("Vetor Nota 1 = ");
		for (int i=0; i<nota1.length; i++) {
			System.out.print(nota1[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor Nota 2 = ");
		for (int i=0; i<nota2.length; i++) {
			System.out.print(nota2[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor media = ");
		for (int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.println("Resultados:");
		for (int i=0; i<result.length; i++) {
			if (result[i] < 7) {
				System.out.println("Media aluno " + (i+1) + " = " + result[i] + " - Situacao: REPROVADO");
			} else if (result[i] >= 7) {
				System.out.println("Media aluno " + (i+1) + " = " + result[i] + " - Situacao: APROVADO");
			}
		
		}
		
		scan.close();

	}
}
