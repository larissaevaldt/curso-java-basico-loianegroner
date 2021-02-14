package com.loiane.cursojava.aula17;

public class Exer04 {

	public static void main(String[] args) {
		
		int popA = 80000;
		int popB = 200000;
		int count = 0;
		
		while(popA < popB) {
			popA += (popA / 100) * 3;
			popB += (popB / 100) * 1.5;
			count++;
		}

		System.out.println("Populacao A: " + popA);
		System.out.println("Populacao B: " + popB);
		System.out.println("Quantidade de anos: " + count);
	}

}
