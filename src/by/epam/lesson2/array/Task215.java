package by.epam.lesson2.array;

/*
 * 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i */

public class Task215 {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 3, 5, 6, 0, -10};
     
        for (int i = 0; i < mass.length; i++) {
        	
            if(mass[i] > i){
                System.out.println(mass[i]);
            }
            
        }
    }
}