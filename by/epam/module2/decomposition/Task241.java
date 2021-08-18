/*
 * 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
*натуральных чисел:
*НОК(А, В) = A*B / НОД (А, В)
*/

package by.epam.module2.decomposition;

public class Task241 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int val1 = 10;
		int val2 = 25;
		double nok;
		
		nok = findNOK(val1, val2);
		System.out.println(nok);
	}

	//Для нахождения нод используем алгоритм Евклида
	private static int findNOD(int val1, int val2) {
		while(val1 != 0 && val2 != 0) {
			if(val1 > val2) {
				val1 %= val2;
			}
			else {
				val2 %= val1;
			}
		}
		return val1 + val2;
	}

	private static double findNOK(int val1, int val2) {		
		return (double)Math.abs(val1 * val2)/findNOD(val1, val2);
	}

}
