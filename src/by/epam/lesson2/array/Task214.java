package by.epam.lesson2.array;

/*
 * 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 * */
  
import java.util.Arrays;

public class Task214 {
    public static void main(String[] args) {
        double[] mass = {1, 2, 3, 4, 5, 6, 0, -10};
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        
        for (int i = 0; i < mass.length; i++) {
            if(min > mass[i]){
                min = mass[i];
                minIndex = i;
            }
            if(max < mass[i]){
                max = mass[i];
                maxIndex = i;
            }
        }
        
        double buffer;
        
        buffer = mass[minIndex];
        mass[minIndex] = mass[maxIndex];
        mass[maxIndex] = buffer;
        
        System.out.println(Arrays.toString(mass));
    }
}