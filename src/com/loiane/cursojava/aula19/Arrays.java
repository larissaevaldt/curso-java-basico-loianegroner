package com.loiane.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		//digamos que a gente precise fazer um programa que guarde a temperatura
		//do dia por um ano
		double tempDia001 = 31.3;
		double tempDia002 = 34.5;
		double tempDia003 = 32.4;
		double tempDia004 = 33;
		double tempDia005 = 40;
		//a gente vai criar 365 double variables? NAO
		//um jeito mais facil de fazer isso seria criando arrays, exemplo:
		
		double[] temperaturas = new double[365];
		//esse e o jeito de se criar uma array, o numero dentro do conchetes
		//e quantas variaveis nos iremos precisar. No java temos sempre que 
		//colocar um numero ali e especificar o tamanho da array. Arrays podem
		//ser de qualquer tipo(int, double, string, char, etc..)
		//PARA ENTRAR VALORES PARA CADA "INDEX"
		temperaturas[0] = 31.3;
		temperaturas[1] = 34.5;
		temperaturas[2] = 32.4;
		temperaturas[3] = 33;
		temperaturas[4] = 40;
		
		//lemrando que o index sempre comeca a contar por 0 e nao 1. 
		//Entao nossa temperatura do dia 1 sera index 0, do dia 2 index 1, etc.
		
		System.out.println("O valor da temperatura do dia 3 e: " + temperaturas[2]);
		
		System.out.println("O tamanho da array: " + temperaturas.length);
		//mas temperaturas.length() mostrara o tamanho total da array, que e 365
		//e nao 5 que e a quantidade que nos ja entramos.
		
		System.out.println("Tamanho de array: " + temperaturas);
		//imprime um valor estranho, que e o endereco de memoria em que esse array
		//esta apontando
		
		//para imprimir todos os valores da array podemos usar um loop for:
		for (int i=0; i<temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + " e: " + temperaturas[i]);
		
		}
		
		//esse for imprime somente os valores
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
	}

}
