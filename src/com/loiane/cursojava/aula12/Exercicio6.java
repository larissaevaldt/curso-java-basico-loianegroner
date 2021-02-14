package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre o raio do circulo:");
		double raio = scan.nextDouble();
		
		//Math.PI e o valor de PI 
		//Nesse caso como a formula e raio elevado a dois poderia se fazer raio * raio 
		//mas usamos a funcao de potencia do java
		double area = Math.PI * Math.pow(raio, 2);
		
		
		//maneira de se fazer SEM formulas:
		// " double area = 3.141592653589793 * (raio * raio); "
		//Essas duas formulas dao exatamente o mesmo resultado!!!!!
		
		System.out.println("A area do circulo e " + area);
		
		scan.close();
	}

}
