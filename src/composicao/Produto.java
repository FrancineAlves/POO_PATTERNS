package composicao;

public class Produto {

	private Double preco;
	private int quantidade;
	
	public Produto(Double preco, int quantidade) {
		super();
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "Produto [preco=" + preco + ", quantidade=" + quantidade + "]";
	}	
}
