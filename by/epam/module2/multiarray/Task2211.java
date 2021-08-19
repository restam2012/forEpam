package by.epam.module2.multiarray;

/*
 * 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз
 * */

import java.util.Random;

public class Task2211 {
	public static void main(String[] args) {
		final int DEFAULT_MASS_COLUMB_LENGTH = 10;
		final int DEFAULT_MASS_LINE_LENGTH = 20;
		final int VAL_TO_FIND = 5;

		int[][] mass;

		mass = createRandomMass(DEFAULT_MASS_COLUMB_LENGTH, DEFAULT_MASS_LINE_LENGTH);
		
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < mass.length; i++) {
			if(isLineContainVal(mass[i], VAL_TO_FIND)) {
				System.out.print(i + " ");
			}
		}
		
	}

	private static int[][] createRandomMass(int columbLength, int lineLength) {
		int[][] mass = new int[columbLength][lineLength];
		Random random = new Random();

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = random.nextInt(16);
			}
		}
		
		return mass;
	}
	
	private static boolean isLineContainVal(int[] line, final int VAL_TO_FIND) {
		int count = 0;
		
		for(int i = 0; i < line.length; i++) {
			
			if(line[i] == VAL_TO_FIND) {
				count++;
			}
			
			if(count == 3) {
				return true;
			}
			
		}
		
		return false;
	}
}