package by.epam.module4.simple_class.task6;

public class TimeLogic {

	public Time addTime(Time time, int hour, int minute, int second) {
		if (second + time.getSecond() >= Time.SECOND_IN_MINUTE) {
			return addTime(time, hour, minute + 1, second - Time.SECOND_IN_MINUTE);
		} else {
			time.setSecond(time.getSecond() + second);
			second = 0;
		}

		if (minute + time.getMinute() >= Time.MINUTE_IN_HOUR) {
			return addTime(time, hour + 1, minute - Time.MINUTE_IN_HOUR, second);
		} else {
			time.setMinute(time.getMinute() + minute);
			minute = 0;
		}

		if (hour + time.getHour() >= Time.HOUR_IN_DAY) {
			return addTime(time, hour - Time.HOUR_IN_DAY, minute, second);
		} else {
			time.setHour(time.getHour() + hour);
		}

		return time;
	}

	public Time subTime(Time time, int hour, int minute, int second) {
		if(time.getSecond() - second < 0) {
			return subTime(time, hour, minute + 1, second - Time.SECOND_IN_MINUTE);
		}
		else {
			time.setSecond(time.getSecond() - second);
			second = 0;
		}
		
		if(time.getMinute() - minute < 0) {
			return subTime(time, hour + 1, minute - Time.MINUTE_IN_HOUR, second);
		}
		else {
			time.setMinute(time.getMinute() - minute);
			minute = 0;
		}
		
		if(time.getHour() - hour < 0) {
			return subTime(time, hour - Time.HOUR_IN_DAY, minute, second);
		}
		else {
			time.setHour(time.getHour() - hour);
		}
	
		return time;
	}
	
	public String showTime(Time time) {
		return String.format("%02d:%02d:%02d", time.getHour(), time.getMinute(), time.getSecond());
	}

}
