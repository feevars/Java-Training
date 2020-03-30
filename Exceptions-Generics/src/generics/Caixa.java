package generics;

/* 
 * Isso é uma classe que possui caoicsaus
 * */
public class Caixa<T> {
	
	
	
	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}

}
