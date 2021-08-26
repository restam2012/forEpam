package by.epam.module2.array;

/*
 * 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами
 * */

public class Task216 {
	
    public static void main(String[] args) {
        double[] mass = {1, 2, 3, 4, 5, 6, 0, -10, 42, 454, 11, -52};
        double sum = 0;
        
        for (int i = 0; i < mass.length; i++) {
            if(isPrimeNumber(i)){
                sum += mass[i];
            }
        }
        
        System.out.println(sum);
    }

    private static boolean isPrimeNumber(int val) {
    	if (Math.abs(val) <= 1) {
    		return false;
    	}
    	
        int i = 2;
        
        while (i <= Math.sqrt(val)){
            if (val % i == 0){
                return false;
            }
            
            i++;
        }
        return true;
    }
}