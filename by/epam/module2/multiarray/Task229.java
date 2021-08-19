package by.epam.module2.multiarray;

/*
 * 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму.
 * */
public class Task229 {
    public static void main(String[] args) {
        int[][] mass = {{1, 2, 3, 4, 5}, {49, 0, 10, 42, 0}, {454, 11, 52, 0, 5}, {52, 66, 13, 1, 5}, {1, 1, 2, 2, 6, 666}};
        final int DEFAULT_VALUE = -1;
        int longestLine;
        
        longestLine = DEFAULT_VALUE;
        
        //if matrix is not square need to find the longest column
        for (int i = 0; i < mass.length; i++){
            longestLine = longestLine > mass[i].length ? longestLine : mass[i].length;
        }
        
        int[] sum = new int[longestLine];
        
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                sum[j] += mass[i][j];
            }
        }
        
        int maxSum = DEFAULT_VALUE;
        int column = DEFAULT_VALUE;
        
        for (int i = 0; i < sum.length; i++) {
            if(maxSum < sum[i]){
                maxSum = sum[i];
                column = i;
            }
        }
        
        System.out.println("The greatest column is " + (column + 1) + " with sum " + maxSum);
    }
}