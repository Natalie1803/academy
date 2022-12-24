//2. Добавить 3 типа продукта, наследоваться от Product, 
//реализовать метод подсчета цены для каждого продукта. 
//Добавить расчет цены со скидкой. (В каждом продукте своя скидка).

package by.academy.lesson9.classwork;

 public class Product {
	double price;
	protected String name;
	int quantity;
	
	
	public Product (String name, double price, int quantity) {
		this.name=name;
		this.price=price;
		this.quantity= quantity;
	}
	
	public Product (String name, double price) {
		this.name=name;
		this.price=price;
	}
	public Product () { 	
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", name=" + name + ", quantity=" + quantity + "]";
	}

	public  double calcPrice() {
		return price*quantity;
	}
	public  double discount() {
		return 1;
	}
	
}
