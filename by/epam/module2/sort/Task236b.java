package by.epam.module2.sort;

/*
 * 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . Если ai <= ai+1 , то продвигаются
 * на один элемент вперед. Если ai > ai+1 , то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 * */

import java.util.Arrays;

//Данный вариант программы основан на более оптимальном способе с шагами.
public class Task236b {
	final static int MINIMUM_HOPE_SHELL_SORT = 1;
	
    public static void main(String[] args) {
    	
    	
        int[] mass = {0, 1, 10, 2, 3, 33, 4, 5, 100, -1};
        int h; 
        
        if(!isMatrixCorrect(mass)) {
        	System.out.println("Matrix is not exist or not correct");
        	return;
        }
        
        h = findMaxHope(mass);
    
        while (h >= 1){
            sortShell(h, mass);
            h /= 3;
        }
        
        System.out.println(Arrays.toString(mass));
    }
    
    private static boolean isMatrixCorrect(int[] mass) {
		if (mass == null || mass.length == 0) {

			return false;
		}
		return true;
	}
    private static int findMaxHope(int[] mass) {
    	int h;
    	
    	h = MINIMUM_HOPE_SHELL_SORT;
    	
    	while (h < mass.length){
            h = h * 3 + 1;
        }
    	
    	return h;
    }

    private static void sortShell(int h, int[] mass){
    	int buffer;
    	
        for (int i = h; i < mass.length; i++) {
            for (int j = i; j >= h; j -= h) {
            	
                if(mass[j] < mass[j - h]){
                    buffer = mass[j];
                    mass[j] = mass[j - h];
                    mass[j - h] = buffer;
                }
                
            }
        }
        
    }
}
