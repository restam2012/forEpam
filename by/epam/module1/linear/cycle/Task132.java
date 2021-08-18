/*
* 2. Вычислить значения функции на отрезке [а,b] c шагом h:
*/
package by.epam.module1.linear.cycle;

public class Task132 {
    public static void main(String[] args) {
        int a = -10;
        int b = 10;
        int h = 2;
        
        for(int i = a; i <= b; i += h){
            if(i > 2){
                System.out.println("In point " + i + " y = " + i);
            }
            else {
                System.out.println("In point " + i + " y = " + -i);
            }
        }
    }
}