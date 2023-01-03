package by.academy.classwork10;

public class Magazine implements Printable {
	private String name;
	private int year;

	public Magazine() {
	}

	public Magazine(String name, int year) {
		this.name = name;
		this.year = year;
	}

	@Override
	public void print() {
		System.out.println("Magazine: " + name);

	}

	public static void printMagazines(Printable[] printable) {
		for (Printable p : printable) {
			if (p instanceof Magazine) {
				p.print();
			}
		}
	}
}
