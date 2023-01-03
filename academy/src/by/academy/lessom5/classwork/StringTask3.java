//2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) 
//значений их длины.

package by.academy.lessom5.classwork;

import java.util.Arrays;
import java.util.Scanner;

public class StringTask3 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Введите количество срок:");
		int n = console.nextInt();
		console.nextLine();
		String[] array = new String[n];

		for (int i = 0; i < n; i++) {
			array[i] = console.next();
		}

		String min = "Строка нулевая";

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i].length() < array[j].length()) {
					min = array[j];
					array[j] = array[i];
					array[i] = min;
				}
			}
		}
		System.out.println(Arrays.deepToString(array));
		console.close();

	}
}
