package by.academy.lesson4.classwork;

import java.util.Random;

public class TaskMassive1 {
	public static void main(String[] args) {
		int[] array = new int[10];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
		}
		System.out.println("initial array:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			array[i] += 10;
		}
		System.out.println("new array");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}
}
