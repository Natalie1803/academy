package by.academy.homework3;

import java.util.Scanner;

public class Person {
	String name;
	double money;
	String dateOfBirth;
	String phone;
	String email;

	public Person(String name, double money, String phone, String email, String dateOfBirth) {
		this.name = name;
		this.money = money;
		this.phone = phone;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}

	public Person(String name, double money) {
		this.name = name;
		this.money = money;
	}

	public Person() {
	}

	public double getMoney() {
		return this.money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getdateOfBirth() {
		return this.dateOfBirth;
	}

	public String getPhone() {
		return this.phone;
	}

	public String getEmail() {
		return this.email;
	}

//	8. Добавить в User поле dateOfBirth, которое задается с консоли, проверяется по regexp на соответствие паттернам из 3 задания.

	public void checkBday() {
		Scanner console = new Scanner(System.in);
		System.out.println("Введите дату рождения: ");
		this.dateOfBirth = console.nextLine();
		console.close();

		if (Task3.patternA.matcher(dateOfBirth).matches() || Task3.patternB.matcher(dateOfBirth).matches())
			System.out.println("Дата введена верно");
		else
			System.out.println("Дата введена неверно");
	}

//	9. Добавить поле phone и email в User, которое будет проверятся нашими Validator из 5 задания. (проверка на белорусский телефон)

	public boolean checkPhone(String phone) {
		this.phone = phone;
		return ApplicationValidator.belarusianPhoneValidator.isValid(phone);
	}

	public boolean checkEmail(String email) {
		this.email = email;
		return ApplicationValidator.emailValidator.isValid(email);
	}

}
