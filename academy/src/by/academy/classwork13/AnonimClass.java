package by.academy.classwork13;

public class AnonimClass {
	public static void main(String[] args) {
		Printable p = new Printable() {
			public void print() {
				System.out.println("Что-то печатает...");
			}
		};  //не забывать про точку с запятой в анонимных классах!!!
		p.print();
	}
}
