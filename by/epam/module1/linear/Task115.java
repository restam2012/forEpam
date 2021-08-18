/*
* 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
*/

package by.epam.module1.linear;

public class Task115 {
    public static void main(String[] args) {
        int t = 303;
        String result;

        int h;
        int m;
        int s;
        
        final int SECONDS_IN_HOUR = 3600;
        final int SECONDS_IN_MINUTE = 60;
        
        h = t / SECONDS_IN_HOUR;
        m = (t - h * 3600) / SECONDS_IN_MINUTE;
        s = (t - h * 3600) % SECONDS_IN_MINUTE;
        
        result = "";
        result += forAddZero(h,"ч ");
        result += forAddZero(m, "мин ");
        result += forAddZero(s, "с ");
        
        System.out.println(result);
    }

    public static String forAddZero(int t, String add){
    	final int MIN_DOUBLE_RANG = 10;
    	
        if (t >= MIN_DOUBLE_RANG){
            return t + add;
        }
        else {
            return "0" + t + add;
        }
    }
}