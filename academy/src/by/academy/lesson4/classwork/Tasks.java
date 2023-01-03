package by.academy.lesson4.classwork;

import java.util.Scanner;

public class Tasks {
	public static void main(String[] args) {
		// Циклы.
		// Задача №1
//		int a = 5;
//		while (a >= 0) {
//			System.out.println("a=" + a);
//			a--;
//		}
//		
//		// Задача №2	
//		int sum=0;
//		int i =0;
//		while (i<20) {
//			if (i%2==0) {
//				sum+=i;	
// 			}
//		i++;
//		}
//		System.out.println("sum = "+sum);

		Scanner sc = new Scanner(System.in);
//		6. В сберкассу на трёхпроцентный вклад положили S рублей.Какой станет сумма вклада через N лет.
		System.out.println("Введите срок вклада, лет:");
		int age = sc.nextInt();
		System.out.println("Введите сумму вклада:");
		double sumOfMoney = sc.nextDouble();

		for (int i = 1; i <= age; i++) {
			sumOfMoney = sumOfMoney * 1.03;
		}
		System.out.println("Сумма вклада: " + sumOfMoney);
		sc.close();
	}
}
