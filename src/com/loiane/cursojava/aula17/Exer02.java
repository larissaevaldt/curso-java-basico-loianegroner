package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nomeUsuario;
		String senha;
		
		boolean valid = false;
		
		do {
		System.out.println("Entre o nome de usuario:");
		nomeUsuario = scan.next();
		
		System.out.println("Entre a senha:");
		senha = scan.next();
		
		if(nomeUsuario.equalsIgnoreCase(senha)) {
			//valid = false;
			System.out.println("Senha igual a usuario. Digite Novamente.");
		} else {
			valid = true;
			System.out.println("Senha e usuario validos.");
		}
		} while (valid == false); 
		
		scan.close();
	}

}
