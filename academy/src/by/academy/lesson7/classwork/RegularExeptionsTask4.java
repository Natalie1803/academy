//Задание 10. (lesson 6)
//
//Дана строка “Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”  
//Найти все подстроки "Java <X>" и распечатать их.

package by.academy.lesson7.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExeptionsTask4 {
	static Pattern pattern = Pattern.compile("Java\\s\\d+");

	public static void main(String[] args) {
		String s = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
		Matcher matcher = pattern.matcher(s);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
