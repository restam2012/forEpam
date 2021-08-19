package by.epam.module2.multiarray;

/*
 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 * */

public class Task2212 {
	public static void main(String[] args) {
		int[][] mass = { { 1, 2, 3, 4, 5, 66 }, { 49, 0, -10, 42, 0 }, { 454, 11, -52, 0, 5 }, { -52, 66, 13, -1, 5 },
				{ 1, -1, 2, -2, 6, 666 }, { 6 } };
		
		final boolean IS_INCREASING = true;
		
		for (int i = 0; i < mass.length; i++) {
			
			if(IS_INCREASING) {
				mass[i] = bubbleSortIncreasing(mass[i]);
			} else {
				mass[i] = bubbleSortDecreasing(mass[i]);
			}
			
		}

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[] bubbleSortIncreasing(int[] line) {
		for (int j = line.length - 1; j >= 1; j--) {
			for (int k = 0; k < j; k++) {

				if (line[k] > line[k + 1]) {
					int buffer = line[k];
					line[k] = line[k + 1];
					line[k + 1] = buffer;
				}
			}
		}
		return line;
	}
	
	private static int[] bubbleSortDecreasing(int[] line) {
		for (int j = line.length - 1; j >= 1; j--) {
			for (int k = 0; k < j; k++) {

				if (line[k] < line[k + 1]) {
					int buffer = line[k];
					line[k] = line[k + 1];
					line[k + 1] = buffer;
				}
			}
		}
		return line;
	}
}