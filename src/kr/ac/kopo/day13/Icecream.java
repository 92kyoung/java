package kr.ac.kopo.day13;

public class Icecream {
	private String name;
	private int price;
	public Icecream() {
		super();
	}
	public Icecream(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Icecream [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
