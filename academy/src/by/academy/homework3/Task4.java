//4. С помощью DateTimeFormat пропарсить данные, введеные с консоли, в зависимости от паттерна, 
//к которому дата подходит. (в классе с методом main)
//Вывести строку в следующем формате:
//	День: <Day>
//	Месяц: <Month>
//	Year: <Year>

package by.academy.homework3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Task4 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.println("Введите дату: ");
		String strDate = console.nextLine();

		Matcher matcherA = Task3.patternA.matcher(strDate);
		Matcher matcherB = Task3.patternB.matcher(strDate);
		DateTimeFormatter formatterLDT = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.US);
		DateTimeFormatter formatterDT = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US);

		if (matcherA.matches()) { // Если введена дата в формате dd/MM/yyyy
			LocalDate format1 = LocalDate.parse(strDate, formatterLDT);
			System.out.println("День: " + format1.getDayOfMonth());
			System.out.println("Месяц: " + format1.getMonthValue());
			System.out.println("Год: " + format1.getYear());
		} else if (matcherB.matches()) { // Если введена дата в формате dd-MM-yyyy
			LocalDate format2 = LocalDate.parse(strDate, formatterDT);
			System.out.println("День: " + format2.getDayOfMonth());
			System.out.println("Месяц: " + format2.getMonthValue());
			System.out.println("Год: " + format2.getYear());
		} else
			System.out.println("Дата введена неверно");

		console.close();
	}
}