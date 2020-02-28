package exercicios.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//offer retorna falso quando nao h� mais espa�o na fila, caso seu tamanho seja definido
		fila.add("Ana"); // return false
		fila.offer("Bia"); // throw exception
		fila.offer("Maicon");
		fila.offer("L�cio");
		fila.offer("Jorge");
		fila.offer("Cristina");
		
		
		System.out.println(fila.peek()); // null if fila is empty
		System.out.println(fila.element()); // throw noSuchElementException
		
		fila.poll(); // remove primeiro elemento da fila
		fila.remove();
		//if fila is empty, fila.remove() throws an exception. fila.poll() return null
		
	}
}
