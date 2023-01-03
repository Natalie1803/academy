package by.academy.homework3;

import java.time.LocalDate;
import java.util.Scanner;

public class ApplicationDeal {
	static Deal deal;
	
	private static void printCheck(Product[] products) {
		int counter = 0;
		System.out.printf("%nДата: " + LocalDate.now() + "\n");
		System.out.printf("%-15s %-10s %-15s %15s  %n", "Продукты", "Цена", "Количество", "Общая стоимость");
		System.out.println("-----------------------------------------------------------");
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				products[i].printf();
				counter++;
			}
		}
		System.out.println("-----------------------------------------------------------");
		System.out.printf("Итого: " + "%.2f", (deal.calcFullPrice()));
		System.out.printf("%nСтоимость с учетом скидки: " + "%.2f", deal.calcFullPriceWithDiscount());

		if (counter == 0) {
			System.out.println("Продуктов нет");
		}
	}

	public static void main(String[] args) {
		Person seller = new Person("Галя", 100.0);
		Person buyer = new Person("Марго", 120.90, "+375291110000", "margo@kek.by", "11-11-1950");
		Product[] products = new Product[3];
		deal = new Deal(seller, buyer, products);

		Scanner console = new Scanner(System.in);

		System.out.println("Введите количество хлеба: ");
		products[0] = new Bread("Хлеб", 1.20, console.nextInt());
		System.out.println("Введите количество картофеля:");
		products[1] = new Potato("Картофель", 2.0, console.nextInt());
		System.out.println("Введите количество пакетов молока:");
		products[2] = new Milk("Молоко", 1.23, console.nextInt());
		
		
		console.close();
		printCheck(products);

	}
}
