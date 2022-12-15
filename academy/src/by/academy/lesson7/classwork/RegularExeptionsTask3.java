//5. Дана строка:
//" Hey      There!     How      Are you doing"   ;
//оставить лишь 1 пробел между слов.

package by.academy.lesson7.classwork;

public class RegularExeptionsTask3 {

	public static void main(String[] args) {

		String s = " Hey      There!     How      Are you doing";
		System.out.print(s.trim().replaceAll("\\s+", " "));

	}
}
