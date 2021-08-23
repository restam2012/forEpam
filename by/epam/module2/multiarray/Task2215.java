package by.epam.module2.multiarray;

/*
 * 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
 * */

public class Task2215 {
	public static void main(String[] args) {
		int[][] mass = { { 1, 2, 3, 4, 5, 66 }, { 49, 0, -10, 42, 0 }, { 454, 11, -52, 0, 5 }, { -52, 66, 13, -1, 5 },
				{ 1, -1, 2, -2, 6, 43 }, { 6 } };

		if (!isMatrixCorrect(mass)) {
			System.out.println("Matrix is not correct");
			return;
		}

		int max;

		max = findMax(mass);
		mass = replaceElement(mass, max); //заменяю только там, где нечетная пара. То есть [1][1] [1][3] [3][1] и т.д.

		printMatrix(mass);
	}

	private static boolean isMatrixCorrect(int[][] mass) {
		if (mass == null || mass.length == 0) { // если ссылка равна null или количество столбцов 0 - то матрица не
												// корректная
			return false;
		}

		for (int i = 1; i < mass.length; i += 2) {
			if (mass[i].length > 0) {
				return true; // если есть хоть один элемент в матрице, то она тоже корректная
			}
		}

		return false; // если в матрице все строки с 0 длинной - то матрица тоже не корректная
	}

	private static int findMax(int[][] mass) {
		int max = mass[0][0];
		for (int[] m : mass) {
			for (int element : m) {
				max = element > max ? element : max;
			}
		}

		return max;
	}

	private static int[][] replaceElement(int[][] mass, int max) {
		for (int i = 1; i < mass.length; i += 2) {
			for (int j = 1; j < mass[i].length; j += 2) {
				mass[i][j] = max;
			}
		}

		return mass;
	}
	
	private static void printMatrix(int[][] mass) {
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
	}
}