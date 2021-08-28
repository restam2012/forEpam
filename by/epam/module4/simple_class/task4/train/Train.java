package by.epam.module4.simple_class.task4.train;

import java.util.Objects;

import by.epam.module4.simple_class.task4.Date.*;

public class Train {
	private String destination;
	private int trainNum;
	private Date date;

	public Train() {
		super();
		destination = "";
		trainNum = 0;
		date = new Date();
	}

	public Train(String destination, int trainNum, Date date) {
		super();
		this.destination = destination;
		this.trainNum = trainNum;
		this.date = date;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(int trainNum) {
		this.trainNum = trainNum;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, destination, trainNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(date, other.date) && Objects.equals(destination, other.destination)
				&& trainNum == other.trainNum;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [destination=" + destination + ", trainNum=" + trainNum + ", date=" + date + "]";
	}
	
	

}
