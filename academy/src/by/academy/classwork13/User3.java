//3.	Переписать класс Query используя статический класс.

package by.academy.classwork13;

public class User3 {
	private String login;
	private String password;

	public User3(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public User3() {

	}

	static class Query {
		private User3 user;

		public Query(User3 user) {
			this.user = user;
		}

		void printToLog() {
			System.out.println("Пользователь " + user.login + " c паролем: " + user.password + " отправил запрос");
		}
	}

	public static void main(String[] args) {
		User3 user = new User3("Халк", "12льваы");
//		// просто внутренние классы (без static)
//		User3.Query query = user.new Query(user);

		// вложенные классы со static
		User3.Query query1 = new User3.Query(user);
		query1.printToLog();
	}
}
