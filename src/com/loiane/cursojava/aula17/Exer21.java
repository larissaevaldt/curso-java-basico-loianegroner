package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de turmas: ");
		int qtd = scan.nextInt();
		
		int alunos = 0;
		int soma = 0;
		
		for(int i =0; i<qtd; i++) {
			
			try {
			
				boolean valid = false;
				
			do {
				
				System.out.println("Entre a quantidade de alunos na turma " + (i+1));
				alunos = scan.nextInt();
				
				if(alunos > 40) {
					valid = false;
					System.out.println("Turma nao pode ter mais que 40 alunos.");
					System.out.println("Tente novamente");
					
				} else {
				valid = true;
				}
			}while(valid == false);
			
			}catch(Exception e ) {}
			
			soma += alunos;
		}
		
		double media = soma / qtd;
		
		System.out.println("O total de alunos e: " + soma);
		System.out.println("A media de alunos por turma e: " + media);
		
		scan.close();
	}

}
