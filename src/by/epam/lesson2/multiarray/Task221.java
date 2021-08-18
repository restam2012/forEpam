package by.epam.lesson2.multiarray;

/*
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 * */

public class Task221 {
	
    public static void main(String[] args) {
        int[][] mass = {{1, 2, 3, 4, 5}, {49, 0, -10, 42}, {454, 11, -52, 0, 5}, {-52, 66}};
        
        for (int i = 1; i < mass.length; i += 2) {
        	
            if(mass[i][0] > mass[i][mass[i].length - 1]){
                for(int j = 0; j < mass[i].length; j++){
                	
                    System.out.print(mass[i][j] + " ");
                    
                }
                
                System.out.println();
            }
        }
    }
}