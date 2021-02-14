package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor/hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com a quantidade de horas trabalhadas: ");
		double qtdHora = scan.nextDouble();
		
		double salarioBruto = valorHora * qtdHora;
		
		int percentualIR = 0;
		if (salarioBruto <= 900) {
			percentualIR = 0;
		} else if (salarioBruto >= 900 && salarioBruto <= 1500) {
			percentualIR = 5; 
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10; 
		} else if (salarioBruto > 2500) {
			percentualIR = 20; 
		}
		
		double ir = (salarioBruto/100) * percentualIR;
		double inss = (salarioBruto/100) * 10;
		double sindicato = (salarioBruto / 100) * 3;
		double fgts = (salarioBruto / 100) * 11;
		
		double totalDescontos = ir + inss + sindicato;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Salario Bruto (" + valorHora + " * " + qtdHora + "):     R$ " + salarioBruto);
		System.out.println("(-) IR (" + percentualIR + "%):                     R$ " + ir);
		System.out.println("(-) INSS (10%):                   R$ " + inss);
		System.out.println("(-) Sindicato (3%):               R$ " + sindicato);
		System.out.println("FGTS (11%):                       R$ " + fgts);
		System.out.println("Total Descontos:                  R$ " + totalDescontos);
		System.out.println("Salario Liquido:                  R$ " +  salarioLiquido);
		System.out.println("---------------------------------------------------------------");
		
		scan.close();
	}
}
