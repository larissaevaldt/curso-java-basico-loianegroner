package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de temperaturas:");
		int qtdTemperaturas = scan.nextInt();
		
		double temperatura = 0;
		double soma = 0;
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		
	/*
	Here we assign to the highest temperature (maior) the minimum value a double can have
	because inside the loop we will check if the number entered for temperature is
	bigger than the minimum value, than change "maior" to the number entered. Next time 
	the loop runs the program will check if the next value entered is bigger than 
	the first value entered, if it is it will change maior to the new value entered and so on. 
	We just set it to the minumum value to make sure it will change to the number entered
	(any number the user enter will be bigger than the minumum value a double can have) 
	
	We do the opposite to find the smallest number.
	Set variable to the highest value a double can possibly have.
	and check if the number entered is smaller than the maximum value.
	If it is(which will definitely be) than change variable to the number entered
	*/
		
		for (int i=1; i <= qtdTemperaturas; i++) {
			System.out.println("Entre com a temperatura " + i);
			temperatura = scan.nextDouble();
			
			soma += temperatura;
			//+= significa some temperatura ao valor da soma
			//seria o mesmo que escrever soma = soma + temperatura;
			
			if (temperatura > maior) {
				maior = temperatura;
			}
			
			if(temperatura < menor) {
				menor = temperatura;
			}
			
		}
			
			System.out.println("Media: " + (soma / qtdTemperaturas));
			System.out.println("Menor Temperatura: " + menor);
			System.out.println("Maior Temperatura: " + maior);
			
			scan.close();
			
		}
}
