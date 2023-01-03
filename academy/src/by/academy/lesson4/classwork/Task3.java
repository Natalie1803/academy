package by.academy.lesson4.classwork;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
//		3. Составьте программу, которая вычисляет произведение чисел от 1 до j. Значение j
//		 вводится с клавиатуры.
//
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число:");
		int j = sc.nextInt();
		int proizvedenie = 1;
		for (int i = 1; i < j; i++) {
			proizvedenie = proizvedenie * i;
		}
		System.out.println(proizvedenie);
		sc.close();
	}
}
