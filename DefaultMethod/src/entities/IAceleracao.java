package entities;

public interface IAceleracao {

	default void acelerar() {
		System.out.println("Aceleração constante");
	}
	
	default void desacelerar() {
		System.out.println("Desaceleração constante");
	}
	
}
