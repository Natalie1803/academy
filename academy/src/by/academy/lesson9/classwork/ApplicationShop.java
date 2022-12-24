package by.academy.lesson9.classwork;

public class ApplicationShop {
	public static void main(String[] args) {
		Product bread = new Bread ("Хлеб", 1.20, 2);
		System.out.println(bread);
		System.out.println("Общая стоимость: "+ bread.calcPrice());
		System.out.println("Стоимость с учетом скидки: "+bread.discount());
		
		Product potato = new Potato ("Картофель", 2, 3);
		System.out.println(potato);
		System.out.println("Общая стоимость: "+potato.calcPrice());
		System.out.println("Стоимость с учетом скидки: "+potato.discount());
		
		Product milk = new Milk ("Молоко", 1.23, 1);
		System.out.println(milk);
		System.out.println("Общая стоимость: "+milk.calcPrice());
		System.out.println("Стоимость с учетом скидки: "+milk.discount());
	}
}
