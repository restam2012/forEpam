/*
 * 10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N */

package by.epam.module2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task2410 {
	public static void main(String[] args) {
		int val;
		int[] mass;

		val = waitingInteger();
		mass = doMass(val);

		System.out.println(Arrays.toString(mass));
	}

	private static int[] doMass(int val) {
		int size;
		int[] mass;

		size = findSizeOfMass(val);
		mass = new int[size];

		for (int i = size - 1; i >= 0; i--) {
			mass[i] = val % 10;
			val /= 10;
		}

		return mass;
	}

	private static int findSizeOfMass(int val) {
		int count = 1;

		while (val >= 10) {
			val /= 10;
			count++;
		}

		return count;
	}

	private static int waitingInteger() {

		int value = 0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Enter integer. \n");
		while (value <= 0) {
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("You enter not int. Try again.");
				System.out.printf("Enter integer. \n");
			}

			value = scanner.nextInt();
			if (value <= 0) {
				System.out.println("You enter not positiv integer");
			}
		}

		return value;
	}
}