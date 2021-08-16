package by.epam.lesson2.decomposition;

/*
 * 15. ����� ��� ����������� n-������� �����, ����� � ������� �������� ������ ������������
 * ������������������ (��������, 1234, 5789). ��� ������� ������ ������������ ������������.
 * */

import java.util.Scanner;

public class Task2415 {
	public static void main(String[] args) {
		int n;

		n = waitingInteger();

		for (int i = numFromCount(n); i < numFromCount(n + 1); i++) {
			if (checkNum(i, n)) {
				System.out.println(i); //����� ���� �� � ������, �� ������� �� ������ ��� �������, ��� ������ ������������ ArrayList
			}
		}
	}

	private static int numFromCount(int count) {
		int num = 1;
		for (int i = 0; i < count - 1; i++) {
			num *= 10;
		}
		return num;
	}

	private static boolean checkNum(int val, int count) {
		int lastNum = val % 10;
		val /= 10;
		for (int i = 0; i < count - 1; i++) {
			if (lastNum > val % 10) {
				lastNum = val % 10;
				val /= 10;
			} else {
				return false;
			}
		}
		return true;
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
}