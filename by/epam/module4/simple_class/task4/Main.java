package by.epam.module4.simple_class.task4;

/*
 * 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
 * назначения должны быть упорядочены по времени отправления.
 * */

import by.epam.module4.simple_class.task4.Date.*;
import by.epam.module4.simple_class.task4.train.*;

public class Main {

	public static void main(String[] args) {
		Train[] trains = new Train[5];
		TrainInputOutput view = new TrainInputOutput();
		TrainLogic logic = new TrainLogic();

		trains[0] = new Train("Minsk", 3, new Date(12, 50, 10));
		trains[1] = new Train("Paris", 2, new Date(00, 30, 00));
		trains[2] = new Train("Berlin", 1, new Date(20, 15, 10));
		trains[3] = new Train("Minsk", 3, new Date(11, 30, 50));
		trains[4] = new Train("Paris", 4, new Date(23, 15, 10));

		view.printFullInfoAboutMassOfTrian(trains);

		logic.sortByNumber(trains);

		view.printFullInfoAboutMassOfTrian(trains);

		logic.sortByDestinationAndTime(trains);

		view.printFullInfoAboutMassOfTrian(trains);
		
		Train[] selectedTrain;
		
		selectedTrain = logic.getSelectedNumOfTrain(trains, view.waitInt());
		view.printFullInfoAboutMassOfTrian(selectedTrain);
	}
}
