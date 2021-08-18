package by.epam.module2.multiarray;

/*
 * 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
 * на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 * */

import java.util.Scanner;

public class Task228 {
    public static void main(String[] args) {
        int[][] mass = {{1, 2, 3, 4, 5, 66}, {49, 0, -10, 42, 0}, {454, 11, -52, 0, 5}, {-52, 66, 13, -1, 5}, {1, -1, 2, -2, 6}};
        
        int n1;
        int n2;
        int buffer;
        
        n1 = waitingInteger("fisrt", mass.length);
        n2 = waitingInteger("second", mass.length);
        
        for (int i = 0; i < mass.length; i++) {
            if(mass[i].length > n1 && mass[i].length > n2) {
                buffer = mass[i][n1];
                mass[i][n1] = mass[i][n2];
                mass[i][n2] = buffer;
            }
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private static int waitingInteger(String message, int length) {

		int value = -1;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Enter %s int. \n", message);
		while (value < 0 || value > length) {
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("You enter not int. Try again.");
				System.out.printf("Enter %s int. \n", message);
			}

			value = scanner.nextInt();
			if (value < 0 || value > length) {
				System.out.println("Your value isn't in size");
			}
		}

		return value;
	}
}
