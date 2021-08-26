package by.epam.module2.multiarray;

/*
 * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы
 * */
  
public class Task223 {
    public static void main(String[] args) {
        int[][] mass = {{1, 2, 3, 4, 5}, {49, 0, -10, 42, 0}, {454, 11, -52, 0, 5}, {-52, 66, 13, -1, 5}, {1, -1, 2, -2, 6}};
        int k = 0;
        int p = 3;
        
        for (int i = 0; i < mass[k].length; i++) {
            System.out.print(mass[k][i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i][p] + " ");
        }
    }
}