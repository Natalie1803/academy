package by.academy.lesson2.classwork;

public class Application {

	public static void main(String[] args) {

		Cat barsik = new Cat();
		Cat cat2 = new Cat();
		barsik.nickname = "Барсик";

		barsik.eat(); // вызов метода eat у Барсика, eat(barsik) нельзя!так как метод будет искаться в
						// апликатион)
		barsik.sleep();
		barsik.walk();
		cat2.grow();// Вызовите методы grow у второго кота без имени 3 раза и выведите на экран его
					// возраст. Так как по дэфолту значение age 0, то вызвав 3 раза метод grow,
					// который увеличивает возраст на 1, мы получим age =3

		cat2.grow();
		cat2.grow();
		System.out.println(cat2.age); // выведите на экран возраст кота без имени
	}
}