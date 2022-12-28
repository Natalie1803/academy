package by.academy.homework3;

import java.io.Serializable;

public class Bread extends Product implements Serializable {

	public Bread(String name, double price, int quantity) {
		super(name, price, quantity);
	}

	public Bread() {
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
		return 0.98;
	}
}
