/*
 * 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой*/

package by.epam.module2.decomposition;

public class Task249 {
    public static void main(String[] args) {
        double x = 2.6;
        double y = 3;
        double z = 3.6;
        double t = 1.6;
        
        System.out.println(areaOfQuadrangle(x, y, z, t));
    }

    private static double areaOfQuadrangle(double a, double b, double c, double d){
        double p;
        double area;
        
        p = perimeterOfQuadrangle(a, b, c, d);
        area = Math.sqrt((p - a) * (p - b) * (p - c) * (p - d));
        
        return area;
    }
    
    private static double perimeterOfQuadrangle(double a, double b, double c, double d){
    	return (a + b + c + d) / 2;
    }
}