/*
* 5. ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ ������� ������ ��� �����
��������� �. ����� ���� ���� ����� ���:
an = 1/2(n) + 1/3(n)
*/
package by.epam.module1.cycle;

public class Task135 {
    public static void main(String[] args) {
    	//������������� ����������
        double e = 0.001;
        int i = 0;
        
        double sum;
        double a = 2; //������ ��������� �������� ������ 0 ������� ������������ ��������� ����.
        
        sum = -a; //������ ��������� �������� ����� �����, ���� �����, ��� �� ����� ���������� � 1, � �� � 0.
        
        while (a >= e){ 
            sum += a; 
            i++;
            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
        }
        
        System.out.println(sum);
    }
}