package com.loiane.cursojava.aula27.labs;

public class ContaCorrenteTeste {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.nome = "Larissa Evaldt";
		conta.numeroConta = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = -10;
		conta.valorEspecialUsado = 0;
		
		System.out.println("Saldo da conta " + conta.numeroConta + ": " + conta.saldo);
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		if(saqueEfetuado) {
			System.out.println("Saque Efetuado com sucesso.");
			conta.consultarSaldo();
		} else {
			System.out.println("Nao foi possivel efetuar saque. Saldo insuficiente.");
		}
		
		System.out.println("Tentativa de Saque de 500 reais:");
		saqueEfetuado = conta.realizarSaque(500);
		if(saqueEfetuado) {
			System.out.println("Saque Efetuado com sucesso.");
			conta.consultarSaldo();
		} else {
			System.out.println("Nao foi possivel efetuar saque. Saldo insuficiente.");
		}
		
		conta.depositar(500);
		conta.consultarSaldo();
		
		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Esta usando cheque especial.");
		} else {
			System.out.println("Nao esta usando cheque especial.");
		}
		
		conta.realizarSaque(600);
		conta.consultarSaldo();
		
		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Esta usando cheque especial.");
		} else {
			System.out.println("Nao esta usando cheque especial.");
		}
	}

}
