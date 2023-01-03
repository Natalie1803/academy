//6.	а) Создать обобщенный класс с тремя параметрами (T, V, K). Класс содержит три переменные типа (T, V, K), 
//конструктор, принимающий на вход параметры типа (T, V, K), методы возвращающие значения трех переменных. 
//Создать метод, выводящий на консоль имена классов для трех переменных класса.
//б) Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (классы-оболочки, String), 
//V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.

package by.academy.classwork12;

import by.academy.homework3.Bread;

public class Task6 { // вызов метода ThreeGeneric

	public static void main(String[] args) {
		ThreeGeneric<String, Bread, Double> threegeneric = new ThreeGeneric<>("Строка", new Bread(), 25.0);
		threegeneric.getClass();
		threegeneric.getK();
		threegeneric.printClassT();
		threegeneric.printClassV();
		threegeneric.printClassK();

	}

}
