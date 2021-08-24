package by.epam.module2.sort;

/*
 * 1. ������ ��� ���������� ������� � ��������� ����������� ��������� � ����������� ����� k. ���������� �� �
 * ���� ������, ������� ������ ������ ����� k-� � (k+1) - � ���������� �������, ��� ���� �� ���������
 * �������������� ������.
 * */

import java.util.Arrays;

public class Task231 {
    public static void main(String[] args) {
        int[] mass1 = {0, 1, 2, 3, 4, 5};
        int[] mass2 = {20, 30, 40, 50, 60, 70, 80};
        int k = 3; //default value
        
        int [] resultMass = new int[mass1.length + mass2.length];
        
        int count = 0;
        for (int i = 0; i < mass1.length; i++) {
            resultMass[count] = mass1[i];
            count++;
            
            if(count == k){
                for (int j = 0; j < mass2.length; j++) {
                    resultMass[count] = mass2[j];
                    count++;
                }
            }
            
        }
        
        System.out.println(Arrays.toString(resultMass));
    }
}