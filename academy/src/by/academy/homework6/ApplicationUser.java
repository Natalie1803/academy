package by.academy.homework6;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ApplicationUser {
	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<>();
		User user1 = new User("Kate", "Midlton", 35);
		User user2 = new User("Mister", "Shrek", 40);
		User user3 = new User("Donald", "Trumph", 66);
		User user4 = new User("Kati", "Perry", 35);
		User user5 = new User("Alex", "Mamon", 10);
		User user6 = new User("John", "Snow", 32);
		User user7 = new User("Santa", "Klaus", 88);
		User user8 = new User("Miki", "Maus", 12);
		User user9 = new User("Ded", "Hatabich", 99);
		User user10 = new User("Pinkey", "Pay", 5);

		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		users.add(user6);
		users.add(user7);
		users.add(user8);
		users.add(user9);
		users.add(user10);

		File directory = new File("./src/by/academy/homework6/users");
		if (!directory.exists()) {
			directory.mkdir();
		}

		for (User user : users) {
			File outputFile = new File(directory, user.getName() + "_" + user.getSurname());
			if (!outputFile.exists()) {
				try {
					outputFile.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try (ObjectOutputStream oos = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream(outputFile)))) {
				oos.writeObject(user);
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}

		}
	}

}
