package by.epam.module4.simple_class.task1;

import java.util.Objects;



public class Test1 {
	private int val1;
	private int val2;

	public Test1() {
		val1 = 0;
		val2 = 0;
	}

	public Test1(int val1, int val2) {
		super();
		this.val1 = val1;
		this.val2 = val2;
	}

	public int getVal1() {
		return val1;
	}

	public void setVal1(int val1) {
		this.val1 = val1;
	}

	public int getVal2() {
		return val2;
	}

	public void setVal2(int val2) {
		this.val2 = val2;
	}

	@Override
	public int hashCode() {
		return Objects.hash(val1, val2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test1 other = (Test1) obj;
		return val1 == other.val1 && val2 == other.val2;
	}

	@Override
	public String toString() {
		return "Test1 [val1=" + val1 + ", val2=" + val2 + "]";
	}

}
