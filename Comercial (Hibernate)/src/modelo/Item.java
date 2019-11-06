package modelo;

public class Item {

	private int id;
	private Produto produto;
	private int quantidade;
	private float precoUnitario;
	
	public Item() {
		this.produto = null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(float preco) {
		this.precoUnitario = preco;
	}

	@Override
	public String toString() {
		return produto + "\t" + quantidade + "\tR$ " + precoUnitario + "\tR$ " + (quantidade * precoUnitario);
	}
	
	
}
