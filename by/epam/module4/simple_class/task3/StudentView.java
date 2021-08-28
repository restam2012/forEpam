package by.epam.module4.simple_class.task3;

import java.util.List;

public class StudentView {
	
	public void printNameAndGroup(List<Student> students) {
		for(Student s:students) {
			System.out.println(s.getName() + "\t" + s.getGroup());
		}
	}
	

}
