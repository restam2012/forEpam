package by.epam.module2.multiarray;

/*
 * 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 * */

public class Task2213 {
	final static int DEFALUT_START_VALUE = -1;

	public static void main(String[] args) {
		final boolean IS_INCREASING = true;
		int[][] mass = { { 1, 2, 3, 4, 5, 66 }, { 49, 0, -10, 42, 0 }, { 454, 11, -52, 0, 5 }, { -52, 66, 13, -1, 5 },
				{ 1, -1, 2, -2, 6, 43 }, { 6 } };
		int longestLinePosition;

		longestLinePosition = findIndexOfLongestLine(mass);
		
		bubbleSortColumb(mass, longestLinePosition, IS_INCREASING);

		printMass(mass);
	}

	private static void printMass(int[][] mass) {
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
	}

	// if matrix is not square need to find the longest column
	private static int findIndexOfLongestLine(int[][] mass) {

		int longestLine = DEFALUT_START_VALUE;
		int longestLinePosition = DEFALUT_START_VALUE;

		for (int i = 0; i < mass.length; i++) {
			if (longestLine < mass[i].length) {
				longestLine = mass[i].length;
				longestLinePosition = i;
			}
		}

		return longestLinePosition;
	}

	private static int[][] bubbleSortColumb(int[][] mass, int longestLinePosition, final boolean IS_INCREASING) {
		for (int i = 0; i < mass[longestLinePosition].length; i++) {
			for (int j = mass.length - 1; j >= 1; j--) {
				int k = 0;
				//Данные переменные нужны что бы пропускать "короткие" строки (если матрица рваная)
				int first = DEFALUT_START_VALUE;
				int second = DEFALUT_START_VALUE;

				while (k < j) {

					if (first < 0 && mass[k].length > i) {
						first = k;
					}

					if (first >= 0 && second < 0 && mass[k + 1].length > i) {
						second = k + 1;
					}

					if (IS_INCREASING) {
						if (first >= 0 && second >= 0 && !isIncreasingSort(mass[first][i], mass[second][i])) {
							int buffer = mass[first][i];
							mass[first][i] = mass[second][i];
							mass[second][i] = buffer;
						}
					} else {
						if (first >= 0 && second >= 0 && isIncreasingSort(mass[first][i], mass[second][i])) {
							int buffer = mass[first][i];
							mass[first][i] = mass[second][i];
							mass[second][i] = buffer;
						}
					}

					if (first >= 0 && second >= 0) {
						first = second;
						second = -1;
					}

					k++;
				}
			}
		}
		return mass;
	}

	private static boolean isIncreasingSort(int first, int second) {
		if (first < second) {
			return true;
		} else {
			return false;
		}
	}

}
