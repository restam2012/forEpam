/*
* 5. Вычислить значение функции:
*/

package by.epam.lesson1.topic2;

public class Task125 {

    public static void main(String[] args) {
        int x = 4;
        double result;
        
        if (x <= 3){
            result = x * x - 3 * x + 9;
        }
        else {
            result = 1 / (Math.pow(x, 3.0) + 6); //Math.pow() возвращает double
        }
        System.out.println(result);
    }
}