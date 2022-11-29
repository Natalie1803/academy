//Задание 4.
//Выводить на консоль степень двойки, пока результат не будет больше, чем 1_000_000. 
//

package by.acedemy.homework1;

public class Task4 {
	public static void main(String[] args) {
		long n = 2;
		long max = 1000000;
		int count = 1;

		do {
			n = n * n;
			count++;
		} while (n <= max);
		System.out.println(count);
	}
}