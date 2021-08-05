  
/*
* 3.  Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦) ∗ 𝑡𝑔 𝑥𝑦
*/
package by.epam.lesson1;

public class Task113 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        double z;
        
        z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        
        System.out.println(z);
    }
}