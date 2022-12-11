//Задание 1. 
//Ввести две строки с консоли. Определить, является ли одна строка перестановкой символов другой строки. Учитываем регистр. 
//Не использовать сортировку :) 
//Например: 
//1.	“hello” и “hlleo” -> true
//2.	“hello” и “art” -> false

package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2Task1 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Введите первую строку: ");
		String s1 = console.nextLine();
		System.out.println("Введите вторую строку:");
		String s2 = console.nextLine();

		if (s1.length() < s2.length() || s1.length() > s2.length())
			System.out.println("Строки не равны");

		String[] array1 = new String[s1.length()];
		String[] array2 = new String[s2.length()];
		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			array1[i] = String.valueOf(c1);
		}

		for (int j = 0; j < s2.length(); j++) {
			char c2 = s2.charAt(j);
			array2[j] = String.valueOf(c2);
		}
		System.out.println(Arrays.deepToString(array1));
		System.out.println(Arrays.deepToString(array2));

		for (int a = 0; a < array1.length; a++) {
			for (int b = 0; b < array2.length; b++) {
				if (array1[a].equals(array2[b]))
					array2[b] = "0";
			}
		}

		String[] array3 = new String[array2.length];
		for (int c = 0; c < array2.length; c++) {
			array3[c] = "0";
		}
		if (array1.length == array2.length && Arrays.deepToString(array2).equals(Arrays.deepToString(array3))) {
			System.out.println("Первая строка является перестановкой букв второй строки");
		}

		console.close();
	}
}