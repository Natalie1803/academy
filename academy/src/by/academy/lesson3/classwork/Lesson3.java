package by.academy.lesson3.classwork;

import java.util.Scanner;

public class Lesson3 {

	public static void main(String[] args) {

//	3.Проинициализировать 3 целочисленных числа:
//		 a = 2_123_000 
//		 b = 100
//		 c = 234
//		 Найти a / b * c
//		 Ответ: (4_967_820)

		int a = 2123000;
		int b = 100;
		int c = 234;
		System.out.println(a / b * c);

//	2.Изменить переменные и строку вывода в программе так, 
//	 чтобы она расчитывала и печатала следующее выражение:
//	 3*3+4*4=25

		int i = 2;
		int j = 3;
		int k = i + j;
		System.out.println(j + "*" + j + "+" + i * i + "*" + i * i + "=" + k * k);

//	  3.Ввести через консоль название месяца -> вывести номер месяца (использовать switch/case)

		Scanner console = new Scanner(System.in); // ctrl+shift+O на англ раскладке, чтобы появился Import
		System.out.println("Введите месяц: ");

		String month = console.nextLine();

		switch (month) {
		case "Январь":
			System.out.println(1);
			break;
		case "Февраль":
			System.out.println(2);
			break;
		case "Март":
			System.out.println(3);
			break;
		case "Апрель":
			System.out.println(4);
			break;
		case "Май":
			System.out.println(5);
			break;
		case "Июнь":
			System.out.println(6);
			break;
		case "Июль":
			System.out.println(7);
			break;
		case "Август":
			System.out.println(8);
			break;
		case "Сентябрь":
			System.out.println(9);
			break;
		case "Октябрь":
			System.out.println(10);
			break;
		case "Ноябрь":
			System.out.println(11);
			break;
		case "Декабрь":
			System.out.println(12);
			break;
		}

//		4.Создайте число. Определите, является ли число 
//		четным или не четным, вывести текстовое сообщение. 

		int figure = 4;
		if (figure % 2 == 0)
			System.out.println("Число четное");
		else
			System.out.println("Число нечетное");

//		4.Перепишите программу:Продолжить пример, добавить расчет и вывод суток 
//		и недель. (месяц по желанию)

		int s = 370000;
		int sec;
		int m;
		int min;
		int h;
		int hours;
		int d;
		int day;
		int week;

		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		hours = h % 24;
		d = (h - hours) / 24;
		day = d % 7;
		week = (d - day) / 7;
		System.out.println(week + " недель " + day + " дней " + hours + " часов " + min + " минут " + sec + " секунд");

		// 5. Ввести с консоли 2 числа, найти большее, меньшее, 
		// среднее арифметическое.
		
		System.out.println("Введите первое число: "); 
		int number1 = console.nextInt();
		System.out.println("Введите второе число: ");
		int number2=console.nextInt();
		if (number1>number2)
		System.out.println("Первое число " + number1+ " больше второго "+ number2); 
		else
		System.out.println("Первое число " + number1+ " меньше второго "+ number2); 
		int number3 = (number1+number2)/2;
		System.out.println("Среднее арифметическое чисел " + number1+ " и "+ number2 + "равно: " + number3);
		
		console.close();
	}
}
