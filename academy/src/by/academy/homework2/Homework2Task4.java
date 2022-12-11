//Задание 4. 
//Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер. 
//Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n  игроков (по 5 карт каждому) 
//из рассортированной колоды. 
//Разделяйте пять карт, выданных каждому игроку, пустой строкой.

package by.academy.homework2;

import java.util.Scanner;

public class Homework2Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество игроков: ");
		int numberOfPlayers = scanner.nextInt();
		int cards = 5;
		String[] arrayName = { "Черви", "Бубны", "Трефы", "Пики" };
		String[] arrayNumber = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз" };
		String[] array = new String[arrayName.length * arrayNumber.length];

		for (int i = 0; i < arrayNumber.length; i++) {
			for (int j = 0; j < arrayName.length; j++) {
				array[arrayName.length * i + j] = arrayName[j] + " " + arrayNumber[i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			int randomCard = i + (int) (Math.random() * (array.length - i)); // перестановка карт случайным образом
			String s = array[randomCard];
			array[randomCard] = array[i];
			array[i] = s;
		}

		for (int i = 0; i < numberOfPlayers * cards; i++) {
			if (numberOfPlayers * cards < cards * 2 && numberOfPlayers * cards > array.length) {
				System.out.println("Введено неверное количество игроков");
				break;
			}
			System.out.println(array[i]);
			if (i % cards == cards - 1)
				System.out.println();
		}
		scanner.close();
	}
}
