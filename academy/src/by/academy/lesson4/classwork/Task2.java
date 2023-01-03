package by.academy.lesson4.classwork;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
//	2. Составьте программу, которая вычисляет сумму чисел от 1 до n. 
//	Значение n вводится с клавиатуры.
//
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число:");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		sc.close();
	}
}