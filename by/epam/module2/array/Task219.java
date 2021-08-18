package by.epam.module2.array;

/*
 * 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
 * чисел несколько, то определить наименьшее из них.
 * */

public class Task219 {
	public static void main(String[] args) {
		int[] mass = { 1, 2, 3, 4, 5, 6, 0, -10, 42, 454, 11, -52, 0, 5, 3 };
		int[][] massWithCount = new int[2][0];

		for (int i = 0; i < mass.length; i++) {
			massWithCount = findRepeatAndProcessThem(massWithCount, mass[i]);
		}

		int maxCount;
		
		maxCount = findMaxCount(massWithCount);
		
		System.out.println(maxCount);
	}

	private static int[][] findRepeatAndProcessThem(int[][] mass, int val) {
		for (int i = 0; i < mass[0].length; i++) {
			if (mass[0][i] == val) {
				mass[1][i] += 1;
				return mass;
			}
		}

		return addElementToMass(mass, val);
	}

	private static int[][] addElementToMass(int[][] mass, int val) {
		final int COUNT_OF_ELEMENT = 1; // в данный метод попадают только новые числа, которые еще не повторялись
		int[][] newMass = new int[2][mass[0].length + 1];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				newMass[i][j] = mass[i][j];
			}
		}

		newMass[0][newMass[0].length - 1] = val;
		newMass[1][newMass[1].length - 1] = COUNT_OF_ELEMENT;

		return newMass;
	}

	private static int findMaxCount(int[][] mass) {
		final int DEFAULT_COUNT = -1;
		int maxCount;
		int valWithMaxCount = 0;

		maxCount = DEFAULT_COUNT;

		for (int i = 0; i < mass[1].length; i++) {

			if (mass[1][i] > maxCount || (mass[1][i] == maxCount && mass[0][i] < valWithMaxCount)) {
				maxCount = mass[1][i];
				valWithMaxCount = mass[0][i];
			}

		}

		return valWithMaxCount;
	}
}
