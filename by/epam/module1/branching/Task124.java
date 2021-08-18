/*
* 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.
*/
package by.epam.module1.branching;

public class Task124 {

	public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int z = 10;
        int a = 5;
        int b = 3;
        
        int[] brick = {x, y, z};
        int buffer = -1;
        
        //bubble sort
        for (int i = 0; i < brick.length - 1; i++) {
            for (int j = 1; j < brick.length - 1 - i; j++) {
                if (brick[j] > brick[j + 1]){
                    buffer = brick[j];
                    brick[j] = brick[j + 1];
                    brick[j + 1] = buffer;
                }
            }
        }
        
        //less side of brick compare with less side
        if(a > b){
            if (b >= brick[0] && a >= brick[1]) {
            	System.out.println(true);
            }
            else {
            	System.out.println(false);
            }
        }
        else {
            if (a >= brick[0] && b >= brick[1]) {
            	System.out.println(true);
            }
            else {
            	System.out.println(false);
            }
        }
    }
}