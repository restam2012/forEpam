/*
* 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
*/
package by.epam.lesson1.main;

public class Task111 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        
        double z;
        
        z = ((a - 3) * b / 2.0) + c; /*Делил на double что бы результат деления тоже стал double*/
        
        System.out.println(z);
    }
}
