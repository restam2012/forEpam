/*
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

package by.epam.lesson2.decomposition;

public class Task242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mass = { 10, 50, 20, 100 };
		int nod;

		nod = mass[0];
		for (int i = 1; i < mass.length; i++) {
			nod = findNOD(nod, mass[i]);
		}

		System.out.println(nod);
	}

	private static int findNOD(int val1, int val2) {
		while (val1 != 0 && val2 != 0) {
			if (val1 > val2) {
				val1 %= val2;
			} else {
				val2 %= val1;
			}
		}
		return val1 + val2;
	}
}
