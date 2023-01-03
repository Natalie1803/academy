//3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) 
//средней, а также длину.

package by.academy.lessom5.classwork;

import java.util.Scanner;

public class StringTask4 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Введите количество срок:");
		int n = console.nextInt();
		console.nextLine();
		String[] array = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Введите строку: ");
			array[i] = console.next();
		}

		int fullLong = 0;
		for (int i = 0; i < array.length; i++) {
			fullLong = fullLong + array[i].length();
		}
		int averageLong = (int) Math.ceil(fullLong / n);
		System.out.println("Средняя длина строк: " + averageLong);

		for (int i = 0; i < array.length; i++) {
			if (array[i].length() < averageLong)
				System.out.println(array[i] + " Длина строки: " + array[i].length());
		}

		console.close();

	}
}