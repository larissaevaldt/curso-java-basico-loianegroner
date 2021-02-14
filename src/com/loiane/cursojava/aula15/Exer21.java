package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o numero de litros:");
		double litros = scan.nextDouble();
		
		System.out.println("Entre o tipo do combustivel: (A) Alcool e (G) Gasolina");
		String tipo = scan.next();
		
		double precoGas = 2.5;
		double precoAlc = 1.9;
		int percDesconto = 0;
		double total = 0;
		double totalDesc = 0;
		
		if (tipo.equalsIgnoreCase("A")) {
			if(litros <= 20) {
				percDesconto = 3;	
			} else {
				percDesconto = 5;
			}

		total = litros * precoAlc;
			
		} else if (tipo.equalsIgnoreCase("G")) {
			if(litros <= 20) {
				percDesconto = 4;	
			} else {
				percDesconto = 6;
			}
		
		total = litros * precoGas;
		
		} else {
			System.out.println("Entrada Invalida. Entre apenas A ou G.");
		}
		
		totalDesc = (total / 100) * percDesconto;
		
		double precoAPagar = total - totalDesc;
		
		System.out.println("Valor antes do desconto: " + total);
		System.out.println("Percentual de Desconto: " + percDesconto + "%");
		System.out.println("Total de descontos: " + totalDesc);
		System.out.println("VALOR A SER PAGO: " + precoAPagar);
		
		scan.close();
	}

}
