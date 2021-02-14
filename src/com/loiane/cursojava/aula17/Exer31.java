package com.loiane.cursojava.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
	
		String funcionario;
		double salario, percentual;
		int primeiroAno;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre o nome do funcionario:");
		funcionario = scan.nextLine();
		
		System.out.println("Entre com o salario inicial do funcionario");
		salario = scan.nextDouble(); 
		
		System.out.println("Em que ano o funcionario comecou a trabalhar na empresa:");
		primeiroAno = scan.nextInt();
		
		percentual = 1.5; 
		
		salario += (salario / 100) * percentual;
		
		//metodo para formatar o output
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		System.out.println("Historico de aumentos do salario de " + funcionario + " ");
		System.out.println((primeiroAno + 1) + " = " + format.format(salario) + " - " + percentual);
		
		for(int i=primeiroAno + 2; i<=2018; i++) {
			percentual = percentual * 2;
			
			salario += (salario / 100) * percentual;
			
			System.out.println(i + " = " + format.format(salario) + " - " + percentual + "% ");
		}
		
		System.out.println("O salario atual do funcionario e: " + format.format(salario));
		
		scan.close();
	}

}
