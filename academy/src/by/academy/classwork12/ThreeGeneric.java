//6.	а) Создать обобщенный класс с тремя параметрами (T, V, K). Класс содержит три переменные типа (T, V, K), 
//конструктор, принимающий на вход параметры типа (T, V, K), методы возвращающие значения трех переменных. 
//Создать метод, выводящий на консоль имена классов для трех переменных класса.
//б) Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (классы-оболочки, String), 
//V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.

package by.academy.classwork12;

import java.io.Serializable;

import by.academy.homework3.Product;

public class ThreeGeneric<T extends Comparable, V extends Product & Serializable, K extends Number> {

	private T t;
	private V v;
	private K k;

	public ThreeGeneric(T t, V v, K k) {
		super();
		this.t = t;
		this.v = v;
		this.k = k;
	}

	public T getT() {
		return t;
	}

	public V getV() {
		return v;
	}

	public K getK() {
		return k;
	}

	public void setT(T t) {
		this.t = t;
	}

	public void setV(V v) {
		this.v = v;
	}

	public void setK(K k) {
		this.k = k;
	}

	public void printClassT() {
		System.out.println(t.getClass());
	}

	public void printClassV() {
		System.out.println(v.getClass());
	}

	public void printClassK() {
		System.out.println(k.getClass());
	}
}
