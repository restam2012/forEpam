package by.epam.module2.sort;

/*
 * 5. Сортировка вставками. Дана последовательность чисел a1,a2,...,an . Требуется переставить числа в порядке
 * возрастания. Делается это следующим образом. Пусть a1,a2,...,ai - упорядоченная последовательность, т. е.
 * a1 <= a2 <=...<= an . Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
 * последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
 * не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 * */

import java.util.Arrays;

public class Task235 {
	public static void main(String[] args) {
		int[] mass = { 0, 1, 10, 2, 3, 33, 4, 5, 100, -1 , 0};
		
		if(!isMatrixCorrect(mass)) {
        	System.out.println("Matrix is not exist or not correct");
        	return;
        }

		for (int i = 1; i < mass.length; i++) {
			int index = binSearch(i, mass);
			changePosition(mass, i, index);
		}

		System.out.println(Arrays.toString(mass));
	}

	private static boolean isMatrixCorrect(int[] mass) {
		if (mass == null || mass.length == 0) {

			return false;
		}
		return true;
	}

	private static int binSearch(int index, int[] mass) {
		return binSearch(0, index - 1, mass[index], mass);
	}

	private static int binSearch(int startIndex, int endIndex, int val, int[] mass) {

		if (startIndex == endIndex) {
			if (mass[startIndex] < val)
				return startIndex + 1;
			else
				return startIndex;
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

	private static void changePosition(int[] mass, int endPosition, int selectPosition) {
		int buffer;

		for (int i = endPosition - 1; i >= selectPosition; i--) {
			buffer = mass[i + 1];
			mass[i + 1] = mass[i];
			mass[i] = buffer;
		}
	}
}
