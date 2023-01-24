//Задание 1. 
//Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл, если введена "stop" строка тогда закончить запись в файл.

package by.academy.homework6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
	File file = new File("Homework6Task1.txt");
	if (!file.exists()) {
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	Scanner console = new Scanner(System.in);
	String s =null;
	try (FileWriter fw = new FileWriter(file);) {
		while(!(s=console.nextLine()).equals("stop"))
		fw.write(s+"\n");
		fw.close();
	} catch (IOException e1) {
		e1.printStackTrace();
	}
	console.close();
}
}
