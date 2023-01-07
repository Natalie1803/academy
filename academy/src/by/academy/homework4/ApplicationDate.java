package by.academy.homework4;

import java.util.Scanner;

public class ApplicationDate {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Введите дату: ");
		String strDate = console.nextLine();
		CustomDate customDate = null;
		if (ValidateDate.validate(strDate)) {

			customDate = new CustomDate(strDate);
			customDate.dayOfWeek();
			customDate.checkLeapDay();
		}

		console.close();

	}
}
