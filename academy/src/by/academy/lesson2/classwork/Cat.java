package by.academy.lesson2.classwork;

public class Cat {
	int age;
	int money;
	String nickname;
	char initials;
	boolean isHomeAnimal;

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
		// Конструктор, который позволяет создавать кота без параметров
	}

	public Cat(String nickname) {
		this.nickname = nickname; // Конструктор, который задает имя коту
	}

	public int getMoney() // возвращает значение money
	{
		return this.money;
	}

	public void setMoney(int money) // задает значение money
	{
		this.money = money;
	}

	public char getInitials() {
		return this.initials;
	}

	public void setInitials(char initials) {
		this.initials = initials;
	}

	public boolean getIsHomeAnimal() {
		return this.isHomeAnimal;
	}

	public void setIsHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}
}
