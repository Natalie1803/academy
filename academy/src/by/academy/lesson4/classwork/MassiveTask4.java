//4. Создать двухмерный массив 5х8 и инициализировать 
//его с помощью блока для инициализации. 
//Найти максимальное и минимальное значение в каждой "строке" 
//и записать эти значения в двухмерный массив 5х2. Распечатать оба массива.
// ДОРЕШАТЬ ДО КОНЦА!!!

package by.academy.lesson4.classwork;

public class MassiveTask4 {
	public static void main(String[] args) {

		int[][] array = { { 1, 1, 1, 1, 4, 1, 1, 1}, { 2, 2, 2, 2, 3, 2, 2, 2 }, { 3, 3, 3, 3, 7, 3, 3, 3 },
				{ 4, 4, 4, 4, 1, 4, 4, 4 }, { 5, 5, 5, 5, 7, 5, 5, 5, 5 } };
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		int max4 = 0;
		int max5 = 0;
		for (int i = 0; i < 7; i++) {
			if (array[0][i] > array[0][i + 1])
				max1 = array[0][i];
		}
		System.out.println(max1);

		for (int i = 0; i < 7; i++) {
			if (array[1][i] > array[1][i + 1])
				max2 = array[1][i];
		}
		System.out.println(max2);

		for (int i = 0; i < 7; i++) {
			if (array[2][i] > array[2][i + 1])
				max3 = array[2][i];
		}
		System.out.println(max3);

		for (int i = 0; i < 7; i++) {
			if (array[3][i] > array[3][i + 1])
				max4 = array[3][i];
		}
		System.out.println(max4);

		for (int i = 0; i < 7; i++) {
			if (array[4][i] > array[4][i + 1])
				max5 = array[4][i];
		}
		System.out.println(max5);

//		int[][] array2 ={ { 1, 1 }, { 2, 2}, { 3, 3 },	{ 4, 4}, { 5, 5 } };
	}

}
