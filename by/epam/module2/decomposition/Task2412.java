package by.epam.module2.decomposition;

/*
 * 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N.
 * */

import java.util.Arrays;
import java.util.Scanner;

public class Task2412 {
    public static void main(String[] args) {
        int k;
        int n;
        int count;
        
        k = waitingInteger("first");
        n = waitingInteger("second");
        
        count = findSizeOfMath(k, n);
        
        int[] mass = new int[count];
       
        mass = findCorrectNumber(k, n, mass);
        
        System.out.println(Arrays.toString(mass));
    }

    private static int[] findCorrectNumber(int k, int n, int[] mass){
    	
    	int index = 0;
        for (int i = 0; i < n; i++){
            if(sum(i) == k){
                mass[index++] = i;
            }
        }
        
        return mass;
    }
    
    private static int findSizeOfMath(int k, int n) {
    	int count = 0;
    	
    	for (int i = 0; i < n; i++){
            if(sum(i) == k){
                count++;
            }
        }
    	return count;
    }

    private static int sum(int val){
        int sum = 0;
        while (val > 0){
            sum += val % 10;
            val /= 10;
        }
        return sum;
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