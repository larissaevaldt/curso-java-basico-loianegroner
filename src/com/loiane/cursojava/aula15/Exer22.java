package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de kg de morango:");
		double qtdMorango = scan.nextDouble();
		
		System.out.println("Entre com a quantidade de kg de maca:");
		double qtdMaca = scan.nextDouble();
		
		double precoKgMorango = 0;
		
		if (qtdMorango <= 5) {
			precoKgMorango = 2.5;
		} else if (qtdMorango > 5) {
			precoKgMorango = 2.2;
		}
		
		double precoKgMaca = 0;
		
		if (qtdMaca <= 5) {
			precoKgMaca = 1.8;
		} else if (qtdMaca > 5) {
			precoKgMaca = 1.5;
		}
		
		double totalMorango = qtdMorango * precoKgMorango;
		double totalMaca = qtdMaca * precoKgMaca;
		
		double totalParcial = totalMorango + totalMaca;
		double precoTotal = 0;
		
		if ((qtdMorango + qtdMaca > 8) || totalParcial > 25) {
			precoTotal = totalParcial - ((totalParcial / 100) * 10);
		} 
		else {
			precoTotal = totalParcial;
		}
	
		System.out.println("Preco total = " + precoTotal);
		
		scan.close();
	
	}

	}


