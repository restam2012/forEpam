package by.epam.module2.decomposition;

/*
 * 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию*/

import java.util.Scanner;

public class Task2416 {
    public static void main(String[] args) {
    	int n;
    	int sum = 0;

		n = waitingInteger();

        for (int i = numFromCount(n); i < numFromCount(n + 1); i++) {
            if (ifNumOnlyOdd(i)) {
                sum += i;
            }
        }
        
        int even = calcCountOfEvenNum(sum);
        
        System.out.printf("Sum of odd num = %d, count of even numeral in sum is %d", sum, even);
    }

    private static boolean ifNumOnlyOdd(int val) {
    	int num;
    	
    	while (val > 0) {
            num = val % 10;
            val /= 10;
            
            if (num % 2 == 0) {
                return false;
            }
            
        }
    	return true;
    }

    private static int calcCountOfEvenNum(int val) {
        int count = 0;
        int num;
        
        while (val > 0) {
            num = val % 10;
            val /= 10;
            
            if (num % 2 == 0) {
                count++;
            }
            
        }
        return count;
    }
    
    //Метод для определения минимального числа данного разряда
    private static int numFromCount(int count){
        int num = 1;
        for (int i = 0; i < count - 1; i++) {
            num *= 10;
        }
        return num;
    }
    
    private static int waitingInteger() {

		int value = 0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Enter integer. \n");
		while (value <= 0) {
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("You enter not int. Try again.");
				System.out.printf("Enter integer. \n");
			}

			value = scanner.nextInt();
			if (value <= 0) {
				System.out.println("You enter not positive value");
			}
		}

		return value;
	}
}