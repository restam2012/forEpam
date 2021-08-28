package by.epam.module4.simple_class.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 * */

public class Main {
	
	public static void main(String[] arg) {
		List<Student> students = new ArrayList<Student>();
		Random random = new Random();
		StudentLogic logic = new StudentLogic();
		StudentView view = new StudentView();
		
		students.add(new Student("Petrov A.A.", 222403, new int[] {4, 10, 8, 4, 9}));
		students.add(new Student("Ivanov I.I.", 222401, new int[] {10, 9, 9, 9, 10}));
		students.add(new Student("Smirnow A.I.", 222402, new int[] {10, 10, 9, 8, 9}));
		students.add(new Student("Popov D.K.", 222404, new int[] {9, 10, 9, 9, 10}));
		
		//Остальных студентов добью в цикле с рандомом
		int[] progress = new int[5];
		for(int i = 0; i < 8; i++) {
			
			for(int j = 0; j < progress.length; j++) {
				progress[j] = random.nextInt(10);
			}
			
			students.add(new Student("Student " + i, 222400 + random.nextInt(10), progress));
		}
		
		List<Student> excellendStudents;
		
		excellendStudents = logic.findExcellentStudent(students);
		
		view.printNameAndGroup(excellendStudents);
	}

}
