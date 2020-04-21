package designpatterns.creational.builder;

public class LunchOrderBean {

	private String bread;
	private String condiments;
	private String dressing;
	private String burger;
	
	public LunchOrderBean() {
		
	}
	
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public String getCondiments() {
		return condiments;
	}
	public void setCondiments(String condiments) {
		this.condiments = condiments;
	}
	public String getDressing() {
		return dressing;
	}
	public void setDressing(String dressing) {
		this.dressing = dressing;
	}
	public String getBurger() {
		return burger;
	}
	public void setBurger(String burger) {
		this.burger = burger;
	}
}
