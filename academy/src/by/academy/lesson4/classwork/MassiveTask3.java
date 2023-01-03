//3. Создать двумерный массив типа char размером 4х2. 
//И записать туда значения с помощью блока для инициализации. 
//Распечатать значения массива.

package by.academy.lesson4.classwork;

import java.util.Arrays;

public class MassiveTask3 {
	public static void main(String[] args) {

		char[][] array = {{'a','b'},{'c','d'},{'e','f'},{'h','k'}};

		System.out.println(Arrays.deepToString(array));
	}

}
