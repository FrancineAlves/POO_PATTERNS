package composicao;

public class Tester {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(1.65,12);
		
		// Tester Livro
		Livro livro = new Livro();
		
		livro.setTitulo("Harry Potter");
		livro.setAutor("J. K. Rowling");
		livro.setNumPagina(123);
		livro.setProduto(p1);
		
		System.out.println("Preço do Livro: " + livro.getProduto().getPreco());
		
		// Tester Revista
		Produto p2 = new Produto(25.05,12);
		
		Revista revista = new Revista();
		
		revista.setNome("Veja");
		revista.setEdicao("214");
		revista.setProduto(p2);
		
		System.out.println("Preço do Revista: " + revista.getProduto().getPreco());

	}

}
