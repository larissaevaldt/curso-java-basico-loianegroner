package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		System.out.println("Bem Vindo a Agenda Virtual");
		
		Scanner scan = new Scanner(System.in);

		String[][] compromissos = new String[31][24];
		// linhas sendo os dias do mes, colunas as horas do dia
		
		boolean sair = false;
		int opcao;
		//enquanto o usuario nao pedir para sair nos vamos pedir
		//as informacoes para ele
		
		//enquanto sair for true;
		while(!sair) {
			
			System.out.println("Digite 1 para adicionar compromisso:");
			System.out.println("Digite 2 para verificar compromisso:");
			System.out.println("Digite 0 para sair:");
			
			opcao = scan.nextInt();
			
			if(opcao == 1) { //adicionar compromisso
				
				boolean diaValido = false;
				int dia = 0;
				while(!diaValido) {
					System.out.println("Entre com o dia do mes:");
					dia = scan.nextInt();
					
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia Invalido. Digite Novamente.");
					}
				}
				
				boolean horaValida = false;
				int hora = 0;
				while(!horaValida) {
					System.out.println("Entre com a hora do compromisso:");
					hora = scan.nextInt();
					
					if(hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora Invalida. Digite Novamente.");
					}
				}
				
				//nossos dias no index da matriz vai de 0 a 30, entao o dia 1
				//e na verdade dia 0 para o computador, por isso dia--;
				dia --;
				//hora--;
				System.out.println("Digite o compromisso:");
				compromissos[dia][hora] = scan.next();
					
				
			} else if (opcao == 2) { //verificar compromisso
				
				boolean diaValido = false;
				int dia = 0;
				while(!diaValido) {
					System.out.println("Entre com o dia do mes:");
					dia = scan.nextInt();
					
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia Invalido. Digite Novamente.");
					}
				}
				
				boolean horaValida = false;
				int hora = 0;
				while(!horaValida) {
					System.out.println("Entre com a hora do compromisso:");
					hora = scan.nextInt();
					
					if(hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora Invalida. Digite Novamente.");
					}
				}
				
				dia--;
				System.out.println("O compromisso agendado e:");
				System.out.println(compromissos[dia][hora]);
				
				
			} else if (opcao == 0) { //sair
				sair = true;
			} else { //mostrar mensagem de erro e pedir novamente
				System.out.println("Numero Invalido - Tente novamente:");	
			}
			
		}
		
		scan.close();

	}

}
