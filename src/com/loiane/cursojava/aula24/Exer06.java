package com.loiane.cursojava.aula24;

public class Exer06 {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.nome = "Larissa Justo";
		contato.email = "lari.justo@gmail.com";
		contato.endereco = "344 Carnlough Road";
		
		contato.telefones = new String[5];
		contato.telefones[0] = "0834613135";
		contato.telefones[1] = "96189083";
		contato.telefones[2] = "36255326";
		
		System.out.println("Nome do Contato: " + contato.nome);
		System.out.println("Email: " + contato.email);
		System.out.println("Endereco: " + contato.endereco);
		System.out.println("Telefone 1: " + contato.telefones[0]);
		System.out.println("Telefone 2: " + contato.telefones[1]);
		System.out.println("Telefone 3: " + contato.telefones[2]);
		

	}

}
