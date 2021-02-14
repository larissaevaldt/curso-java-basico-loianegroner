package com.loiane.cursojava.aula24;

public class Exer03 {

	public static void main(String[] args) {

		LivroLivraria livro = new LivroLivraria();
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		livro.preco = 63.39;
		livro.qtdPaginas = 402;
		
		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Autor: " + livro.autor);
		System.out.println("Ano Lancamento: " + livro.anoLancamento);
		System.out.println("Quantidade de Paginas: " + livro.qtdPaginas);
		System.out.println("Preco: " + livro.preco);

	}

}
