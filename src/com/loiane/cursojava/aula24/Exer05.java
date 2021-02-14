package com.loiane.cursojava.aula24;

public class Exer05 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.nome = "Fulano de Tal";
		conta.numeroConta = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = -10;
		
		System.out.println("Saldo da conta " + conta.numeroConta + ": " + conta.saldo);
		

	}

}
