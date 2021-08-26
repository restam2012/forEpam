package by.epam.module2.array;
/*
 * 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 * */
public class Task213 {
    public static void main(String[] args) {
        double[] mass = {1, 2, 3, 4, 5, 6, 0, -10};
        int positive = 0;
        int zero = 0;
        int negative = 0;
        
        for (double i:mass) {
            if(i > 0) positive++;
            else if(i == 0) zero++;
            else negative++;
        }
        
        System.out.println(positive + " " + zero + " " + negative);
    }
}