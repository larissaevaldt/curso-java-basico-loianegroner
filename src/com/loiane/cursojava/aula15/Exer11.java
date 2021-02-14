package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o atual salario do colaborador:");
		double salarioAtual = scan.nextDouble();
		
		if (salarioAtual <= 280) {
			double acrescimo = (salarioAtual / 100) * 20;
			double novoSalario = salarioAtual + acrescimo;
			
			System.out.println("Salario antes do reajuste: " + salarioAtual);
			System.out.println("Percentual de aumento aplicado: 20%");
			System.out.println("Valor do aumento: " + acrescimo);
			System.out.println("Novo salario: " + novoSalario);
		
		} else if (salarioAtual > 280 && salarioAtual < 700) {
			double acrescimo = (salarioAtual / 100) * 15;
			double novoSalario = salarioAtual + acrescimo;
			
			System.out.println("Salario antes do reajuste: " + salarioAtual);
			System.out.println("Percentual de aumento aplicado: 15%");
			System.out.println("Valor do aumento: " + acrescimo);
			System.out.println("Novo salario: " + novoSalario);
		
		} else if (salarioAtual >= 700 && salarioAtual < 1500) {
			double acrescimo = (salarioAtual / 100) * 10;
			double novoSalario = salarioAtual + acrescimo;
			
			System.out.println("Salario antes do reajuste: " + salarioAtual);
			System.out.println("Percentual de aumento aplicado: 10%");
			System.out.println("Valor do aumento: " + acrescimo);
			System.out.println("Novo salario: " + novoSalario);
		
		} else {
			double acrescimo = (salarioAtual / 100) * 5;
			double novoSalario = salarioAtual + acrescimo;
			
			System.out.println("Salario antes do reajuste: " + salarioAtual);
			System.out.println("Percentual de aumento aplicado: 5%");
			System.out.println("Valor do aumento: " + acrescimo);
			System.out.println("Novo salario: " + novoSalario);
		}
		
		scan.close();
	}
}