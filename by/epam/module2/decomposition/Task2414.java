package by.epam.module2.decomposition;

/*
 * 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 *возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
 *использовать декомпозицию.*/
import java.util.Scanner;

public class Task2414 {
    public static void main(String[] args) {
        int k;
        
        k = waitingInteger();
        
        for (int i = 1; i < k; i++) {
            if(findArmstrongNum(i)) {
            	System.out.print(i + " ");
            }
        }
    }

    private static boolean findArmstrongNum(int val){
        int myVal;
        int count;
        int sum = 0;
        
        myVal = val;
        count = findCountNumeral(val);
        
        for (int i = 0; i < count; i++) {
            sum += Math.pow(val % 10, count);
            val /= 10;
        }
        
        if(sum == myVal) {
        	return true;
        }
        else {
        	return false;
        }
    }
    
    private static int findCountNumeral(int val){
        int count = 1;
        
        while (val >= 10){
            val /= 10;
            count++;
        }
        
        return count;
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