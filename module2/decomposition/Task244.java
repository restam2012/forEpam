/*
 * 4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.*/

package by.epam.lesson2.decomposition;

public class Task244 {
	public static void main(String[] args) {
		int[][] massOfPoint = { { 1, 0 }, { 10, 1 }, { 5, 10 }, { 0, 18 }, { 11, 6 } };
		double distant = -1;
		double maxDistant = -1;
		int[][] mass = new int[2][2];

		int x1;
		int y1;
		int x2; 
		int y2;

		for (int i = 0; i < massOfPoint.length; i++) {
			x1 = massOfPoint[i][0];
			y1 = massOfPoint[i][1];

			for (int j = i + 1; j < massOfPoint.length; j++) {
				x2 = massOfPoint[j][0];
				y2 = massOfPoint[j][1];

				distant = findDistant(x1, y1, x2, y2);

				if (maxDistant < distant) {
					maxDistant = distant;

					mass[0][0] = x1;
					mass[0][1] = y1;
					mass[1][0] = x2;
					mass[1][1] = y2;
				}
			}
		}

		System.out.printf("The longest distant is %f from point %d %d to point %d %d", maxDistant, mass[0][0],
				mass[0][1], mass[1][0], mass[1][1]);
	}

	private static double findDistant(int x1, int y1, int x2, int y2) {
		int x;
		int y;
		double distant;
		
		x = Math.abs(x1 - x2);
		y = Math.abs(y1 - y2);
		distant = Math.sqrt(x * x + y * y);
		
		return distant;
	}
}