/*
* 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.
*/
package by.epam.module1.linear;

import java.util.Scanner;

public class Task111 {
    public static void main(String[] args) {
    	int x;
    	int y;
    
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the two angle.");
        
        x = scanner.nextInt();
        y = scanner.nextInt();
        
        boolean isTriangle = false;
        if (x + y < 180) {
            isTriangle = true;
            
            System.out.print("The triangle is exist. ");
        }
        else {
            System.out.println("The triangle is don't exist.");
        }
        
        
        if (isTriangle && (x == 90 || y == 90 || x + y == 90)){
            System.out.println("And it is a rectangular.");
        }
        else {
        	System.out.println("And it isn't a rectangular.");
        }

    }
}