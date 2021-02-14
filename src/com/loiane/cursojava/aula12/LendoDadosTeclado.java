package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LendoDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite o seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome competo e: " + nomeCompleto);
		
		System.out.println("Digite a sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade e: " + idade);*/
		
		/*System.out.println("Digite o preco da passagem de onibus na sua cidade: ");
		double precoPassagem = scan.nextDouble();
		System.out.println("O preco da passagem de onibus na sua cidade e: " + precoPassagem);*/
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimacao (true para sim e false para nao):");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voce digitou os seguintes dados:");
		System.out.println("Nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem bichinho de estimacao: " + temPet);
		
		scan.close();

	}

}
