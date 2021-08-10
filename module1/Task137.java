/*
* 7. ��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, ����� ������� � ������ �����.
m � n �������� � ����������.
*/
package by.epam.lesson1.cycle;

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
					message += i + " ";  //� ��������� ��������� ��������
					message += val / i + " "; //��� �� ��������� �������� ������� �� ������� ����� �� ��������. ��� ����� ����� �����
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