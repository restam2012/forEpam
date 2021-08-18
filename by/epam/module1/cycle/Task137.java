/*
* 7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
*/
package by.epam.module1.cycle;

import java.util.Scanner;

public class Task137 {
	public static void main(String[] args) {
		int m;
		int n;
		String message = new String();

		m = waitingInteger("first");
		n = waitingInteger("second");

		int val = m;
		while (val <= n) {
			for (int i = 2; i <= Math.sqrt(val); i++) { 
				if (val % i == 0) {
					message += i + " ";  //в сообщение добавляем делитель
					message += val / i + " "; //так же делителем является остаток от деления числа на делитель. Оно точно будет целое
				}
			}
			
			System.out.println("for val " + val + " dividers is " + message);
			
			message = "";
			val++;
		}
	}

	private static int waitingInteger(String message) {

		int value = 0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Enter %s int. \n", message);
		while (value <= 0) {
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("You enter not int. Try again.");
				System.out.printf("Enter %s int. \n", message);
			}

			value = scanner.nextInt();
			if (value <= 0) {
				System.out.println("You enter not positive value");
			}
		}

		return value;
	}
}