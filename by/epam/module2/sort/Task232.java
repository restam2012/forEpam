package by.epam.module2.sort;

/*
 * 2. Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Образовать из них новую
 *  последовательностьчисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 * */

import java.util.Arrays;

public class Task232 {
	
    public static void main(String[] args) {
        int[] mass1 = {0, 1, 2, 3, 4, 5, 100};
        int[] mass2 = {20, 30, 40, 50, 60, 70, 80};
        int [] resultMass = new int[mass1.length + mass2.length];
        
        int countMass1 = 0;
        int countMass2 = 0;
        
        for (int i = 0; i < resultMass.length; i++) {
            if(countMass1 < mass1.length && countMass2 < mass2.length){
                resultMass[i] = mass1[countMass1] < mass2[countMass2] ? mass1[countMass1++] : mass2[countMass2++];
            }
            else if(countMass1 == mass1.length){
                resultMass[i] = mass2[countMass2];
                countMass2++;
            }
            else {
                resultMass[i] = mass1[countMass1];
                countMass1++;
            }
        }
        
        System.out.println(Arrays.toString(resultMass));
    }
}