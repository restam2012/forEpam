/*
* 6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае: - "тут должен быть график"
*/
package by.epam.lesson1;

public class Task116 {
    public static void main(String[] args) {
        int x = 3;
        int y = 1;
        
        System.out.println(check(x, y));
        System.out.println(check(0, 0));
    }

    //Так как график со "ступенькой" нужно две else-проверки попадания в зону. Иначе вне зоны.
    public static boolean check(int x, int y){
        if (y < 4 && y >= 0 && x < 2 && x > -2) {
            return true;
        }
        else if(y < 0 && y > -3 && x < 4 && x > -4){
            return true;
        }
        else {
        	return false;
        }
    }
}