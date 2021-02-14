package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome, sexo, estadoCivil;
		int idade;
		double salario = 0;
		boolean valid = false;
		
		do {
			System.out.println("Digite o seu nome:");
			nome = scan.next();
			
			if(nome.length() > 3) {
				valid = true;
			} else {
				//valid = false;
				System.out.println("Nome precisa conter mais de 3 caracteres.");
				}
		}while(valid == false);
		
		valid = false;
		do {
			System.out.println("Digite a sua idade:");
			idade = scan.nextInt();
			
			if(idade > 0 && idade < 150) {
				valid = true;
			} else {
				valid = false;
				System.out.println("Idade Invalida.");
			}
		}while(valid == false);
		
		valid = false;
		do {
			System.out.println("Digite o seu salario:");
			salario = scan.nextDouble();
			
			if(salario > 0) {
				valid = true;
			} else {
				valid = false;
				System.out.println("Salario nao pode ser menos que zero.");
				
			}
		}while(valid == false);
		
		valid = false;
		do {
			System.out.println("Digite o seu sexo: (f ou m)");
			sexo = scan.next();
			
			if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m") ) {
				valid = true;
			} else {
				valid = false;
				System.out.println("Entrada Invalida.");
				
			}
		}while(valid == false);
		
		valid = false;
		
		do {
			System.out.println("Entre seu estado civil: 's', 'c', 'v' ou 'd'");
			estadoCivil = scan.next();
			
			if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				valid = true;
			} else {
				valid = false;
				System.out.println("Entrada Invalida.");
				}
		}while(valid == false);
		
		System.out.println("As seguintes informacoes foram coletadas:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
		
		scan.close();
	}

}
