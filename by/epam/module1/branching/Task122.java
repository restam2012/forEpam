/*
* 2. Найти max{min(a, b), min(c, d)}
*/
package by.epam.module1.branching;

import java.util.Scanner;

public class Task122 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        
        a = waitingDouble("first");
        b = waitingDouble("second");
        c = waitingDouble("thirt");
        d = waitingDouble("fourth");
        
        double result = max(min(a, b), min(c, d));
        
        System.out.print(result);
    }
    
    private static double waitingDouble(String message) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Enter %s double. \n", message);
		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.println("You enter not double. Try again.");
			System.out.printf("Enter %s double. \n", message);
		}

		return scanner.nextDouble();
	}

    private static double min(double a, double b){
        return a < b ? a : b;
    }

    private static double max(double a, double b){
        return a > b ? a : b;
    }
    
    
}