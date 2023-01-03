package by.academy.lesson4.classwork;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
//		4. С клавиатуры вводятся n чисел. 
//		Составьте программу, которая определяет кол-во отрицательных,
//		кол-во положительных и кол-во нулей среди введеных чисел.
//		Значение n вводится с клавиатуры.
//
		int countNegative = 0;
		int countPositive = 0;
		int countNull = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество чисел");
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.println("Введите число");
			int a = sc.nextInt();
			if (a < 0)
				countNegative++;
			else if (a > 0)
				countPositive++;
			else if (a == 0)
				countNull++;
		}
		System.out.println("Количество отрицательных числе: " + countNegative);
		System.out.println("Количество положительных числе: " + countPositive);
		System.out.println("Количество нулей: " + countNull);
		sc.close();
	}
}
