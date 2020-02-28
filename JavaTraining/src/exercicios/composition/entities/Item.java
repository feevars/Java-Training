package exercicios.composition.entities;

public class Item {

	Produto produto;
	
	Integer quantidade;

	public Item(Produto produto, Integer quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
}
