package by.academy.homework3;

public class Milk extends Product {

	public Milk(String name, double price, int quantity) {
		super(name, price, quantity);
	}

	public Milk() {
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

	public double discount() {
		return 0.97;
	}
}
