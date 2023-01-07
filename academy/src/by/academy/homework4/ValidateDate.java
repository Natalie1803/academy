package by.academy.homework4;

import java.util.regex.Pattern;

public class ValidateDate {

	public ValidateDate() {
		super();
	}

	public static boolean validate(String date) {

		if (!(Pattern .matches("[0-3][0-9]-[0-1][0-9]-" + "\\d{4}", date))) {
			System.out.println("Дата введена неверно");
			return false;
		}
		return true;
	}

}
