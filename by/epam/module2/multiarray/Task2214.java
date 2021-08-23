package by.epam.module2.multiarray;

/*
 * 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца
 * */

import java.util.Random;

public class Task2214 {
	public static void main(String[] args) {
		final int M = 10;
		final int N = 10;
		
		int[][] mass;
		
		mass = doRandomMatrix(N, M);

		printMass(mass);
	}

	private static int[][] doRandomMatrix(int n, int m) {
		int[][] mass = new int[m][n];
		Random random = new Random();

		// the idea is go for element and change 0 to random(0 or 1)
		// problem is that most 1 is start of column
		// I can select another way, find random position, and then check, 0 or 1, but
		// in the end random will often select element with 1
		// so find 0 will be long
		int i = 0;
		while (i < mass[0].length) {
			int count = 0;
			while (count < i) {
				int j = 0;
				while (count < i && j < mass.length) {
					if (mass[j][i] == 0) {
						mass[j][i] = random.nextInt(2);
						count += mass[j][i] == 1 ? 1 : 0;
					}
					j++;
				}
			}
			i++;
		}

		return mass;
	}
	
	private static void printMass(int[][] mass) {
		for (int i1 = 0; i1 < mass.length; i1++) {
			for (int j1 = 0; j1 < mass[i1].length; j1++) {
				System.out.print(mass[i1][j1] + " ");
			}
			System.out.println();
		}
	}
}