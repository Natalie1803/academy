package by.academy.homework6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {

	public static void main(String[] args) {

		File dir = new File("./src/by/academy/homework6/textFiles");
		if (!dir.exists()) {
			dir.mkdir();
		}
		
		File resultOfFiles = new File("./src/by/academy/homework6/resultOfFiles.txt");

		if (!resultOfFiles.exists()) {
			try {
				resultOfFiles.createNewFile();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	
		StringBuffer s = new StringBuffer();
	
		try (FileInputStream fileIn = new FileInputStream("result.txt")) {

			int a = -1;
			while ((a = fileIn.read()) != -1) {
					s.append((char)a);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		int textLength = s.length();
		System.out.println("Длинна текста "+textLength);
		
		
		 try (FileWriter resultWriter = new FileWriter(resultOfFiles)) { 

			 for (int i = 1; i <= 100; i++) {
					File outputFile = new File(dir, i + ".txt");
					if (!outputFile.exists()) {
						try {
							outputFile.createNewFile();
							
						} catch (IOException e) {
							e.printStackTrace();
						}
	                }

	                int length = (int) (Math.random()*textLength);

	                try (BufferedReader reader = new BufferedReader(new FileReader("result.txt"));
	                     BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

	                    char[] chars = new char[length];
	                    reader.read(chars);
	                    writer.write(chars);
	                    resultWriter.write(outputFile.getName() + ", size: " + length + "\n");

	                } catch (IOException ex) {
	                    ex.printStackTrace();
	                }
	            }

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	}
}
