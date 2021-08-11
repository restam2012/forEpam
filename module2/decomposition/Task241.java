/*
 * 1. �������� �����(������) ��� ���������� ����������� ������ �������� � ����������� ������ �������� ����
*����������� �����:
*���(�, �) = A*B / ��� (�, �)
*/

package by.epam.lesson2.decomposition;

public class Task241 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int val1 = 10;
		int val2 = 25;
		double nok;
		
		nok = findNOK(val1, val2);
		System.out.println(nok);
	}

	//��� ���������� ��� ���������� �������� �������
	private static int findNOD(int val1, int val2) {
		while(val1 != 0 && val2 != 0) {
			if(val1 > val2) {
				val1 %= val2;
			}
			else {
				val2 %= val1;
			}
		}
		return val1 + val2;
	}

	private static double findNOK(int val1, int val2) {		
		return (double)Math.abs(val1 * val2)/findNOD(val1, val2);
	}

}
