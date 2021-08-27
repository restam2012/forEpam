package by.epam.module4.simple_class.task1;

public class Logic {
	
	public int sum(Test1 t) {
		return t.getVal1() + t.getVal2();
	}
	
	public int max(Test1 t) {
		return  t.getVal1() > t.getVal2() ? t.getVal1() : t.getVal2();
	}

}
