package by.epam.module4.simple_class.task5;

import java.util.Objects;

public class Counter {
	private final int MAX_COUNT = 10;
	private final int MIN_COUNTER = 0;
	
	private int count;

	public Counter() {
		super();
		count = MIN_COUNTER;
	}

	public Counter(int count) {
		super();
		this.count = checkCorrectCountValue(count);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = checkCorrectCountValue(count);
	}
	
	private int checkCorrectCountValue(int count) {
		
		if(count > MAX_COUNT) {
			return MAX_COUNT;
		}
		
		if(count < MIN_COUNTER) {
			return MIN_COUNTER;
		}
		
		return count;
	}
	
	public void increment() {
		if(count < MAX_COUNT) {
			count++;
		}
	}
	
	public void decrement() {
		if(count > MIN_COUNTER) {
			count--;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(MAX_COUNT, MIN_COUNTER, count);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;
		return MAX_COUNT == other.MAX_COUNT && MIN_COUNTER == other.MIN_COUNTER && count == other.count;
	}

	@Override
	public String toString() {
		return getClass().getName() +  " [MAX_COUNT=" + MAX_COUNT + ", MIN_COUNTER=" + MIN_COUNTER + ", count=" + count + "]";
	}
	
	

}
