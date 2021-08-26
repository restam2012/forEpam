package by.epam.module2.multiarray;

/*
 * 10. Найти положительные элементы главной диагонали квадратной матрицы.
 * */

public class Task2210 {
  public static void main(String[] args) {
      int[][] mass = {{1, 2, 3, 4, 5}, {49, 0, -10, 42, 0}, {454, 11, -52, 0, 5}, {-52, 66, 13, -1, 5}, {1, -1, 2, -2, 6}};
      
      if(!isSquare(mass)) {
    	  System.out.println("Mass is not square");
    	  return;
      }
      
      for (int i = 0, j = 0; i < mass.length && j < mass[i].length; i++, j++) {
    	  
          if(mass[i][j] > 0) {
        	  System.out.print(mass[i][j] + " ");
          }
          
      }
  }
  
  public static boolean isSquare(int[][] mass) {
	  for(int i = 0; i < mass.length; i++) {
		 
		  if(mass[i].length != mass.length) {
			  return false;
		  }
		  
	  }
	  
	  return true;
  }
}