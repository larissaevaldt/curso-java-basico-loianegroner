package com.loiane.cursojava.aula27.labs;

public class LampadaTeste {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.ligarLampada();
		lampada.mostrarEstado();
		
		lampada.desligarLampada();
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		lampada.mostrarEstado();

	}

}
