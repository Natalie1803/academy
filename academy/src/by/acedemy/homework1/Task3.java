package by.acedemy.homework1;
//Задание 3.

//Ввести с консоли число от 1 до 10, вывести на экран таблицу умножения для этого числа. (10 чисел).

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число от 1 до 10: ");
		int number = sc.nextInt();

		if (number >= 2 && number <= 10)
			System.out.println(number * 1 + " " + number * 2 + " " + number * 3 + " " + number * 4 + " " + number * 5
					+ " " + number * 6 + " " + number * 7 + " " + number * 8 + " " + number * 9 + " " + number * 10);
		else
			System.out.println("Вы ввели неверное число");
		sc.close();
	}

}
