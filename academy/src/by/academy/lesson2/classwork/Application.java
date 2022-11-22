package by.academy.lesson2.classwork;

public class Application {

public static void main(String[] args){
	
	Cat cat1 = new Cat ("Васька");
	Cat cat2= new Cat();

	cat1.eat();  // вызов метода eat у кота 1 , eat(cat1) нельзя!так как метод будет искаться в апликатион)
	cat1.sleep();
	cat1.walk();
	cat2.grow();
	cat2.grow();
	cat2.grow();
	System.out.println();
}
}