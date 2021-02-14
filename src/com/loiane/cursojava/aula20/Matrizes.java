package com.loiane.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[3][4];
		//Nessa matriz podemos armazenar as 4 notas bimestrais de 3 alunos
		//Para entrar os valores:
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
	//como imprimir uma matriz na tela
		for (int i=0; i<notasAlunos.length; i++){
			//System.out.print(notasAlunos[i] + " ");
			for (int j=0; j<notasAlunos[i].length; j++){
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		
		//Mudando o valor de uma celula da matriz
		notasAlunos[1][3] = 8;
		//imprimindo de novo para comparar
		System.out.println();
		for (int i=0; i<notasAlunos.length; i++){
			//System.out.print(notasAlunos[i] + " ");
			for (int j=0; j<notasAlunos[i].length; j++){
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		
		//Calculando a media de notas de cada aluno:
		System.out.println();
		System.out.println("Calculando a media de cada aluno:");
		
		double soma;
		for (int i=0; i<notasAlunos.length; i++){
			
			soma = 0;
			for (int j=0; j<notasAlunos[i].length; j++){
				soma += notasAlunos[i][j];
			}
			
			System.out.println("Media do aluno " + (i+1) + " e = " +  (soma/4));
			
		}
		
		//Como inicializar vetores ou matrizes de uma vez:
		
		//Se eu ja tenho as notas do aluno, por exemplo:
		//eu sei que ele tirou 7, 8, 9 e 10 eu posso inicializar desse jeito:
		double[] notasAluno1 = {7, 8, 9, 10};
		
		//isso seria a mesma coisa que escrever 
		notasAluno1[0] = 7;
		notasAluno1[1] = 8;
		notasAluno1[2] = 9;
		notasAluno1[0] = 10;
		
		//No caso de uma matriz, fazemos desse jeito:
		double[][] notasAlunos2 = {{7, 8, 9, 10}, {8, 6, 7, 10}};
		//aqui nos estamos colocando as 4 notas de 2 alunos
		
		//imprimindo a matriz
		System.out.println();
		System.out.println("Output da matriz notasAlunos2:");
		for (int i=0; i<notasAlunos2.length; i++){
			//System.out.print(notasAlunos[i] + " ");
			for (int j=0; j<notasAlunos2[i].length; j++){
				System.out.print(notasAlunos2[i][j] + " - ");
			}
			System.out.println();
		}
		
	}

}
