package exercicios.lambda;

public class Product {

	final String nome;
	final Double preco;
	final Double desconto;
	
	public Product(String nome, Double preco, Double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		return "Nome do produto: " + nome + ", preco = R$"  + preco;
	}
	
	
	
}
