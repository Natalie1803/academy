package by.academy.lesson9.classwork;

public class Bread extends Product {

	public Bread(String name, double price, int quantity) {
		super(name, price, quantity);
	}

	public Bread() {
	}
	public  double discount() {
		return calcPrice()*0.98;
	}
}
