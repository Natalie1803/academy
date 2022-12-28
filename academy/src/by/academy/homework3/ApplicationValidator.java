//5. Создать интерфейс Validator, с методом validate, принимающим строку, возвращая true/false.
//Написать класс AmericanPhoneValidator, который валидирует американский телефон(начинающийся на +1...)
//Написать класс BelarusPhoneValidator, который валидирует белорусский телефон(начинающийся на +375...) 
//Написать класс EmailValidator в методе main, валидирующий email.
//Все три класса должны реализовать интерфейс Validator.

package by.academy.homework3;

public class ApplicationValidator {
	static Validator americanPhoneValidator = new AmericanPhoneValidator();
	static Validator belarusianPhoneValidator = new BelarusianPhoneValidator();
	static Validator emailValidator = new EmailValidator();

	public static void main(String... args) {

		System.out.println(americanPhoneValidator.isValid("+13123123123"));
		System.out.println(belarusianPhoneValidator.isValid("+375331231232"));
		System.out.println(emailValidator.isValid("fedotova.natalia1111@gmail.com"));
	}
}
