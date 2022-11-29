package by.acedemy.homework1;
//Задание 2.

//Используем switch/case. Ввести с консоли тип данных(созраняем в String) и переменную, вывести на экран:
//	a) если тип данных int, вывести остаток от деления на 2
//	b) если double, вывести 70% от числа 
//	c) если float, возвести в квадрат
//	d) если char, вывести код символа (charAt(0))
//	e) String, вывести на экран строку в виде ("Hello " + переменная)
//	f) во всех остальных случаях вывести на экран ("Unsupported type");

import java.util.Scanner;

//
public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите тип переменной:");
		String str = sc.nextLine();
		switch (str) {
		case "int":
			System.out.println("Введите значение типа int:");
			int a = sc.nextInt();
			System.out.println(a % 2);
			break;
		case "double":
			System.out.println("Введите значение типа double:");
			double b = sc.nextDouble();
			System.out.println(b * 0.7);
			break;
		case "float":
			System.out.println("Введите значение типа float:");
			float c = sc.nextFloat();
			System.out.println(c * c * c);
			break;
		case "char":
			System.out.println("Введите значение типа char:");
			char simbol = sc.next().charAt(0);
			System.out.println(simbol);
			break;
		case "String":
			System.out.println("Введите значение типа String:");
			String str2 = sc.nextLine();
			System.out.println("Hello " + str2);
			break;
		default:
			System.out.println("Unsupported type");
		}

		sc.close();
	}
}