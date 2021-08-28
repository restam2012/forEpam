package by.epam.module4.simple_class.task4.Date;

public class DateLogic {

	public String getTimeInString(Date d) {
		return d.getHour() + ":" + d.getMinute() + ":" + d.getSecond();
	}
}
