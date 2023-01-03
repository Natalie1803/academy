package by.academy.lesson4.classwork;

public class Massive {
	public static void main(String[] args) {
//	Задача 1. Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,  
//	отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).  
//	Перед созданием массива подумайте, какого он будет размера. 
//	2 4 6 … 18 20 
//	2 
//	4 
//	6 
//	… 
//	20

		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			for (int n = 2; i <= 20; i++) {
				if (n % 2 == 0)
					array[i] = n;
			}
		}
		System.out.print(array);
		System.out.println(array);
	}
}
