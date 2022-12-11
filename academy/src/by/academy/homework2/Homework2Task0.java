//Задание 0.
//Дан массив с int переменными, определить количество пар, разность которых эквивалентна заданному 
//с консоли target значению. 
//Например, дан массив чисел [1,2,3,4] и введенное с консоли target значение 1, у нас есть три пары, 
//которые подходят под заданное условие: 2-1=1, 3-2=1, 4-3=1.
//Нужно дописать код в pairs функции, которая принимает массив int значений и target int переменную, 
//которая бы возвращала количество пар с заданной разностью.
//Параметры:
//•	k: int, target переменная, разница
//•	arr: массив int значений
//Формат ввода:
//•	Первая строка принимает 2 значения отделенных пробелом, размер массива arr и target значение. (n и k)
//•	Вторая строка содержит n отделенных друг от друга int значений массива arr.
//Ограничения:
//•	каждое значение arr[i] должно быть уникальным
//Формат вывода:
//Целочисленное число, отображающее количество пар, разность которых равна k (target переменной)
//Пример ввода:
//5 2  
//1 5 3 4 2 
//Пример вывода: 3
//Объяснение:
//Массив содержит 3 пары int переменных, разность которых равна 3: 
//[5,3], [4,2], [3,1].

package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2Task0 {

	static int pairs(int k, int[] arr) {
		int pairsCount = 0;
		Arrays.sort(arr);
		int a = 0;
		int b = 1;

		while (b < arr.length) {

			if (arr[b] - arr[a] == k) {
				a++;
				b++;
				pairsCount++;
			} else if (arr[b] - arr[a] > k) {
				a++;
			} else {
				b++;
			}
		}
		return pairsCount;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(arrItems[i]);
			System.out.println(arr[i]);
		}

		int result = pairs(k, arr);
		System.out.println("Результат: "+ result);

		scanner.close();

	}
}
