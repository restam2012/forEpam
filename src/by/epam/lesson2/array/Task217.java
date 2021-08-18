package by.epam.lesson2.array;

/*
 * 7. Даны действительные числа a1,a2,...,an . Найти
 * max( a1 + a2n,a2 + a2n−1,...,an + an+1) .
 * */

public class Task217 {
	
    public static void main(String[] args) {
        double[] mass = {1, 2, 3, 4, 5, 6, 0, -10, 42, 454, 11, -52, 0, 5};
        double max = Double.MIN_VALUE;
        
        if(mass.length % 2 != 0){
            System.out.println("Not even number element in mass");
            return;
        }
        
        int n;
        
        n = mass.length / 2;
        for (int i = 0; i < n; i++){
            max = mass[i] + mass[2 * n - 1 - i] > max ? mass[i] + mass[2 * n - 1 - i] : max;
        }
        
        System.out.println(max);
    }
}