/*
* 3. ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������.
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