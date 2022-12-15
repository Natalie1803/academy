//2. Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//текста также могут быть пробелы, но могут и отсутствовать.

package by.academy.lesson7.classwork;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularTask2 {
	static Pattern pattern = Pattern.compile("\\s+");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите строку:");
		String s = sc.nextLine().trim();

		String[] words = pattern.split(s);
		System.out.println(words.length);

		sc.close();
	}
}