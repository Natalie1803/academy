package by.academy.homework3;

public class Potato extends Product {
	
	public Potato(String name, double price, int quantity) {
		super(name, price, quantity);
	}
	
	public Potato() {
	}
	
	public  double discount() {
		return 0.96;
	}
	
	public double getPrice() {
		return this.price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public double FullSum() {
		return this.price * this.quantity;
	}
	
	
}
