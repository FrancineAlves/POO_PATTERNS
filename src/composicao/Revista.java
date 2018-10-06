package composicao;

public class Revista {

	private String nome;
	private String Edicao;
	private Produto produto;
	
	public Revista() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEdicao() {
		return Edicao;
	}
	public void setEdicao(String edicao) {
		Edicao = edicao;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Revista [nome=" + nome + ", Editora=" + Edicao + "]";
	}
	
}
