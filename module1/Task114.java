/*
* 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.
*/

package by.epam.lesson1;

public class Task114 {
    public static void main(String[] args) {
        double x = 125.569;
        int firstPart;
        int secondPart;
        double result;
        
        firstPart = (int)x;
        secondPart = (int)(x * 1000 % 1000); /*Привожу две переменных к int. Для firsPart это необходимо, что бы отбросить остаток. Для secondPart для аналогичности.*/
        result = secondPart + firstPart / 1000.0; /*делю на double что бы в итоге был double*/
        System.out.println(result);
    }
}