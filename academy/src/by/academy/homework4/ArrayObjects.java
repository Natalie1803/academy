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

public class ArrayObjects<T> {
	private T[] array;
	private int size;
	private static final int DEFAULT_CAPASITY = 16;

	@SuppressWarnings("unchecked")
	public ArrayObjects() {
		super();
		this.array = (T[]) new Object[DEFAULT_CAPASITY];
	}

	@SuppressWarnings("unchecked")
	public T[] arrayCreator(int i) {
		array = (T[]) new Object[i];
		return array;
	}

	public ArrayObjects(T[] array) {
		super();
		this.array = array;
		size = array.length;
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

	public T getLastFullElement() {
		return array[size - 1];
	}

	public int size() {
		return size;
	}

	public T getFirst() {
		return array[0];
	}

	public void printSize() {
		System.out.println("Размер массива: " + array.length);
	}

	public void remove(int index) {
		if (index >= size || index < 0) {
			System.out.println("Попытка удаления пустого элемента");
			return;
		}
		if (index < size) {
			System.arraycopy(array, index + 1, array, index, size - index - 1);
			array[size--] = null;
		}
	}

	public void remove(T obj) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(obj))
				remove(i);
		}
	}

}
