package by.academy.lesson2.classwork;

public class Cat {
	int age=1;
	String nickname;

	public void grow() {
		age++;
	}

	public void sleep() {
		System.out.println("Кот спит");
	}

	public void eat() {
		System.out.println("Кот ест");
	}

	public void walk() {
		System.out.println("Кот гуляет");
	}

	public Cat() {
		// nothing
	}

	public Cat(String nickname) {
		this.nickname = nickname; // Добавить конструктор с параметром nickname, чтобы назвать кота
	}
int money;
}

public class Main {
	System.out.println("Second commit");

}
