package by.epam.module4.simple_class.task7;

public class TriangleLogic {

	public double area(Triangle t) {
		return Math.sqrt(perimeter(t) * (perimeter(t) - lengthAB(t)) * (perimeter(t) - lengthBC(t))
				* (perimeter(t) - lengthCA(t)));
	}

	public double perimeter(Triangle t) {
		return lengthAB(t) + lengthBC(t) + lengthCA(t);
	}

	public double lengthAB(Triangle t) {
		return lengthAB(t.getA(), t.getB());
	}
	
	public double lengthAB(Point a, Point b) {
		return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
	}
	
	public double lengthBC(Triangle t) {
		return lengthAB(t.getB(), t.getC());
	}
	
	public double lengthBC(Point b, Point c) {
		return Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));
	}

	public double lengthCA(Triangle t) {
		return lengthAB(t.getA(), t.getC());
	}
	
	public double lengthCA(Point a, Point c) {
		return Math.sqrt(Math.pow(c.getX() - a.getX(), 2) + Math.pow(c.getY() - a.getY(), 2));
	}

	public Point median(Triangle t) {
		return new Point((t.getA().getX() + t.getB().getX() + t.getC().getX()) / 2,
				(t.getA().getY() + t.getB().getY() + t.getC().getY()) / 2);
	}
}
