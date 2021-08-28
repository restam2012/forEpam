package by.epam.module4.simple_class.task3;

import java.util.Arrays;
import java.util.Objects;

public class Student {
	private String name;
	private int group;
	private int[] progress;

	final int COUNT_OF_GRADE = 5;

	public Student() {
		name = null;
		group = 0;
		progress = new int[COUNT_OF_GRADE];
	}

	public Student(String name, int group, int[] progress) {
		super();
		this.name = name;
		this.group = group;
		this.progress = progress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int[] getProgress() {
		return progress;
	}

	public void setProgress(int[] progress) {
		this.progress = progress;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(progress);
		result = prime * result + Objects.hash(COUNT_OF_GRADE, group, name);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return COUNT_OF_GRADE == other.COUNT_OF_GRADE && group == other.group && Objects.equals(name, other.name)
				&& Arrays.equals(progress, other.progress);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", group=" + group + ", progress=" + Arrays.toString(progress)
				+ ", COUNT_OF_GRADE=" + COUNT_OF_GRADE + "]";
	}
	
	
}
