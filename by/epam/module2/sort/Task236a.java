package by.epam.module2.sort;

/*
 * 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . Если ai <= ai+1 , то продвигаются
 * на один элемент вперед. Если ai > ai+1 , то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 * */

import java.util.Arrays;

//Данный вариант программы основан на способе, предложенным в задании
public class Task236a {

	public static void main(String[] args) {

		int[] mass = { 0, 1, 10, 2, 3, 33, 4, 5, 100, -1 };

		if (!isMatrixCorrect(mass)) {
			System.out.println("Matrix is not exist or not correct");
			return;
		}
		
		mass = sortShell(mass);

		System.out.println(Arrays.toString(mass));
	}

	private static boolean isMatrixCorrect(int[] mass) {
		if (mass == null || mass.length == 0) {

			return false;
		}
		return true;
	}

	private static int[] sortShell(int[] mass) {
		int buffer;

		int i = 1;
		while (i < mass.length) {

			if (mass[i] < mass[i - 1]) {
				buffer = mass[i];
				mass[i] = mass[i - 1];
				mass[i - 1] = buffer;

				if (i - 1 != 1) {
					i--;
				} else {
					i++;
				}
			}
			
			else {
				i++;
			}

		}

		return mass;
	}
}
