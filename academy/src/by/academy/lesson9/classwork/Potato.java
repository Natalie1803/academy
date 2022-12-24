package by.academy.lesson9.classwork;

public class Potato extends Product {
	
	public Potato(String name, double price, int quantity) {
		super(name, price, quantity);
	}
	
	public  double discount() {
		return calcPrice()*0.96;
	}
}
