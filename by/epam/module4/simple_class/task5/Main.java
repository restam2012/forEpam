package by.epam.module4.simple_class.task5;

/*
 * Текст задания в readme в пакете
 * */

public class Main {
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		CountView view = new CountView();
		
		view.printCount(counter);
		
		counter.setCount(20);
		view.printCount(counter);
		
		counter.decrement();
		view.printCount(counter);
		
		counter.increment();
		view.printCount(counter);
		
		counter.increment();
		view.printCount(counter);
	}
}
