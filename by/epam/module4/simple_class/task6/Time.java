package by.epam.module4.simple_class.task6;

import java.util.Objects;

public class Time {
	public static final int MILLISECOND_IN_SECOND = 1000;
	public static final int SECOND_IN_MINUTE = 60;
	public static final int MINUTE_IN_HOUR = 60;
	public static final int HOUR_IN_DAY = 24;

	private int hour;
	private int minute;
	private int second;

	public Time() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public Time(int hour, int minute, int secont) {
		if (isHourCorrect(hour)) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}

		if (isMinuteCorrect(minute)) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}

		if (isSecondCorrect(secont)) {
			this.second = secont;
		} else {
			this.second = 0;
		}
	}

	private boolean isHourCorrect(int hour) {
		if (hour < 0 || hour >= HOUR_IN_DAY) {
			return false;
		}

		return true;
	}

	private boolean isMinuteCorrect(int minute) {

		if (minute < 0 || minute >= MINUTE_IN_HOUR) {
			return false;
		}

		return true;
	}

	private boolean isSecondCorrect(int secont) {

		if (secont < 0 || secont >= SECOND_IN_MINUTE) {
			return false;
		}

		return true;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (isHourCorrect(hour)) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (isMinuteCorrect(minute)) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (isSecondCorrect(second)) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute, second);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute && second == other.second;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}

}
