package designpatterns.creational.builder;

public class LunchOrderTeleDemo {
	public static void main(String[] args) {
		
		LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat", "Lettuce", "Ketchup", "Tofu");
		
		System.out.println(lunchOrderTele.getBread());
		System.out.println(lunchOrderTele.getCondiments());
		System.out.println(lunchOrderTele.getDressing());
		System.out.println(lunchOrderTele.getBurger());
	}
}
