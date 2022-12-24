package by.academy.lesson9.classwork;

public class Milk extends Product {

	public Milk(String name, double price, int quantity) {
		super(name, price, quantity);
	}
	public  double discount() {
		return calcPrice()*0.97;
	}
}
