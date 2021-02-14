package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exer20 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Responda com S para SIM ou N para NAO");
		System.out.println("Telefonou para a vitima?");
		String resp1 = scan.next();
		
		System.out.println("Esteve no local do crime?");
		String resp2 = scan.next();
		
		System.out.println("Mora perto da vitima?");
		String resp3 = scan.next();
		
		System.out.println("Devia para a vitima?");
		String resp4 = scan.next();
		
		System.out.println("Ja trabalhou com a vitima?");
		String resp5 = scan.next();
		
		boolean valid = false;
		
		if ((resp1.equalsIgnoreCase("s") || resp1.equalsIgnoreCase("n")) &&
				(resp2.equalsIgnoreCase("s") || resp2.equalsIgnoreCase("n")) &&
				(resp3.equalsIgnoreCase("s") || resp3.equalsIgnoreCase("n")) &&
				(resp4.equalsIgnoreCase("s") || resp4.equalsIgnoreCase("n")) &&
				(resp5.equalsIgnoreCase("s") || resp5.equalsIgnoreCase("n"))) {
			
			valid = true;
			int cont = 0;
			
			if (resp1.equalsIgnoreCase("S")) {
				cont++;
			}
			if (resp2.equalsIgnoreCase("S")) {
				cont++;
			}
			if (resp3.equalsIgnoreCase("S")) {
				cont++;
			}
			if (resp4.equalsIgnoreCase("S")) {
				cont++;
			}
			if (resp5.equalsIgnoreCase("S")) {
				cont++;
			}
			
			if (cont == 2) {
				System.out.println("Suspeito");
				}
			else if (cont == 3 || cont == 4) {
				System.out.println("Cumplice");
				}
			else if (cont == 5) {
				System.out.println("Assassino");
				}
			else if (cont == 0) {
				System.out.println("Inocente");
				}
		}else {
			valid = false;
			System.out.println("Input Invalido. Entre apenas S ou N para cada resposta.");
		}
		
		scan.close();
		
	}		
}
