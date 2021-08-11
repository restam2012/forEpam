/*
 * 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9*/

package by.epam.lesson2.decomposition;

public class Task247 {
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 1; i <= 9; i += 2) {
            sum += factorial(i);
        }
        
        System.out.println(sum);
    }

    private static int factorial(int val){
        int result = 1;
        
        for (int i = 1; i <= val; i++) {
            result *= i;
        }
        
        return result;
    }
}