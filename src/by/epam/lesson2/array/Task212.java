package by.epam.lesson2.array;

/*
 * 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
 * числом. Подсчитать количество замен.
 * */

import java.util.Arrays;

public class Task212 {
    public static void main(String[] args) {
        double[] mass = {1, 2, 3, 4, 5, 6};
        int z = 3;
        int count = 0;
        
        for (int i = 0; i < mass.length; i++) {
        	
            if(mass[i] > z){
                mass[i] = z;
                count++;
            }
            
        }
        
        System.out.println(Arrays.toString(mass));
        System.out.println(count);
    }
}