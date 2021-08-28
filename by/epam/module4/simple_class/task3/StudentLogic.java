package by.epam.module4.simple_class.task3;

import java.util.ArrayList;
import java.util.List;

public class StudentLogic {

	public List<Student> findExcellentStudent(List<Student> students) {
		List<Student> excellentSudent = new ArrayList<Student>();

		boolean isStudentExcellent;

		int[] progress;
		for (Student s : students) {
			progress = s.getProgress();
			isStudentExcellent = true;

			for (int i = 0; i < progress.length; i++) {
				if (progress[i] < 9) {
					isStudentExcellent = false;
					break;
				}
			}

			if (isStudentExcellent) {
				excellentSudent.add(s);
			}
		}

		return excellentSudent;
	}

}
