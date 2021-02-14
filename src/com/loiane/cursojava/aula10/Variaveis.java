package com.loiane.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		//Java Convention, variable names should be camelCase 
		int idade = 21;
		String nome = "Larissa";
		String nomeDoMeuCachorro = "toto";
		String ano2018 = "2018";
		
		//Accepted, but not a good practice
		int _idade;
		int $idade;
		
		//accepted but not in accord with Java convention
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String NomeDoMeucachorro;
		
		idade = 25;
		
		System.out.println("Idade: " + idade);
		System.out.println("Nome: " + nome);
		
		//in practice
		int a = 10;
		String b = "Larissa";
		//ALWAYS try to explain what the variable is in the name 
		//for who is reading to understand, and even for yourself, today you remember what "a" and "b" mean
		//but if you look at it in a year's time, you might not remember anymore what you meant by "a" e "b"

	}

}
