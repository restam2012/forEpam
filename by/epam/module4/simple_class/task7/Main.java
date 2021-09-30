package by.epam.module4.simple_class.task7;

public class Main {
	public static void main(String[] args) {
		Triangle t = new Triangle(new Point(0, 0), new Point(1, 1), new Point(2, 3));
		TriangleLogic logic = new TriangleLogic();
		
		System.out.println(logic.area(t));
		System.out.println(logic.perimeter(t));
		System.out.println(logic.median(t));
	}

}
