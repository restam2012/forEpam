/*
* 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
*/
package by.epam.module1.cycle;

import java.util.Scanner;

public class Task131 {
	public static void main(String[] args) {

		int val = 0;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (val < 1) {

			System.out.println("Enter positive integer:");
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("You enter not integer. Try again");
			}
			val = scanner.nextInt();
			
			
			if (val >= 1) {
				System.out.println(count(val));
			}
			else {
				System.out.println("You enter not positive integer. Try again");
			}

		}
		
	}

	private static int count(int val) {
		if (val == 1)
			return 1;
		else {
			return val + count(val - 1);
		}
	}
}