package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class MetroCentimetro {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre um numero em metros:");
		double metros = scan.nextDouble();
		
		double cm = metros * 100;
		
		System.out.println(metros + " m e igual a " + cm + " cm");
		
		scan.close();
	}

}
