//Задание 1.
//
//a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”. 
//б) Распечатать последний символ строки. Используем метод String.charAt().
//в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
//г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith(). 
//д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
//ж) Заменить все символы “а” на “о”. 
//з) Преобразуйте строку к верхнему регистру.
//и) Преобразуйте строку к нижнему регистру.
//к) Вырезать строку Java c помощью метода String.substring().

package by.academy.lesson6.classwork;

public class StringTask1 {

	public static void main(String[] args) { // задание а)
	
		String str = "I like Java!!!";
		process(str);
	}

	public static void process(String str) {
	System.out.println(str.charAt(str.length()-1)); // задание Б)
	
	if (str.endsWith("!!!")) // задание в)
		System.out.println("Строка заканчивается на !!!");
	
	if (str.startsWith("I like")) // задание г)
		System.out.println("Строка  начинается с I like");
	
	if (str.contains("Java")) // задание д)
		System.out.println("Строка  содержит Java");
	
		System.out.println(str.indexOf("Java")); // задание e)
		
		String s = str.replace('a','o') ; // задание ж)
		System.out.println(s);
		
		System.out.println(str.toUpperCase()); // задание з)
		
		System.out.println(str.toLowerCase()); // задание и)
		
		
		System.out.println("Java".substring("Java".indexOf("Java"), "Java".length())); // задание к)
}}
