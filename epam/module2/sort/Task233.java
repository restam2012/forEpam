package by.epam.module2.sort;

/*
 * 3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <=...<= an .Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором.
 * */

import java.util.Arrays;

public class Task233 {
    public static void main(String[] args) {
        int[] mass = {0, 1, 2, 3, 4, 5, 100};
        
        if(!isMatrixCorrect(mass)) {
        	System.out.println("Matrix is not exist or not correct");
        	return;
        }
        
        mass = sortSelection(mass);
        
        System.out.println(Arrays.toString(mass));
    }
    
    //Проверка, что матрица существует и действительно убывающая
    private static boolean isMatrixCorrect(int[] mass) {
		if (mass == null || mass.length == 0) { 
			
			return false;
		}

		for (int i = 1; i < mass.length; i += 2) {
			if (mass[i - 1] > mass[i]) {
				return false; 
			}
		}

		return true; 
	}
    
    private static int[] sortSelection(int[] mass) {
    	int min;
        int minIndex;
        int buffer;
        
        for (int i = 0; i < mass.length - 1; i++) {
            min = mass[i];
            minIndex = i;
            
            for (int j = i + 1; j < mass.length; j++) {
                if(mass[j] > min) {
                    min = mass[j];
                    minIndex = j;
                }
            }
            
            buffer = mass[i];
            mass[i] = mass[minIndex];
            mass[minIndex] = buffer;
        }
        
        return mass;
    }
}
