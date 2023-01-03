//1.	Создать класс User, содержащий private переменные login, password. 
//Создать внутренний класс Query в классе User. Класс Query содержит метод printToLog(), 
//который распечатывает на консоль сообщение о том что пользователь с таким то логином и паролем 
//отправил запрос. Класс User, содержит метод createQuery(), в котором создается объект класса Query 
//и вызывается метод printToLog(). В методе main(): создать экземпляр класса User и вызвать метод createQuery(); 
//создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию user.new Query(); 
//создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query(); 
package by.academy.classwork13;

public class User {
	private String login;
	private String password;

	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public User() {

	}

	class Query {
		void printToLog() {
			System.out.println("Пользователь " + login + "паролем: " + password + " отправил запрос");
		}
	}

	void createQuery() {
		Query query = new Query();
		query.printToLog();
	}

	public static void main (String[] args) {
		User user = new User("SHREK", "1241dfkja");
		user.createQuery();
		
		User.Query query = user.new Query();
		query.printToLog();
		
		User.Query query2 = new User("SJGJSG", "SKIJGKS").new Query();
		query2.printToLog();
	}
}
