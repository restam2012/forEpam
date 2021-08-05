/*
* 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
*/

package by.epam.lesson1;

public class Task115 {
    public static void main(String[] args) {
        int t = 303;
        String result;

        int h;
        int m;
        int s;
        
        h = t / 3600;
        m = (t - h * 3600) / 60;
        s = (t - h * 3600) % 60;
        
        result = "";
        result += forAddZero(h,"ч ");
        result += forAddZero(m, "мин ");
        result += forAddZero(s, "с ");
        
        System.out.println(result);
    }

    public static String forAddZero(int t, String add){
        if (t >= 10){
            return t + add;
        }
        else {
            return "0" + t + add;
        }
    }
}