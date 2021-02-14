package com.loiane.cursojava.aula27.labs;

public class ContaCorrente {

	String nome;
	String numeroConta;
	String agencia;
	boolean especial;
	double valorEspecialUsado;
	double limiteEspecial;
	double saldo;

	
	boolean realizarSaque(double quantiaASacar) {

		// tem saldo na conta
		if (saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;

		} else { // nao tem saldo na conta;
			if (especial) { // verificar se o limite especial tem saldo
				double limite = limiteEspecial + saldo;
				if (limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}

			} else {
				return false; // nao e especial e nao tem saldo suficiente
			}
		}
	}
	
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo atual da conta: " + saldo);
	}
	
	boolean verificarUsoChequeEspecial() {
		return saldo < 0;
		//se o saldo for menor que zero, retorna verdadeiro e esta usando 
		//cheque especial, senao nao e verdadeiro
	}
}
