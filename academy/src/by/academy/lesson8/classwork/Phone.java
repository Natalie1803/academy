//1.	Класс Phone.
//a) Создайте класс Phone, который содержит переменные number, model и weight.
//б) Создайте три экземпляра этого класса. 
//в) Выведите на консоль значения их переменных. 
//г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//д) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight. 
//е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model. 
//ж) Добавить конструктор без параметров.
//з) Вызвать из конструктора с тремя параметрами конструктор с двумя. 
//и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
//к) Создать метод sendMessageс аргументами переменнойx длины(varargs). Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
//л) Изменить класс Phone в соответствии с концепцией JavaBean.
package by.academy.lesson8.classwork;

public class Phone {
	int number;
	String model;
	double weight;

	public Phone(int number, String model, double weight) {
		this(number, model);
		this.weight = weight;
	}

	public void receiveCall(String name) {
		System.out.println("Звонит " + name);
	}
	
	public void receiveCall(String name, int number) {
		System.out.println("Звонит " + name+ ", номер: "+ number);
	}

	public int getNumber() {
		return number;
	}

	public Phone(int number, String model) {
		this.number = number;
		this.model = model;
	}
	
	public Phone() {
	}
	
	static void sendMessages (int... array) {
		for (int a : array) {
			System.out.println ("Номер телефона для отправки сообщения: "+ a );
		}
	}
	
	@Override // alt +shift+s - to string и выбрать что переводить в строку, чтобы выводило правильно на экран, выбрать Generate
	public String toString() {
		return "Phone [number=" + number + ", model=" + model + ", weight=" + weight + "]";
	}

}
