/*
* 1. ������� �������� �������: z = ( (a � 3 ) * b / 2) + c
*/
package by.epam.lesson1;

public class Task111 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        
        double z;
        
        z = ((a - 3) * b / 2.0) + c; /*����� �� double ��� �� ��������� ������� ���� ���� double*/
        
        System.out.println(z);
    }
}