package by.epam.lesson2.decomposition;

/*
 * 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
*Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
*решения задачи использовать декомпозицию.
**/

import java.util.Scanner;

public class Task2413 {
	public static void main(String[] args) {
		int n;

		n = waitingInteger();
		
		for(int i = n; i < 2 * n - 2; i++) {
			if(findSimpleNum(i) && findSimpleNum(i + 2)) {
				
				System.out.println(i + " and " + (i + 2));
				
			}
		}
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
				System.out.println("You enter not positive value");
			}
		}

		return value;
	}

	private static boolean findSimpleNum(int num) {
		int i = 2;
		
		while(i <= num / 2) {
			if(num % i == 0) {
				return false;
			}
			i++;
		}
		
		return true;
	}
}