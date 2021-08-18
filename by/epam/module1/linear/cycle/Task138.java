/*
* 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
*/
package by.epam.module1.linear.cycle;

import java.util.Scanner;

public class Task138 {
	public static void main(String[] args) {
		int m;
		int n;
		int buff;
		String message = new String();

		m = waitingInteger("first");
		n = waitingInteger("second");

		while (n > 0) {
			int remainder;

			remainder = n % 10;
			n /= 10;

			buff = m;
			while (buff > 0) {
				int remainderBuff;

				remainderBuff = buff % 10;
				buff /= 10;

				if (remainder == remainderBuff) {
					message += remainder + " ";
				}
			}
		}

		System.out.println(message);
	}

	private static int waitingInteger(String message) {

		int value = 0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Enter %s int. \n", message);
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("You enter not int. Try again.");
			System.out.printf("Enter %s int. \n", message);
		}

		value = scanner.nextInt();

		return value;
	}
}