//Ввести на экран все вхождения символа S
package by.academy.lessom5.classwork;

public class StringTask1 {
	public static void main(String[] args) {
		String s= "Для работы со строками в языке Java используются классы String,"
			    + " StringBuilder, StringBuffer";
	
//		System.out.println(s.indexOf('S'));
//		System.out.println(s.lastIndexOf('S'));
//		System.out.println(s.indexOf('S',s.indexOf('S')+1));
		
		int index=-1;
		do {
		index=s.indexOf('S', index+1);	
			if (index>=0) {
			System.out.println(index); }
		} while 	(index>=0);
		

		
	}

}
