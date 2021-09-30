package by.epam.module4.simple_class.task7;

import java.util.Objects;

public class Triangle {
	private Point a;
	private Point b;
	private Point c;

	public Triangle() {
		a = null;
		b = null;
		c = null;
	}

	public Triangle(Point a, Point b, Point c) {
		super();
		if(isCorrect(a, b, c)) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		else {
			this.a = null;
			this.b = null;
			this.c = null;
		}
	}
	
	public boolean isCorrect(Point a, Point b, Point c) {
		TriangleLogic logic = new TriangleLogic();
		double ab = logic.lengthAB(a, b);
		double bc = logic.lengthBC(b, c);
		double ca = logic.lengthCA(a, c);
		if(ab + bc > ca && ab + ca > bc && bc + ca > ab) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		if(isCorrect(a, b, c)) {
			this.a = a;
		}
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		if(isCorrect(a, b, c)) {
			this.b = b;
		}
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		if(isCorrect(a, b, c)) {
			this.c = c;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b, c);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		return Objects.equals(a, other.a) && Objects.equals(b, other.b) && Objects.equals(c, other.c);
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
}
