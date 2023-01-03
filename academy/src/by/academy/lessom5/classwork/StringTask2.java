//1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. 
//Вывести найденные строки и их длину.

package by.academy.lessom5.classwork;

import java.util.Scanner;

public class StringTask2 {
	public static void main(String[] args) {
		Scanner console =new Scanner(System.in);
		System.out.println("Введите количество срок:");
		int n = console.nextInt();
		
		String [] array = new String [n];
	
		for (int i=0; i<n; i++) {
			array [i] = console.nextLine();
			}
		
		for (int i=0; i<array.length-1; i++) {
		if (array[i].length() > array[i+1].length())
		System.out.println(array[i]);}
			
//		for (int i=0; i<array.length-1; i++) {
//			if (array[i].length() < array[i+1].length())
//			System.out.println(array[i]);}
			console.close();
	}
}
