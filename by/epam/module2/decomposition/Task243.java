/*
 * 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника
 */

package by.epam.module2.decomposition;

public class Task243 {
	public static void main(String[] args) {
		int a = 5;
		double area;
		
		area = 6 * findAriaOfTriangle(a);
		
		System.out.println(area);
	}

	private static double findAriaOfTriangle(int a) {		
		return Math.sqrt(3) * a * a / 4 ;
	}

}
