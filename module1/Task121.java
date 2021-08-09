/*
* 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.
*/
package by.epam.lesson1.topic2;

import java.util.Scanner;

public class Task121 {
	public static void main(String[] args) {
		double x;
		double y;

		x = waitingDouble("first");
		y = waitingDouble("second");

		boolean isTriangle = false;

		if (x + y < 180) {
			isTriangle = true;

			System.out.print("The triangle is exist. ");
		} else {
			System.out.println("The triangle is don't exist.");
		}

		if (isTriangle) {
			if (x == 90 || y == 90 || x + y == 90) {
				System.out.println("And it is a rectangular.");
			} else {
				System.out.println("And it isn't a rectangular.");
			}
		}

	}

	public static double waitingDouble(String message) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Enter %s angle. \n", message);
		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.println("You enter not double. Try again.");
			System.out.printf("Enter %s angle. \n", message);
		}

		return scanner.nextDouble();
	}
}
