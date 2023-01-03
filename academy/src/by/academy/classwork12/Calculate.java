//9.	Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы - 
//sum, multiply, divide, subtraction. Параметры этих методов  - два числа разного типа, над которыми должна быть произведена операция.

package by.academy.classwork12;

public class Calculate {
	
	public static <T extends Number, V extends Number> double sum(T a, V b) {
	return a.doubleValue()+b.doubleValue();
	}
	
	public static <T extends Number, V extends Number> double multiply(T a, V b) {
		return a.doubleValue()*b.doubleValue();
		}
	
	public static <T extends Number, V extends Number> double divide(T a, V b) {
		return a.doubleValue()/b.doubleValue();
		}
	
	public static <T extends Number, V extends Number> double subsraction(T a, V b) {
		return a.doubleValue()-b.doubleValue();
		}	
}
