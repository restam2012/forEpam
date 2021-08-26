package by.epam.module2.multiarray;

/*
 * 16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., 2n
 *  так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между 
 *  собой. Построить такой квадрат. Пример магического квадрата порядка 3:
 * */

import java.util.Scanner;

public class Task2216 {

	public static void main(String[] args) {
		int n;
		int[][] mass;
		
		n = waitingInteger();
		
		if (n % 2 != 0) {
			mass = forOddSquare(n);
		} else if (n % 4 == 0) {
			mass = forEvenEvenSquare(n);
		} else {
			mass = forEvenEvenSquare(n - 2);
			mass = forEvenOddSquare(mass, n);
		}

		printMatrix(mass);
	}
	
    private static int waitingInteger() {
    	final int MIN_SIZE = 3;

		int value = -1;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter size of mass");
		while (value < MIN_SIZE) {
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("You enter not int. Try again.");
				System.out.println("Enter size of mass");
			}

			value = scanner.nextInt();
			if (value < MIN_SIZE) {
				System.out.println("Your value less than the minimum size. Minimum size is 3. Try again");
			}
		}

		return value;
	}

	private static int[][] forOddSquare(int n) {
		int[][] mass = new int[n][n];
		final int forEnd = n * n;
		int count = 1;
		int positionX = n / 2;
		int positionY = 0;
		mass[positionY][positionX] = count;
		count++;
		while (count <= forEnd) {
			if ((count - 1) % n == 0) {
				positionY++;
			} else {
				positionX++;
				positionY--;
			}
			if (positionX < 0)
				positionX = n - 1;
			else if (positionX == n)
				positionX = 0;

			if (positionY < 0)
				positionY = n - 1;
			else if (positionY == n)
				positionY = 0;

			mass[positionY][positionX] = count;
			count++;
		}
		return mass;
	}

	static private int[][] forEvenEvenSquare(int n) {
		int[][] mass = new int[n][n];
		int count = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mass[i][j] = count;
				count++;
			}
		}
		// main digital 870
		int line = 0;
		for (int i = 0, j = line; j < (n + line) / 2; i++, j++) {
			int buffer = mass[i][j];
			mass[i][j] = mass[n - i - 1][n - j - 1];
			mass[n - i - 1][n - j - 1] = buffer;
		}
		line = n - 1;
		for (int i = 0, j = line; j >= (line + 1) / 2; i++, j--) {
			int buffer = mass[i][j];
			mass[i][j] = mass[n - i - 1][n - j - 1];
			mass[n - i - 1][n - j - 1] = buffer;
		}
		// other digital
		for (line = 4; line < n - 1; line += 4) {
			for (int i = 0, j = line; j < n; i++, j++) {
				int buffer = mass[i][j];
				mass[i][j] = mass[n - i - 1][n - j - 1];
				mass[n - i - 1][n - j - 1] = buffer;
			}
		}
		for (line = 3; line < n - 1; line += 4) {
			for (int i = 0, j = line; j >= 0; i++, j--) {
				int buffer = mass[i][j];
				mass[i][j] = mass[n - i - 1][n - j - 1];
				mass[n - i - 1][n - j - 1] = buffer;
			}
		}
		return mass;
	}

	static private int[][] forEvenOddSquare(int[][] oldMass, int n) {
		int[][] mass = new int[n][n];
		for (int i = 0; i < oldMass.length; i++) {
			for (int j = 0; j < oldMass.length; j++) {
				mass[i + 1][j + 1] = oldMass[i][j] + 2 * (n - 1);
			}
		}
		int m = n / 2;
		int d = n * n + 1;
		mass[0][0] = 3 * m - 1;
		mass[0][n - 1] = 1;
		mass[n - 1][0] = d - 1;
		mass[n - 1][n - 1] = d - 3 * m + 1;
		int count = 1;
		// set top size
		for (int i = 1; i <= m - 2; i++) {
			if (count < n - 1) {
				mass[0][count] = 2 * i + 1;
				count++;
			} else
				break;
		}
		int c = 1;
		while (c <= m && count < n - 1) {
			mass[0][count] = d - 2 * c;
			c++;
			count++;
		}
		// set leftSize
		mass[1][0] = 2 * m - 1;
		count = 2;
		c = 1;
		while (c <= m / 2 + 1 && count < n - 1) {
			mass[count][0] = d - 4 * m + 1 + c;
			count++;
			c++;
		}
		c = 1;
		while (c <= m / 2 && count < n - 1) {
			mass[count][0] = 3 * m - 1 - c;
			count++;
			c++;
		}
		c = 1;
		while (c <= m / 2 - 1 && count < n - 1) {
			mass[count][0] = 3 * m - 1 + c;
			count++;
			c++;
		}
		c = 1;
		while (c <= m / 2 - 1 && count < n - 1) {
			mass[count][0] = d - 2 * m - c;
			count++;
			c++;
		}
		// set right size
		for (int i = 1; i < n - 1; i++) {
			mass[i][n - 1] = n * n + 1 - mass[i][0];
		}
		// set button size
		for (int i = 1; i < n - 1; i++) {
			mass[n - 1][i] = n * n + 1 - mass[0][i];
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