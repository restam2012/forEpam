/*
 * 6. �������� �����(������), �����������, �������� �� ������ ��� ����� ������� ��������.*/

package by.epam.lesson2.decomposition;

public class Task246 {
    public static void main(String[] args) {
        int[] mass = {10, 2, 3};
        boolean ifSimple = true; //����� �� ��������� �������.
        
        for (int i = 0; i < mass.length - 1; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                ifSimple = findNOD(mass[i], mass[j]) == 1 ? ifSimple : false; //���� �� �������, �� false � ��� �������� �������
            }
        }
        
        System.out.println(ifSimple);
    }

    private static int findNOD(int val1, int val2) {
		while (val1 != 0 && val2 != 0) {
			if (val1 > val2) {
				val1 %= val2;
			} else {
				val2 %= val1;
			}
		}
		return val1 + val2;
	}
}