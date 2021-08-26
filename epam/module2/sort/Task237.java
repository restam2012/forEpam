package by.epam.module2.sort;

/*
 * 7. Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <=...<= an и b1 <= b2 <=...<= bm .
 * Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <=...<= bm в первую
 * последовательность так, чтобы новая последовательность оставалась возрастающей.
 * */

public class Task237 {

	public static void main(String[] args) {
		int[] mass1 = { -1, 0, 1, 2, 3, 4, 5, 10, 33, 100 };
		int[] mass2 = { 1, 2, 4, 8, 16, 32, 64, 128 };
		
		final int START_POSITION_TO_FIND = 0;

		if (!isMatrixCorrect(mass1) || !isMatrixCorrect(mass2)) {
			System.out.println("One of the matrices is not exist or not correct");
			return;
		}

		int selectIndex;
		
		selectIndex = START_POSITION_TO_FIND;
		
		//selectIndex предназначен для того, что бы не начинать поиск с начала массива, так как мы
		for (int i : mass2) {
			selectIndex = binSearch(selectIndex, mass1, i);
			System.out.printf("Val %d insert to position %d\n", i, selectIndex);
		}
	}

	private static boolean isMatrixCorrect(int[] mass) {

		if (mass == null || mass.length == 0) {

			return false;
		}

		for (int i = 1; i < mass.length; i += 2) {
			if (mass[i - 1] > mass[i]) {
				return false;
			}
		}

		return true;
	}

	private static int binSearch(int index, int[] mass, int val) {
		return binSearch(index, mass.length, val, mass);
	}

	private static int binSearch(int startIndex, int endIndex, int val, int[] mass) {
		if (startIndex == mass.length) {
			return startIndex;
		}

		if (startIndex == endIndex) {
			if (mass[startIndex] < val) {
				return startIndex + 1;
			} else {
				return startIndex;
			}
		}

		int middle;
		
		middle = (startIndex + endIndex) / 2;
		
		if (mass[middle] > val) {
			endIndex = middle;
			
			return binSearch(startIndex, endIndex, val, mass);
		} else if (mass[middle] < val) {
			startIndex = middle + 1;
			
			return binSearch(startIndex, endIndex, val, mass);
		} else {
			return middle;
		}
	}
}