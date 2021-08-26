package by.epam.module2.sort;

/*
 * 4. Сортировка обменами. Дана последовательность чисел a1 <= a2 <=...<= an .Требуется переставить числа в
 * порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1 . Если ai  ai+1 , то делается
 * перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 * */

import java.util.Arrays;

public class Task234 {
	
	public static void main(String[] args) {
		int[] mass = { 0, 1, 2, 3, 4, 5, 100 };
		
		if(!isMatrixCorrect(mass)) {
        	System.out.println("Matrix is not exist or not correct");
        	return;
        }
		
		mass = sortBubble(mass);

		System.out.println(Arrays.toString(mass));
	}

//Проверка, что матрица существует и действительно убывающая
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

	private static int[] sortBubble(int[] mass) {

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass.length - 1 - i; j++) {

				if (mass[j] < mass[j + 1]) {
					int buffer = mass[j];
					mass[j] = mass[j + 1];
					mass[j + 1] = buffer;
				}

			}
		}

		return mass;
	}
}
