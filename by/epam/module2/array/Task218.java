package by.epam.module2.array;

import java.util.Arrays;

/*
 * 8. Дана последовательность целых чисел a1,a2,...,an . Образовать новую последовательность, выбросив из
 * исходной те члены, которые равны min(a1,a2,...,an) .
 * */

public class Task218 {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6, 0, -10, 42, 454, 11, -52, 0, 5, -52};
        int[] newMass = new int[0];
        int minValue;
        
        minValue = findMin(mass);
        
        for (int val :mass) {
            if(val != minValue) {
            	newMass = addElementToMass(newMass, val);
            }
        }
        System.out.println(Arrays.toString(newMass));
    }
    
    private static int findMin(int[] mass) {
    	int min = Integer.MAX_VALUE;
    	
        for (int i = 0; i < mass.length; i++){
            min = mass[i] < min ? mass[i] : min;
        }
        
        return min;
    }
    
    private static int[] addElementToMass(int[] mass, int val) {
    	int[] newMass = new int[mass.length + 1];
    	
    	for(int i = 0; i < mass.length; i++) {
    		newMass[i] = mass[i];
    	}
    	
    	newMass[newMass.length - 1] = val;
    	
    	return newMass;
    }
}