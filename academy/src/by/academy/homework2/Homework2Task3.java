//Задание 3. 
//Условие здачи: ввести 2 слова, состоящие из четного числа букв. 
//Получить слово состоящее из первой половины первого слова и второй половины второго слова.

package by.academy.homework2;

import java.util.Scanner;

public class Homework2Task3 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Введите первое слово из четного числа букв: ");
		String s1 = console.nextLine();
		if (s1.length() % 2 != 0) {
			System.out.println("Введено неверное количество символов");
			console.close();
		}
		System.out.println("Введите слово из четного числа букв:");
		String s2 = console.nextLine();
		if (s2.length() % 2 != 0) {
			System.out.println("Введено неверное количество символов");
			console.close();
		}

		int longS1 = s1.length();
		int longS2 = s2.length();
		String newString = s1.substring(0, longS1 / 2) + s2.substring(0, longS2 / 2);
		System.out.println(newString);
		console.close();
	}
}
