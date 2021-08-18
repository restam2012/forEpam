package by.epam.module2.multiarray;

/*
 * 7. Сформировать квадратную матрицу порядка N по правилу :
 * и подсчитать количество положительных элементов в ней.
 * */

public class Task227 {
    public static void main(String[] args) {
        int n = 8;
        double[][] mass = new double[n][n];
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                mass[i][j] = Math.sin((i * i - j * j) / n);
                if(mass[i][j] > 0) count++;
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(count);
        
    }
}
