/*
* 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
*/
package by.epam.lesson1.cycle;

public class Task136 {
    public static void main(String[] args) {
    	
        char ch = 'a';
        
        for(int i = 0; i <= 25; i++){
            System.out.println((char) (ch + i) + " match " + (ch + i));
        }
    }
}