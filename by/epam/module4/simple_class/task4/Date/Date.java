package by.epam.module4.simple_class.task4.Date;

import java.util.Objects;

public class Date implements Comparable<Date>{
	final int MILLISECOND_IN_SECOND = 1000;
	final int SECOND_IN_MINUTE = 60;
	final int MINUTE_IN_HOUR = 60;
	final int HOUR_IN_DAY = 24;
	
	
	private int hour;
	private int minute;
	private int second;

	public Date() {
		hour = 0;
		minute = 0;
		second = 0;
	}
	
	public Date(int hour, int minute, int second) throws IllegalArgumentException{

		if(!isDateCorrect(hour, minute, second)) {
			throw new IllegalArgumentException("Time is not correct");
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	
	public Date(long millisecond) throws IllegalArgumentException {
		hour = (int) millisecond / MILLISECOND_IN_SECOND / SECOND_IN_MINUTE / MINUTE_IN_HOUR;
		millisecond -= hour * MILLISECOND_IN_SECOND * SECOND_IN_MINUTE * MINUTE_IN_HOUR;
		
		minute = (int) millisecond / MILLISECOND_IN_SECOND / SECOND_IN_MINUTE;
		millisecond -= hour * MILLISECOND_IN_SECOND * SECOND_IN_MINUTE;
		
		second = (int) millisecond / MILLISECOND_IN_SECOND;
		
		if(!isDateCorrect(hour, minute, second)) {
			throw new IllegalArgumentException("Time is not correct");
		}
	}
	
	private boolean isDateCorrect(int hour, int minute, int second) {
		if(hour < HOUR_IN_DAY && minute < MINUTE_IN_HOUR && second < SECOND_IN_MINUTE) {
			return true;
		}
		
		return false;
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	@Override
	public int hashCode() {
		return Objects.hash(HOUR_IN_DAY, MILLISECOND_IN_SECOND, MINUTE_IN_HOUR, SECOND_IN_MINUTE, hour, minute, second);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return HOUR_IN_DAY == other.HOUR_IN_DAY && MILLISECOND_IN_SECOND == other.MILLISECOND_IN_SECOND
				&& MINUTE_IN_HOUR == other.MINUTE_IN_HOUR && SECOND_IN_MINUTE == other.SECOND_IN_MINUTE
				&& hour == other.hour && minute == other.minute && second == other.second;
	}

	@Override
	public String toString() {
		return "Date [MILLISECOND_IN_SECOND=" + MILLISECOND_IN_SECOND + ", SECOND_IN_MINUTE=" + SECOND_IN_MINUTE
				+ ", MINUTE_IN_HOUR=" + MINUTE_IN_HOUR + ", HOUR_IN_DAY=" + HOUR_IN_DAY + ", hour=" + hour + ", minute="
				+ minute + ", second=" + second + "]";
	}

	@Override
	public int compareTo(Date o) {
		if(hour < o.getHour()) {
			return -1;
		}
		
		if(hour > o.getHour()) {
			return 1;
		}
		
		if(minute < o.getHour()) {
			return -1;
		}
		
		if(minute > o.getHour()) {
			return 1;
		}
		
		if(second < o.getHour()) {
			return -1;
		}
		
		if(second > o.getHour()) {
			return 1;
		}
		
		return 0;
	}
	
	
	

}
