/*
* 4. ���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������). �������� �������
������� � ����� ����� ����� � ������� ���������� �������� �����.
*/

package by.epam.lesson1;

public class Task114 {
    public static void main(String[] args) {
        double x = 125.569;
        int firstPart;
        int secondPart;
        double result;
        
        firstPart = (int)x;
        secondPart = (int)(x * 1000 % 1000); /*������� ��� ���������� � int. ��� firsPart ��� ����������, ��� �� ��������� �������. ��� secondPart ��� �������������.*/
        result = secondPart + firstPart / 1000.0; /*���� �� double ��� �� � ����� ��� double*/
        System.out.println(result);
    }
}