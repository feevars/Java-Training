package exercicios.composition.entities;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	public Compra() {}
	
	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, Integer quantidade) {
		this.itens.add(new Item(p, quantidade));
		this.itens.add(new Item(p, quantidade));
	}
	
	void adicionarItem(String nome, Double preco, Integer quantidade) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}
	
	Double obterValorTotal() {
		Double total = 0.00;
		
		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
