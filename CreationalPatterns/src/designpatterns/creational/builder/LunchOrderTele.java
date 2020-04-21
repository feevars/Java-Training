package designpatterns.creational.builder;

public class LunchOrderTele {
	
	private String bread;
	private String condiments;
	private String dressing;
	private String burger;
	
	public LunchOrderTele(String bread) {
		this.bread = bread;
	}
	
	public LunchOrderTele (String bread, String condiments) {
		this(bread);
		this.condiments = condiments;
	}
	
	public LunchOrderTele (String bread, String condiments, String dressing) {
		this(bread, condiments);
		this.dressing = dressing;
	}
	
	public LunchOrderTele (String bread, String condiments, String dressing, String burger) {
		this(bread, condiments, dressing);
		this.burger = burger;
	}

	public String getBread() {
		return bread;
	}
	public String getCondiments() {
		return condiments;
	}
	public String getDressing() {
		return dressing;
	}
	public String getBurger() {
		return burger;
	}
}
