//Задание 2.
//Создать руками текстовый файл, закинуть следующий текст:
//"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
//Создать новый файл result.txt. Программно считать файл с текстом, удалить все пробелы и записать полученный текст в result.txt.

package by.academy.homework6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Task2 {
	public static void main(String[] args) {
		File file = new File("result.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		File file1 = new File("C://Users//user//Desktop//", "Homework6Task2Text.txt");
		try (FileInputStream fileIn = new FileInputStream(file1);
				OutputStream fileOut = new FileOutputStream("result.txt")) {

			int a = -1;
			while ((a = fileIn.read()) != -1) {
				if (!Character.isWhitespace(a))
					fileOut.write(a);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
