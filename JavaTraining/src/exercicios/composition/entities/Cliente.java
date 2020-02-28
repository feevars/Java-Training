package exercicios.composition.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	List<Compra> compras = new ArrayList<>();
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	Double obterValorTotal() {
		Double total = 0.00;

		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}
	return total;
	}
}
