//3. Написать класс, который проверял бы введенную дату на соответствие патерна: (использовать regexp)
//   a) dd/MM/yyyy
//   b) dd-MM-yyyy 

package by.academy.homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	static Pattern patternA = Pattern.compile("[0-3][0-9]/[0-1][0-9]/" + "\\d{4}");
	static Pattern patternB = Pattern.compile("[0-3][0-9]-[0-1][0-9]-" + "\\d{4}");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите дату в формате dd/MM/yyyy");
		Matcher matcherA = patternA.matcher(sc.nextLine());
		boolean a = matcherA.matches();
		System.out.println(a);

		System.out.println("Введите дату в формате dd-MM-yyyy");
		Matcher matcherB = patternB.matcher(sc.nextLine());
		boolean b = matcherB.matches();
		System.out.println(b);

		sc.close();

	}
}
