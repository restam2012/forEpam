package by.epam.module2.sort;

/*
 * 2. Даны две последовательности a1 <= a2 <=...<= an и b1 <= b2 <=...<= bm. Образовать из них новую последовательность
 * чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 * */

import java.util.Arrays;

public class Task232 {
	
    public static void main(String[] args) {
        int[] mass1 = {0, 1, 2, 3, 4, 5, 100};
        int[] mass2 = {20, 30, 40, 50, 60, 70, 80};
        
        if (!isMatrixCorrect(mass1, mass2)) {
			System.out.println("Matrices is not exist or correct");
			return;
		}
        
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
    
    private static boolean isMatrixCorrect(int[] mass1, int[] mass2) {

		if (mass1 == null || mass2 == null || mass1.length == 0 || mass2.length == 0) {

			return false;
		}

		if (mass1.length != mass2.length) {

			return false;
		}
		
		for (int i = 1; i < mass1.length; i += 2) {
			if (mass1[i - 1] > mass1[i]) {
				return false; 
			}
		}
		
		for (int i = 1; i < mass2.length; i += 2) {
			if (mass2[i - 1] > mass2[i]) {
				return false; 
			}
		}

		return true;
	}

}