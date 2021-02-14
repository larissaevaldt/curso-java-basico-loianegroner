package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer30 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero, inicio, fim, resultado;
		
		System.out.println("Montar a tabuada de:");
		numero = scan.nextInt();
		
		System.out.println("Comecar por:");
		inicio = scan.nextInt();
		
		System.out.println("Terminar em:");
		fim = scan.nextInt();
		
		if(inicio < fim) {
		System.out.println("Vou montar a tabuada de " + numero + " comecando em " + inicio + " e terminando em " + fim + ":");
		
		for (int i=inicio; i<=fim; i++) {
				resultado = numero * i;
				System.out.println(numero + " * " + i + " = " + resultado);
			 }
		}
		
		else {
			System.out.println("O numero de inicio nao pode ser menor que o numero final.");
			
		}
		
		scan.close();
	}

}
