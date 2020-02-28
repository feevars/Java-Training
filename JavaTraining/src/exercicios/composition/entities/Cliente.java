package exercicios.composition.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	List<Compra> compras = new ArrayList<>();
	
	

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public List<Compra> getCompras() {
		return compras;
	}



	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}



	Double obterValorTotal() {
		Double total = 0.00;

		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}
	return total;
	}
}
