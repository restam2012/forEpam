package by.epam.module4.simple_class.task6;

public class Main {

	public static void main(String[] args) {
		Time time = new Time(20, 10, 00);
		TimeLogic logic = new TimeLogic();
		
		System.out.println(logic.showTime(time));
		
		time = logic.addTime(time, 10, 0, 0);
		System.out.println(logic.showTime(time));
		
		time = logic.subTime(time, 0, 0, 5);
		System.out.println(logic.showTime(time));
		
		time = new Time(33, 10, 00);
		System.out.println(logic.showTime(time));
	}

}
