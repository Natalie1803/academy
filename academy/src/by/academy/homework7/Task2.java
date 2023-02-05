//Задача 2. Reflection API.
//a)Создать свой класс Person с полями: firstName, lastName, age, dateOfBirth 
//b)Добавить класс User, который наследуется от Person, с полями: login, password, email
//c)Добавить гетеры, сетеры. Добавить метод printUserInfo в User. Вывести с помощью рефлексии все поля и методы, сначала через 
//getMethod("name")
//getMethods()
//getField("name")
//getFields()
//а затем через 
//getDeclaredMethod("name")
//getDeclaredMethods()
//getDeclaredField("name")
//getDeclaredFields()
//Посмотреть разницу. Просетать все значения через Reflection. (set метод класса Field). Вывести значения полей через Reflection. (get метод класса Field). 
//Вызвать toString через invoke.

package by.academy.homework7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.Arrays;

public class Task2 {
	public static void main(String[] args) {
		User user = new User("Том", "Круз", 35, "11.11.1985", "kruz", "sldkss", "kruz@gmail.com");
		Class<User> userClass = User.class;
		try {

			System.out.println(userClass.getMethod("getFirstName"));        // getMethod("name")
			System.out.println(Arrays.toString(userClass.getMethods()));	//getMethods()
			System.out.println(User.class.getField("firstName")); 			//getField("name")
			System.out.println(Arrays.toString(userClass.getFields()));     //getFields()
			
			System.out.println(userClass.getDeclaredMethod("printUserInfo"));    // getDeclaredMethod("name") обязательно public
			System.out.println(Arrays.toString(userClass.getDeclaredMethods())); //getDeclaredMethods()
			System.out.println(userClass.getDeclaredField("login")) ; 			 //getDeclaredField("name")
			System.out.println(Arrays.toString(userClass.getDeclaredFields()));	 //getDeclaredFields()
	
			Field userFirstName = User.class.getSuperclass().getDeclaredField("firstName");
			userFirstName.setAccessible(true);
			userFirstName.set(user, "Leonardo");

			Field userLastName = User.class.getSuperclass().getDeclaredField("lastName");
			userLastName.setAccessible(true);
			userLastName.set(user, "DiCaprio");

			Field userDateOfBirth = User.class.getSuperclass().getDeclaredField("dateOfBirth");
			userDateOfBirth.setAccessible(true);
			userDateOfBirth.set(user, "09.03.1974");

			Field userAge = User.class.getSuperclass().getDeclaredField("age");
			userAge.setAccessible(true);
			userAge.set(user, 55);

			Field userLogin = userClass.getDeclaredField("login");
			userLogin.setAccessible(true);
			userLogin.set(user, "dicaprio");

			Field userPassword = userClass.getDeclaredField("password");
			userPassword.setAccessible(true);
			userPassword.set(user, "lflflf");

			Field userEmail = userClass.getDeclaredField("email");
			userEmail.setAccessible(true);
			userEmail.set(user, "dicaprio@gmail.com");

			Method info = userClass.getDeclaredMethod("printUserInfo");
			info.invoke(user);

		} catch (NoSuchMethodException | NoSuchFieldException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
}}
