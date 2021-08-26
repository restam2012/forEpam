package by.epam.module2.array;

/*
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 * */

public class Task211 {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6};
        int k = 2;
        int sum = 0;
        
        for (int i : mass){
        	
            if(i % k == 0){
                sum += i;
            }
            
        }
        
        System.out.println(sum);
    }
}