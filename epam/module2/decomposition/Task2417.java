package by.epam.module2.decomposition;

/*
 * 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 *действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 **/

import java.util.Scanner;

public class Task2417 {
    public static void main(String[] args) {
    	int n;
    	int count = 0;

		n = waitingInteger();
		
        while (n > 0){
            n -= sumOfMumber(n);
            count++;
        }
        
        System.out.println(count);

    }

    private static int sumOfMumber(int val){
        int sum = 0;
        
        while (val > 0){
            sum += val % 10;
            val /= 10;
        }
        
        return sum;
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