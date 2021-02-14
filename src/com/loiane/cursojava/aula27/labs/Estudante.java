package com.loiane.cursojava.aula27.labs;

public class Estudante {
	
	String nome;
	String matricula;
	String curso;
	String [] nomeDisciplinas = new String[3];
	double [][] notasDisciplinas = new double[3][4];
	
	void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome do curso: " + curso);
		
		for (int i=0; i<nomeDisciplinas.length; i++) {
			System.out.println("Nome disciplina " + (i+1) + ": " + nomeDisciplinas[i]);
		}
		
		for(int i=0; i<notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina " + nomeDisciplinas[i] + ":");
			for(int j=0; j<notasDisciplinas[i].length; j++) {
				System.out.println("Nota " + (j+1) + " = " + notasDisciplinas[i][j]);
			}
		}
	}
	
	boolean verificarAprovado(int indice) {
		
		
		if (calcularMedia(indice) >= 7) {
			return true;
		} else {
			return false;
		}
		
	}
	
	double calcularMedia(int indice) {
		
		double soma = 0;
		
		for(int i=0; i<notasDisciplinas[indice].length; i++) {
		soma += notasDisciplinas[indice][i];
		}
		
		double media = soma / 4;
		return media;
	}

}
