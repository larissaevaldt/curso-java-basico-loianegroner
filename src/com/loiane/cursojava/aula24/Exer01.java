package com.loiane.cursojava.aula24;

public class Exer01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amararela";
		lampada.garantiaMeses = 36;
		lampada.tipoAbajur = true;
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeoes";

	}

}
