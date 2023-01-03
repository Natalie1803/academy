//1.	Создайте объект класса LocalDate, указывая дату своего рождения. 
//Вывести на консоль день недели, день в году, месяц, год. Создайте  объект класса LocalDate, представляющий текущую дату. 
//Сравните его со своим днем рождения используя методы isAfter(), isBefore().
package by.academy.classwork11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateCustom {  // имя класса не должно совпадать с именами библиотек
	public static void main(String[] args) {
	
	LocalDate bday = LocalDate.of(1997, 11, 18);

		DayOfWeek dayWeekEnum = bday.getDayOfWeek();
		System.out.println (dayWeekEnum);
		
		int dayYear = bday.getDayOfYear();
		System.out.println(dayYear);
		
		Month month = bday.getMonth();
		System.out.println(month);
		
		int year = bday.getYear();
		System.out.println(year);

		LocalTime timeNow= LocalTime.now();
		System.out.println(timeNow);
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		 if (bday.isAfter(today))
		 System.out.println("Дата дня рождения позже сегодня");
		 else 
			 System.out.println("Дата дня рождения раньше сегодня");
		 
		 if (bday.isBefore(today))
			 System.out.println("Дата дня рождения раньше сегодня");
		 else 
			 System.out.println("Дата дня рождения позже сегодня"); 
	}

}