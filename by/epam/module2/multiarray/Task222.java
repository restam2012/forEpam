package by.epam.module2.multiarray;
/*
 * 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
 * */

public class Task222 {
    public static void main(String[] args) {
        int[][] mass = {{1, 2, 3, 4, 5}, {49, 0, -10, 42, 0}, {454, 11, -52, 0, 5}, {-52, 66, 13, -1, 5}, {1, -1, 2, -2, 6}};
        
        for (int i = 0, j = 0; i < mass.length && j < mass[i].length; i++, j++) {
            System.out.print(mass[i][j] + " ");
        }
    }
}