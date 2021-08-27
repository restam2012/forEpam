package by.epam.module4.simple_class.task1;

/*
 * 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 * */

public class Main {
	
	public static void main(String[] arg) {
		Test1 t = new Test1(1, 2);
		
		View v = new View();
		Logic l = new Logic();
		
		v.printTest1(t);
		
		System.out.println("Sum is " + l.sum(t));
		System.out.println("Max is " + l.max(t));
		
	}

}
