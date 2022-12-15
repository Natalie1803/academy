package by.academy.lesson8.classwork;

public class ApplicationPhone {
	public static void main(String[] args) {
		Phone myPhone1 = new Phone(12345, "IPhone", 20.4);
		Phone myPhone2 = new Phone(34534, "Huawei", 18.1);
		Phone myPhone3 = new Phone(86775, "Samsung", 19.1);
		
		System.out.println(myPhone1);
		System.out.println(myPhone2);
		System.out.println(myPhone3);
		
		myPhone1.receiveCall("Гарри Поттер");
		myPhone1.getNumber();
		System.out.println(	myPhone1.getNumber());
		
		myPhone2.receiveCall("Гермиона");
		myPhone2.getNumber();
		System.out.println(	myPhone2.getNumber());
		
		myPhone3.receiveCall("Рон");
		myPhone3.getNumber();
		System.out.println(	myPhone3.getNumber());
		
		
		myPhone1.receiveCall("Гарри Поттер", 273643);
		myPhone2.receiveCall("Гермиона", 3939944);
		myPhone3.receiveCall("Гермиона", 456452);
	}
}
