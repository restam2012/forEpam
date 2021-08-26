package by.epam.module2.multiarray;

/*
 * 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * */

public class Task225 {
    public static void main(String[] args) {
        int n = 6;
        int[][] mass = new int[n][n];
        
        if(n % 2 != 0) {
        	System.out.println("Value is not even.");
        	return;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                mass[i][j] = i + 1;
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}