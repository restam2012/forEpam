/*
 * 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
 * 
 * Делал метод для нахождения цифр в целых числах. Хотя можно переделать и для double.
 * */

package by.epam.lesson2.decomposition;

import java.util.Scanner;

public class Task2411 {
    public static void main(String[] args) {
        int val1;
        int val2;
        int sizeOfVal1;
        int sizeOfVal2;
        
        val1 = waitingInteger("first");
        val2 = waitingInteger("second");
        
        sizeOfVal1 = findSizeOfMass(val1);
        sizeOfVal2 = findSizeOfMass(val2);
        
        if(sizeOfVal1 > sizeOfVal2) {
            System.out.println("Val1 has more numeral then val2");
        }
        else if(sizeOfVal1 < sizeOfVal2){
            System.out.println("Val2 has more numeral then val1");
        }
        else {
            System.out.println("Val1 has equal numeral then val2");
        }
    }

    private static int findSizeOfMass(int val){
        int count = 1;
        while (val >= 10){
            val /= 10;
            count++;
        }
        return count;
    }
    
    private static int waitingInteger(String message) {

		int value = 0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Enter %s int. \n", message);
		while (value <= 0) {
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("You enter not int. Try again.");
				System.out.printf("Enter %s int. \n", message);
			}

			value = scanner.nextInt();
			if (value <= 0) {
				System.out.println("You enter not positive value");
			}
		}

		return value;
	}
}