/*
 * 8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.*/

package by.epam.lesson2.decomposition;

import java.util.Scanner;

public class Task248 {
	public static void main(String[] args) {
		int[] mass = { 0, 1, 10, 2, 3, 33, 4, 5, 100, -1 };
		int sum = 0;
		int position;

		position = waitingInteger("start", mass.length);

		sum = sum(mass, position);
		
		System.out.println(sum);

	}

	private static int sum(int[] mass, int startIndex) {
		int sum = 0;
		
		for (int i = startIndex; i < startIndex + 3; i++) {
			sum += mass[i];
		}
		
		return sum;
	}

	private static int waitingInteger(String message, int length) {

		int value = 0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Enter %s position. \n", message);
		while (value <= 0 && value + 3 > length) {
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("You enter not int. Try again.");
				System.out.printf("Enter %s position. \n", message);
			}

			value = scanner.nextInt();
			if (value <= 0 && value + 3 > length) {
				System.out.println("You enter not correct position");
			}
		}

		return value;
	}
}