package by.epam.module2.multiarray;

/*
 * 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * */

public class Task226 {
    public static void main(String[] args) {
        int n = 8;
        
        int[][] mass = new int[n][n];
        
        if(n % 2 != 0) {
        	System.out.println("Value is not even.");
        	return;
        }
        
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i; j++) {
                mass[i][j] = 1;
            }
        }
        
        for (int i = n / 2; i < n; i++) {
            for (int j = n - i - 1; j < i + 1; j++) {
                mass[i][j] = 1;
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