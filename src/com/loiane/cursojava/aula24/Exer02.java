package com.loiane.cursojava.aula24;

public class Exer02 {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		livro.qtdPaginas = 402;
		
		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Autor: " + livro.autor);
		System.out.println("Ano Lancamento: " + livro.anoLancamento);

	}

}
