package by.epam.module4.simple_class.task2;

/*
 * 2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
 * конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
 * класса.
 * */

public class Test2 {

	private int val1;
	private int val2;

	public Test2() {
		val1 = 0;
		val2 = 0;
	}
	
	public Test2(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	
	public void setVal1(int val1) {
		this.val1 = val1;
	}
	
	public void setVal2(int val2) {
		this.val2 = val2;
	}
	
	public int getVal1() {
		return val1;
	}
	
	public int getVal2() {
		return val2;
	}
	
	
}
