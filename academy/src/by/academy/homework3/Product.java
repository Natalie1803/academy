package by.academy.homework3;

public abstract class Product {
	protected String name;
	int quantity;
	double price;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Product() {
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void addProduct(String name) {
		if (name.equals(this.name))
			this.quantity = this.quantity + 1;
	}

	public void deleteProduct(String name) {
		if (name.equals(this.name))
			this.quantity = this.quantity - 1;
	}

	@Override
	public String toString() {
		return name + " " + price + " " + quantity + " " + calcPrice();
	}

	public void printf() {
		System.out.printf("%-15s %-10s %-15s %15s  %n", name, price, quantity, printCalcPrice());
	}

	public double calcPrice() {
		return price * quantity;
	}
	
	public String printCalcPrice() {
		return String.format("%.2f", calcPrice());
	}

	public abstract double discount();

}
