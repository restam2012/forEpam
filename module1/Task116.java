/*
* 6. ��� ������ ������� ��������� �������� ���������, ������� �������� true, ���� ����� � ������������ (�, �)
����������� ����������� �������, � false � � ��������� ������: - "��� ������ ���� ������"
*/
package by.epam.lesson1;

public class Task116 {
    public static void main(String[] args) {
        int x = 3;
        int y = 1;
        
        System.out.println(check(x, y));
        System.out.println(check(0, 0));
    }

    //��� ��� ������ �� "����������" ����� ��� else-�������� ��������� � ����. ����� ��� ����.
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