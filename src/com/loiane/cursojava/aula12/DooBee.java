package com.loiane.cursojava.aula12;

public class DooBee {

	public static void main(String[] args) {
		
		int x = 1;
		while (x < 3) { 
			System.out.print("Doo");
			System.out.print("Bee");
			x = x + 1;
			
		}
		// 3 porque depois de rodar o loop 2 vezes x nao sera mais 1 e sim 3
		if (x == 3) {
			System.out.print("Do");
		}
	}

}
