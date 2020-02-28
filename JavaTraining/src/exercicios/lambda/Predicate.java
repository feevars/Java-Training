package exercicios.lambda;

public class Predicate {
	public static void main(String[] args) {
			java.util.function.Predicate<Product> isCaro =
					prod -> (prod.preco * (1-prod.desconto)) >= 750;	
	
			Product product = new Product("Notebook", 3578.00, 0.5);
			System.out.println(isCaro.test(product));
	
	}
}
