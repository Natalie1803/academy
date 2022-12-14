package by.acedemy.homework1;
//Задание 1.
//Ввести с консоли сумму покупки в магазине и возраст покупателя, 
//в зависимости от суммы вывести на экран ФИНАЛЬНУЮ ЦЕНУ с учетом скидки.
//
//	Скидки:
//	1) Сумма до 100 рублей -> 5%
//	2) Сумма от 100 рублей включая до 200 рублей не включая -> 7%
//	3) Сумма от 200 рублей включая до 300 рублей не включая -> 12%
//	4) Сумма от 300 рублей включая до 400 рублей не включая -> 15%
//	5) Сумма покупки больше 400 рублей включая -> 20%
//
//В случае, если сумма покупки находится в 3 интервале (сумма от 200 рублей включая до 300 рублей не включая) 
//и возраст покупателя больше, чем 18 лет -> добавить 4% к скидке (12 + 4), иначе -> отнять 3%. 

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Введите сумму покупки: ");
		int sum = console.nextInt();
		System.out.println("Введите свой возраст: ");
		int age = console.nextInt();
		int finalPrice;
		if (sum < 100) {
			finalPrice = sum - (sum * 5 / 100);
			System.out.println("Стоимость с учетом скидки: " + finalPrice);
		} else if (sum >= 100 && sum < 200) {
			finalPrice = sum - (sum * 7 / 100);
			System.out.println("Стоимость с учетом скидки: " + finalPrice);
		} else if (sum >= 200 && sum < 300) {
			if (age > 18) {
				finalPrice = sum - (sum * (12 + 4) / 100);
				System.out.println("Стоимость с учетом скидки: " + finalPrice);
			} else {
				finalPrice = sum - (sum * (12 - 3) / 100);
				System.out.println("Стоимость с учетом скидки: " + finalPrice);
			}
		} else if (sum >= 300 && sum < 400) {
			finalPrice = sum - (sum * 15 / 100);
			System.out.println("Стоимость с учетом скидки: " + finalPrice);
		} else if (sum >= 400) {
			finalPrice = sum - (sum * 20 / 100);
			System.out.println("Стоимость с учетом скидки: " + finalPrice);
		}
		console.close();
	}
}