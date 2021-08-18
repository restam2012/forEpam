package by.epam.lesson2.array;

/*
 * 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 * */

import java.util.Arrays;

public class Task2110 {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6, 0, -10, 42, 454, 11, -52, 0, 5, -52, 66};
        int j = 0;
        
        // В моей программе нули в конце. Возможно имелось в ввиду, что через 1 будут 0, но я не полностью понял задание.
        for (int i = 0; i < mass.length; i += 2) {
            mass[j] = mass[i];
            j++;
        }
        
        for (int i = j; i < mass.length; i++) {
            mass[i] = 0;
        }
        
        System.out.println(Arrays.toString(mass));
    }
}