package com.loiane.cursojava.aula24;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
		LivroBiblioteca livro = new LivroBiblioteca();
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		livro.qtdPaginas = 402;
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Larissa Evaldt";
		
		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Autor: " + livro.autor);
		System.out.println("Ano Lancamento: " + livro.anoLancamento);
		System.out.println("Quantidade de Paginas: " + livro.qtdPaginas);
		System.out.println("Emprestado: " + livro.emprestado);
		System.out.println("Data entrega: " + livro.dataEntrega);
		System.out.println("Emprestado a: " + livro.emprestadoA);

	}

}
