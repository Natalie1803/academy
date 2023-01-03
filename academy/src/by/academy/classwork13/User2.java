//2.	Переписать предыдущее задание, используя локальный класс. 

package by.academy.classwork13;

public class User2 {
	private String login;
	private String password;

	public User2(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public User2() {

	}

	void createQuery() {

		class Query {
			void printToLog() {
				System.out.println("Пользователь " + login + "паролем: " + password + " отправил запрос");
			}
		}
		Query query = new Query();
		query.printToLog();
	}

	public static void main(String[] args) {
		User2 user = new User2("SHREK", "1241dfkja");
		user.createQuery();

	}

}
