/*
* 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
*/
package by.epam.lesson1.topic2;

public class Task123 {
	public static void main(String[] args) {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;
        int x3 = 3;
        int y3 = 3;

        if((double)(x3 - x1) / (x2 - x1) == (double)(y3 - y1) / (y2 - y1)){
            System.out.print(true);
        }
        else {
        	System.out.print(false);
        }
    }
}