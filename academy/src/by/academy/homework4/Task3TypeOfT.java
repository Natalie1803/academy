//Задание 3.
//Создать класс, который параметризуется любым типом (T). Имеет массив объектов нашего типа T.
//Содержит пустой конструктор, который по дефолту инициализирует пустой массив размерности 16.
//Содержит конструктор, принимающий значение int и инитает им размер нашего массива.
//
//Содержит методы:
//1) добавления в наш массив объекта типа T - add(T obj) (нужно помнить, что если массив заполнен, нам нужно его расширить с помощью Arrays.copyOf)
//2) взятие по индексу get(int i)
//3) взятие последнего элемента getLast()
//4) взятие первого элемента getFirst()
//5) вывод размера массива
//6) вывод индекса последнего заполненого элемента (не путать с размерностью)
//7) удаление элемента по индексу (remove(int i)
//8) удаление элемента по значению (remove(T obj))

package by.academy.homework4;

import java.util.Arrays;

public class Task3TypeOfT<T> {
	private T[] array;
	private int size;

	public T[] arrayCreator() {
		T[] array = (T[]) new Object[16];
		return array;
	}

	public T[] arrayCreator(int i) {
		T[] array = (T[]) new Object[i];
		return array;
	}

	public void add(T obj) {
		if (size == array.length) {
			array = Arrays.copyOf(array, array.length + 1);
		}
		array[size++] = obj;
	}

	public T get(int i) {
		return array[i];
	}

	public T getLast() {
		return array[array.length - 1];
	}

	public T getFirst() {
		return array[0];
	}

	public void printSize() {
		System.out.println("Размер массива: " + array.length);
	}

	public void lastFullElement() {
		for (int i = 0; i < array.length; i++) {
			if ((boolean) (array[i] = null))
				System.out.println("Индекс последного заполненного элемента: " + array[i - 1]);
			size=i;
			break;
		}
	}

	public void remove(int index) {
		System.arraycopy(array, index + 1, array, index, array.length - index - 1);
	}

	public void remove(T obj) {
		for (T Object : array) {
			if (Object.equals(obj)) {
				array.remove(Object);
			}
		}
	}
}
