//Задание 12. (lesson 6)
//
//Предложение состоит из нескольких слов, разделенных пробелами. 
//Например: "One two three раз два три one1 two2 123 ". 
//Найти количество слов, содержащих только символы латинского алфавита.

package by.academy.lesson7.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExeptionsTask5 {
	static Pattern pattern = Pattern.compile("[a-zA-z]+[\\s]");

	public static void main(String[] args) {
		String s = "One two three раз два три one1 two2 123 ";
		Matcher matcher = pattern.matcher(s);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
