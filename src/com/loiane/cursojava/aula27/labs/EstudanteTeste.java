package com.loiane.cursojava.aula27.labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EstudanteTeste {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		
		Estudante estudante1 = new Estudante();
		
		System.out.println("Entre o nome do estudante:");
		estudante1.nome = br.readLine();
		System.out.println("Entre o numero da matricula:");
		estudante1.matricula = br.readLine();
		System.out.println("Entre o nome do Curso:");
		estudante1.curso = br.readLine();
		
		//estudante1.nomeDisciplinas = new String[3];
		for(int i=0; i<estudante1.nomeDisciplinas.length; i++) {
			System.out.println("Entre o nome da Disciplina " + (i+1) + ":");
			estudante1.nomeDisciplinas[i] = br.readLine();
		}
		
		for(int i=0; i<estudante1.notasDisciplinas.length; i++) {
			System.out.println("Obtendo as notas da disciplina " + estudante1.nomeDisciplinas[i] + ":");
			for(int j=0; j<estudante1.notasDisciplinas[i].length; j++) {
				System.out.println("Entre com a nota " + (j+1) + ":");
				estudante1.notasDisciplinas[i][j] = scan.nextDouble();
			}
		}
		
		estudante1.mostrarInfo();
		
		for(int i=0; i<estudante1.nomeDisciplinas.length; i++) {
			if(estudante1.verificarAprovado(i)) {
				System.out.println("Disciplina " + estudante1.nomeDisciplinas[i] + " - foi aprovado.");
			} else {
				System.out.println("Disciplina " + estudante1.nomeDisciplinas[i] + " - foi reprovado.");
			}
		}
		
		scan.close();
	}

}
