//Задание 1.
//Создать класс CustomDate, используя вложенные классы Год, Месяц, День. 
//Методы: задать дату, вывести на консоль день недели по заданной дате. 
//День недели представить в виде перечисления. 
//Рассчитать количество дней, в заданном временном промежутке.//можно использовать локалдэт
//Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки. 
//После валидации в конструкторе создаем объекты класса Year, Month, Day.
//Добавить метод, который проверяет высокосный ли год или нет. // можно использовать локалдэт

package by.academy.homework4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class CustomDate {
	private Year year;
	private Month month;
	private Day day;

	public CustomDate() {
		super();
	}

	public CustomDate(String date) {
		super();
		year = new Year(date);
		month = new Month(date);
		day = new Day(date);
	}

	public void setDate(String date) {
		year = new Year(date);
		month = new Month(date);
		day = new Day(date);
	}

	public int getYear() {
		return year.yearInt;
	}

	public int getMonth() {
		return month.monthInt;
	}

	public int getDay() {
		return day.dayInt;
	}

	public String setDate() {
		System.out.println("Введите дату: ");
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		String s = console.nextLine();
		return s;
	}

	public void dayOfWeek() {
		LocalDate date = LocalDate.of(getYear(), getMonth(), getDay());
		DayOfWeek dayWeekEnum = date.getDayOfWeek();
		System.out.println(dayWeekEnum);
	}

	public void timeInterval() {
		LocalDate end = LocalDate.of(getYear(), getMonth(), getDay());
		LocalDate start = LocalDate.of(getYear(), getMonth(), getDay());
		System.out.println(end.toEpochDay() - start.toEpochDay());
	}

	public void checkLeapDay() {
		int year = getYear();

		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("Год " + year + " высокосный");
		else
			System.out.println("Год " + year + " не высокосный");
	}

	class Year {
		int yearInt;

		Year(String date) {
			super();
			yearInt = Integer.parseInt(date.split("-")[2]);
		}
	}

	class Month {
		int monthInt;

		Month(String date) {
			super();
			monthInt = Integer.parseInt(date.split("-")[1]);
		}
	}

	class Day {
		int dayInt;

		Day(String date) {
			super();
			dayInt = Integer.parseInt(date.split("-")[0]);
		}
	}
}