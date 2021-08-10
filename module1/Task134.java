/*
* 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
*/
package by.epam.lesson1.cycle;

public class Task134 {
	public static void main(String[] args) {
		int val = 200;
		long result = 1;

		for (int i = 1; i <= val; i++) {
			result *= i * i;

			if (result < 0) { // Выход, если привышен размер инта.
				System.out.printf("You have got used to the long size in %d cycle.", i);
				return;
			}
			
		}
		System.out.println(result);
	}
}