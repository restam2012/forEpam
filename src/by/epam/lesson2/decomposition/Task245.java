/*
 * 5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов)*/

package by.epam.lesson2.decomposition;

public class Task245 {
	public static void main(String[] args) {
		double[] mass = { 0, 1, 10, 2, 3, 33, 4, 5, 100, -1 };

		System.out.println(findSecondMaxValue(mass));
	}

	private static double findSecondMaxValue(double[] mass) {
		double maxValue = Double.MIN_VALUE;
		double secondMaxValue = Double.MIN_VALUE;

		for (double i : mass) {

			if (i > maxValue) {
				secondMaxValue = maxValue;
				maxValue = i;
			} else if (i > secondMaxValue) {
				secondMaxValue = i;
			}

		}
		return secondMaxValue;
	}
}