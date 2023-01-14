// ЗАДАНИЯ 1-2
package by.academy.homework5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Task1 {

	// Задание 1. Напишите метод, который на вход получает коллекцию объектов, а
	// возвращает коллекцию уже без дубликатов

	public <T> Collection<T> duplicates(Collection<T> collection) {
		return new HashSet<>(collection);
	}

	public static void main(String... args) {

//	Задание 2.Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. 
//	Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз. 
//	Замерьте время, которое потрачено на это. 
//	Сравните результаты и предположите, почему они именно такие.

		ArrayList<Double> arrayList = new ArrayList<>();
		LinkedList<Double> linkedList = new LinkedList<>();
		final int N = 1000000;
		final int M = 100;
		for (int i = 0; i < N; i++) {
			arrayList.add(Math.random());
			linkedList.add(Math.random());
		}
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < M; i++) {
			arrayList.get((int) (Math.random() * (N - 1)));
		}
		System.out.println(System.currentTimeMillis() - startTime);

		startTime = System.currentTimeMillis();
		for (int i = 0; i < M; i++) {
			linkedList.get((int) (Math.random() * (N - 1)));
		}
		System.out.println(System.currentTimeMillis() - startTime);

	}
}
