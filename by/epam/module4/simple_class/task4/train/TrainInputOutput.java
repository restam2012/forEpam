package by.epam.module4.simple_class.task4.train;

import java.util.Scanner;

import by.epam.module4.simple_class.task4.Date.DateLogic;

public class TrainInputOutput {

	public void printFullInfoAboutMassOfTrian(Train[] trains) {
		for(Train t:trains) {
			printInfoAboutTrain(t);
		}
		System.out.println();
	}

	public void printInfoAboutTrain(Train t) {
		DateLogic dateLogic = new DateLogic();

		System.out.println(t.getDestination() + " " + t.getTrainNum() + " " + dateLogic.getTimeInString(t.getDate()));

	}

	public int waitInt() {
		int num;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter num of train");
		while (true) {
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("You enter not num. Try again.");
			}

			num = scanner.nextInt();
			if (num < 1) {
				System.out.println("Num is not positive. Try again.");
			} else {
				return num;
			}
		}
	}

}
