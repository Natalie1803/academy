package by.academy.classwork10;

public class Application {
	public static void main(String[] args) {
		Printable[] array = new Printable[5];

		array[0] = new Book("Колобок");
		array[1] = new Book("Колобок 2");
		array[2] = new Book("Колобок возвращение");
		array[3] = new Magazine("Time", 2006);
		array[4] = new Magazine("Мурзилка", 2001);

		for (Printable p : array) {
			p.print();
		}
		Book.printBooks(array);
		Magazine.printMagazines(array);
	}
}
