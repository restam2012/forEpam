/*
* 3. ����� ����� ��������� ������ ��� �����.
*/
package by.epam.lesson1.cycle;

public class Task133 {
    public static void main(String[] args) {
        int val = 100;
        int result = 0;
        
        for(int i = 1; i <= val; i++){
            result += i * i;
            
            if(result < 0) { //�����, ���� �������� ������ ����.
            	System.out.printf("You have got used to the int size in %d cycle.", i);
            	return;
            }
            
        }
        
        System.out.println(result);
    }
}